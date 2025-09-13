# MARS API - DNCS Global
## Overview

DNCS Global MARS Initiative - API for Project MARS Modules. This Spring Boot application provides REST APIs for managing candidates, jobs, and user operations in the MARS recruitment system.

## Features

- **Candidate Management**: Add and manage candidate profiles
- **Job Queue System**: Track candidates through different stages (Global, WIP, Escalation, Failed, Completed)
- **User Management**: Handle user registration and profile management
- **RESTful APIs**: Clean and well-structured REST endpoints
- **Database Integration**: MySQL for production, H2 for testing

## Technology Stack

- **Java**: 17
- **Spring Boot**: 3.5.4
- **Spring Data JPA**: Database operations
- **MySQL**: Production database
- **H2**: Test database
- **Lombok**: Reduce boilerplate code
- **Maven**: Build tool

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+ (or use the included wrapper)
- MySQL 8.0+ (for production)

### Installation

1. Clone the repository:
```bash
git clone https://github.com/dncsglobal/mars-api.git
cd mars-api
```

2. Build the project:
```bash
./mvnw clean install
```

3. Run the application:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

### Configuration

Create `src/main/resources/application.properties` with your database configuration:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/mars_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

# Server Configuration
server.port=8080
```

## API Endpoints

### Candidates
- `POST /api/candidate` - Add new candidate
- `GET /api/jobqueue/global` - Get all candidates
- `GET /api/jobqueue/wip` - Get candidates in training
- `GET /api/jobqueue/escalation` - Get escalated candidates
- `GET /api/jobqueue/failed` - Get incomplete candidates
- `GET /api/jobqueue/completed` - Get placed candidates

### Users
- `GET /api/users/{id}` - Get user by ID
- `POST /api/users/addUser` - Add new user

## Data Models

### Candidate Status
- `AVAILABLE`, `INTERVIEW_SCHEDULED`, `PLACED`, `ESCALATED`, `INCOMPLETED`, `ON_HOLD`, `MARKETING`, `IN_TRAINING`

### Priority Levels
- `HIGH`, `MEDIUM`, `LOW`

### User Roles
- `ADMIN`, `EMPLOYER`, `CANDIDATE`

## Development

### Running Tests

```bash
./mvnw test
```

### Building for Production

```bash
./mvnw clean package -DskipTests
```

The JAR file will be created in the `target/` directory.

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is proprietary software owned by DNCS Global.

## Support

For support and questions, please contact the DNCS Global development team.

---

**DNCS Global MARS Initiative** - Transforming recruitment through technology.