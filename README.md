# Maven-Spring-Boot-Hibernate-Project
### This is a Maven Spring Boot Hibernate project that utilizes JDK 17 and stores data directly into a MySQL database using JPA repository. This project allows you to create and consume RESTful services, which can be used to access and manipulate the data stored in the MySQL database.

#### To run this project, follow the steps below:
1. Clone the repository using the following command:
    ```
    git clone https://github.com/Kartikkumar-Anil-Mahindrakar/Maven-Spring-Boot-Hibernate-Project.git
    ```
2. Configure the MySQL database:
* Create a new database in MySQL using the command line or a MySQL client tool of your choice.
* Update the application.properties file located in the src/main/resources directory with the database connection details such as `spring.datasource.url`, `spring.datasource.username` and `spring.datasource.password`.
3. Run the project by finding the class with main method
4. Once the project is running, you can access the RESTful services using a REST client tool such as Postman or by visiting the URLs directly in a web browser.
   #### *POST http request for adding new employee* ```http://localhost:8080/api/employees```
   #### *GET http request for getting employee with id* ```http://localhost:8080/api/employees/{id}```
   #### *GET http request for getting list of all employees* ```http://localhost:8080/api/employees```
   #### *PUT http request for updating employee with id* ```http://localhost:8080/api/employees/{id}```
   #### *DELETE http request for deleting employee with id* ```http://localhost:8080/api/employees/{id}```

#### This project can be used as a starting point for building your own Spring Boot Hibernate projects that utilize RESTful services and JPA repository for storing and manipulating data in MySQL databases.
