JSP (Java Servlet Pages) Demo 
* HTTP requests: GET (Search) & POST (Save) 
* SMTP requests: POST Emails

> sudo apt install git

> cd ~/Desktop

> git clone https://github.com/astitou77/LastNameProject

Install MySQL, add DB with appropriate credentials
> sudo apt install mysql-server

> mysql> mysql -u root -p

> mysql> ALTER USER 'root'@'localhost' IDENTIFIED BY 'l84w0rk'

> mysql> CREATE DATABASE helloDB;

> mysql> CREATE TABLE employees (first_name VARCHAR(255), last_name VARCHAR(255))

> mysql> EXIT


Download Eclipe IDE for 'Web'
https://www.eclipse.org/downloads/packages/

Open 'HelloWorld' Project in Eclipse IDE
> ./eclipse

Update DBConnection.java with correct DB credentials

Ex.: "jdbc:mysql://localhost:3306/helloDB", "debian-sys-maint", "IOTYffNlqJY5Rrf6"


Run the Project 'as a Server' (Add Tomcat Server if prompted)

Try the app in a Browser !

http://localhost:8080/HelloWorld


TODOs:
* SSL/TLS: HTTP(S) encryption (***Soon)
* Solr Search: GET requests (***Soon)
* LDAP Authentication requests (***Soon)
* Ansible *.yml Playbook to automate (***Soon)
* Jenkins CI/CD pipeline  (***Soon)



Enjoy !
