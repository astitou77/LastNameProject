package org.adnane.servlets;

import java.io.IOException;
import java.util.Properties;

//import javax.mail.*;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;

@SuppressWarnings("serial")
//@WebServlet("add")
public class EmailServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Get User Inputs from the HTML Form
		String to = req.getParameter("to");
		String subject = req.getParameter("subject");
		String messageText = req.getParameter("message");
		
		System.out.println( req.getParameter("to"));	
		System.out.println( req.getParameter("subject"));	
		System.out.println( req.getParameter("message"));	
		
		
		// SMTP Email - SEND
		String host = "smtp.gmail.com";  //   <--- Activate 2-FA ; Manage Account ; App Password > "ynei vtcl rjca vcki"
		String port = "25";
		
		// ÉQUIPE COURRIEL HÉRITAGE-LEGACY EMAIL TEAM
		// OTMAIL.hc-sc.gc.ca     [Internal Apps]      // Outlook Exchange   // Outlook
		// brightx.hc-sc.gc.ca      [Extenal Apps]    whitelist: SAD-APTOM-DEV

		String username = "astit103@gmail.com";
		String password = "ynei vtcl rjca vcki";

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		
		// 1- SESSION
		Session session = Session.getInstance(props,
			new javax.mail.Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("astit103@gmail.com", "ynei vtcl rjca vcki");
				}
			}
        );
		
		// Try Send an Email
		try {
			// 2- MESSAGE
			System.out.print("Trying to Send an Email...");
			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(messageText);
			
			// 3-- SEND
			System.out.print("Transporting the Email...");
			Transport.send(message);
			
			System.out.print("IT WORKED !!!");
			resp.getWriter().println("Email was sent Successfully");
			
		}catch(MessagingException e) {
			System.out.println("Exception occured: " + e);
		}
		
 
		
	}
	
}


