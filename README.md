# Food Delivery System

## Overview
The **Food Delivery System** is a web application designed for placing food orders seamlessly. It features a user-friendly front-end for capturing order details and a robust back-end to process and store these details in a PostgreSQL database. The application is containerized using Docker and can be deployed on platforms like Render for easy access and scalability.

---

## Features

1. **Order Placement:** Users can place orders by providing details like username, food item, price, and quantity.
2. **Responsive Design:** Front-end built with Bootstrap for a modern, responsive UI.
3. **RESTful API:** Handles form submission and database operations.
4. **PostgreSQL Database Integration:** Stores order details securely.
5. **Dockerized Application:** Simplifies deployment and ensures consistent runtime.
6. **Render Deployment Ready:** Optimized for deployment on Render or similar platforms.

---

## Technology Stack

### Front-end
- **HTML5**: Markup structure.
- **CSS**: Styling the interface.
- **Bootstrap 4.5**: Responsive design.
- **JavaScript (Fetch API)**: Asynchronous API calls.

### Back-end
- **Spring Boot**: Framework for building back-end APIs.
- **Java 17**: Programming language.
- **JPA**: Database operations.
- **PostgreSQL**: Database.

### Deployment
- **Docker**: Containerization of the application.
- **Render**: Cloud-based deployment.

---

## Getting Started

### Prerequisites

Ensure you have the following installed:
- **Java 17**
- **Maven**
- **PostgreSQL**
- **Docker**
- **Git**

### Steps to Run Locally

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/food-delivery-system.git
   cd food-delivery-system
   ```

2. **Set Up Database**
   - Create a PostgreSQL database.
   - Update `application.properties` with your database details:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
     spring.datasource.username=your-username
     spring.datasource.password=your-password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build and Run the Application**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the Application**
   Open your browser and navigate to `http://localhost:8080`.

---

## Docker Deployment

### Steps to Dockerize the Application

1. **Create Dockerfile**
   Ensure the root directory has the following `Dockerfile`:
   ```dockerfile
   FROM openjdk:17-jdk-alpine
   WORKDIR /app
   COPY target/food-delivery-system-0.0.1-SNAPSHOT.jar app.jar
   EXPOSE 8080
   ENTRYPOINT ["java", "-jar", "app.jar"]
   ```

2. **Build the Docker Image**
   ```bash
   docker build -t food-delivery-system .
   ```

3. **Run the Docker Container**
   ```bash
   docker run -p 8080:8080 food-delivery-system
   ```

4. **Test the Application**
   Open `http://localhost:8080` in your browser.

---

## Render Deployment

### Steps to Deploy on Render

1. Push your code to GitHub:
   ```bash
   git add .
   git commit -m "Initial commit with Dockerfile"
   git push origin master
   ```

2. Log in to [Render](https://render.com) and create a new web service.
3. Connect your GitHub repository and configure environment variables:
   - `SPRING_DATASOURCE_URL`
   - `SPRING_DATASOURCE_USERNAME`
   - `SPRING_DATASOURCE_PASSWORD`
4. Deploy the application.
5. Access the public URL provided by Render.

---

## API Endpoints

### Place Order
- **POST** `/api/orders/place`
- **Parameters:**
  - `username`: User's name.
  - `productName`: Food item name.
  - `price`: Price of the food item.
  - `quantity`: Quantity of the food item.

---

## Future Enhancements

- **Authentication and Authorization:** Secure user accounts.
- **Order History:** Display past orders for users.
- **Payment Integration:** Include online payment options.
- **Enhanced UI:** Add more features and styles.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

