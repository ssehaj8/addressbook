# addressbook
 The Address Book App is a RESTful backend service built using Spring Boot that allows users to store, update, delete, and retrieve contact information. It's a simple yet powerful backend for managing an address book digitally.
 
## Key Features
 Add new contacts

 Update existing contacts

 Delete contacts

 Fetch individual or all contacts

 Validates data before storing

 RESTful APIs with standard status responses

 ## Tech Stack
 | Technology    | Purpose                         |
| ------------- | ------------------------------- |
| Java 21       | Programming Language            |
| Spring Boot   | REST API framework              |
| Lombok        | Boilerplate reduction           |
| Hibernate JPA | ORM (Object Relational Mapping) |
| H2 / MySQL    | In-memory or persistent DB      |
| Maven         | Build tool                      |
| Swagger       | API documentation (optional)    |

## API Workflow (Step-by-Step)
User (Frontend/API Client)

[1] Sends request via HTTP (e.g., Add contact)

Spring Boot Controller

[2] Maps request to endpoint (e.g., POST /addressbook)

   └── Validates DTO fields

Service Layer

    
[3] Applies business logic

   └── Passes data to Repository

Repository Layer (JPA)

    
[4] Persists/retrieves data using H2 or MySQL

Database

    
[5] Returns data or confirmation


Service → Controller → Frontend

    
[6] JSON response is sent back

## Sample API Endpoints
| Method | Endpoint                   | Description         |
| ------ | -------------------------- | ------------------- |
| POST   | `/addressbook/add`         | Add new contact     |
| GET    | `/addressbook/getAll`      | Fetch all contacts  |
| GET    | `/addressbook/get/{id}`    | Fetch contact by ID |
| PUT    | `/addressbook/update/{id}` | Update contact      |
| DELETE | `/addressbook/delete/{id}` | Delete contact      |

