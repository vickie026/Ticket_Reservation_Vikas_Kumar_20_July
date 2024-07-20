# Ticket_Reservation_Vikas_Kumar_20_July

The bus reservation system portal is a web-based application that enables users to book bus tickets online. The system will allow users book available buses based on their source and destination cities, reserve the seats, and make payments securely. The system will also provide a UI based dashboard for admin to manage their bus related operations.


## Features

 * User and Admin authentication & validation with session uuid.

#### Admin Features:

    - Administrator Role of the entire application
    - Only registered admins with valid session token can add/update/delete route and bus from main database
    - Admin can access the details of different users and reservations.
#### User Features:
    - Registering themselves with application, and logging in to get the valid session token
    - Viewing list of available buses and booking a reservation
    - Only logged in user can access his reservations, profile updation and other features.

<br>

## Modules

* Login, Logout Module
* Admin Module
* User Module
* Route Module
* Bus Module
* Reservation Module

## 🏷️ Tech Stack Used :-
* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 DB

## Installation & Run

* Before running the API server, you should update the database config inside the [application.properties] file. 
* Update the port number, username and password as per your local database config.

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

      #ORM s/w specific properties
      spring.jpa.hibernate.ddl-auto=update
      spring.jpa.show-sql=true

```

## API Root Endpoint

`https://localhost:8082/`
 
`http://localhost:8082/swagger-ui/index.html`

