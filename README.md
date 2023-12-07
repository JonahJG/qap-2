# qap-2 README

## Introduction
Welcome to the Aircraft Management System! This project provides a simple and intuitive way to manage information about airports, aircraft, passengers, and cities. The application is built using Spring Boot and utilizes Spring Data JPA for easy integration with a relational database.

## Features
- **Aircraft Management:** Keep track of different aircraft, including their type, airline, number of passengers, and associated airports and passengers.
- **Airport Information:** Manage airport details such as name, code, and the city it belongs to.
- **City Details:** Store information about cities, including name, state, population, and associated airports.
- **Passenger Records:** Maintain passenger records, including first name, last name, phone number, and the city they reside in.

## Running the Application

### Prerequisites
- Java Development Kit (JDK) installed
- Docker installed (for running the application in a Docker container)

### Steps
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/JonahJG/qap-2.git
   cd qap-2
   ```

2. **Build the Application:**
   ```bash
   ./mvnw clean install
   ```

3. **Run the Application:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Access the API:**
   - The application will be accessible at [http://localhost:8080].

5. **Run in Docker:**
   - Build the Docker image:
     ```bash
     docker build -t keyin/qap-2 .
     ```
   - Run the Docker container:
     ```bash
     docker-compose up
     ```

## Using RepositoryRestResource
This project leverages Spring Data REST's `RepositoryRestResource` annotations to automatically expose RESTful endpoints for entities (e.g., Aircraft, Airport, City, Passenger). This eliminates the need for manually creating controllers and mappings.

### Usage in Postman:
  - **Aircraft Endpoints:**
  - List all aircraft: `GET http//:localhost:8080/aircraft`
  - Find aircraft by ID: `GET http//:localhost:8080/aircraft/{id}`
  - Find aircraft by type: `GET http//:localhost:8080/aircraft/search/findByType?type={type}`
  - Find aircraft by airline name: `GET http//:localhost:8080/aircraft/search/findByAirlineName?airlineName={airlineName}`
  - Find aircraft by number of passengers: `GET http//:localhost:8080/aircraft/search/findByNumberOfPassengers?numberOfPassengers={numberOfPassengers}`
  - Find aircraft by airport ID: `GET http//:localhost:8080/aircraft/search/findByAirport_Id?airportId={airportId}`
  - Find aircraft by passenger ID: `GET http//:localhost:8080/aircraft/search/findByPassengers_Id?passengerId={passengerId}`

- **Airport Endpoints:**
  - List all airports: `GET http//:localhost:8080/airport`
  - Find airport by ID: `GET http//:localhost:8080/airport/{id}`
  - Find airport by name: `GET http//:localhost:8080/airport/search/findByName?name={name}`
  - Find airport by code: `GET http//:localhost:8080/airport/search/findByCode?code={code}`

- **City Endpoints:**
  - List all cities: `GET http//:localhost:8080/city`
  - Find city by ID: `GET http//:localhost:8080/city/{id}`
  - Find city by name: `GET http//:localhost:8080/city/search/findByName?name={name}`
  - Find cities by state: `GET http//:localhost:8080/city/search/findByState?state={state}`
  - Find cities by population: `GET http//:localhost:8080/city/search/findByPopulation?population={population}`
  - Find cities by airport ID: `GET http//:localhost:8080/city/search/findByAirports_Id?airportId={airportId}`

- **Passenger Endpoints:**
  - List all passengers: `GET http//:localhost:8080/passenger`
  - Find passenger by ID: `GET http//:localhost:8080/passenger/{id}`
  - Find passengers by first name: `GET http//:localhost:8080/passenger/search/findByFirstName?firstName={firstName}`
  - Find passengers by last name: `GET http//:localhost:8080/passenger/search/findByLastName?lastName={lastName}`
  - Find passengers by phone number: `GET http//:localhost:8080/passenger/search/findByPhoneNumber?phoneNumber={phoneNumber}`

## Conclusion
The Aircraft Management System is a straightforward and user-friendly application for managing aircraft-related information. Feel free to explore the provided RESTful API and utilize the endpoints for seamless data retrieval and manipulation. 

Happy coding! ✈️🚀
