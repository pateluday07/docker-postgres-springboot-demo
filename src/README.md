# docker-mysql-springboot-demo
![Header](src/main/resources/static/springboot+postgres+docker.png)

This project has been developed to demonstrate how to **dockerize** the **SpringBoot App** and **PostgreSQL database**.

### Requirements To Run Application Without Docker
* JDK 1.8
* PostgreSQL

### Dependencies And Tools Used To Build Application
* Git
* JDK 1.8
* Spring Boot
* data-jpa
* starter-web
* Maven
* Lombok
* MapStruct
* Swagger

**For detailed information refer to pom.xml**

### How to dockerize SpringBoot App & MySQL
**Note: you must have some knowledge of docker as I am not going to explain in detail here, if you have any queries you can ask me.**

* There is a **Dockerfile** in the root directory `docker-postgres-springboot-demo`, this file is used to dockerize the SpringBoot App.

* The last and most important file is **docker-compose.yml**, which is available in the `docker-postgres-springboot-demo` directory, this file contains the configuration which will start the **SpringBoot App** and **PostgreSQL** and make them connected.

### Start the Application with the help of Docker
Go to the `docker-postgres-springboot-demo` directory and execute the following command in the terminal

    docker-compose up
    
And we are done, the **SpringBoot App** will be starting on port **8081** and **PostgreSQL** is on **5434**

Now you can open the swagger to access the APIs: 
[Swagger](http://localhost:8081/swagger-ui/#/)  

Similarly, you can dockerize your application with PostgreSQL.

<p align="center">
  <b>Thank You :)</b>
</p>