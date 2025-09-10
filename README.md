🚀 Razorpay + Spring Boot Payment System
============================
**Payment Gateway API** 🚀
_A secure and reliable payment processing system for online transactions_

📖 Description
================
The Payment Gateway API is a Java Spring Boot application designed to facilitate secure and efficient online transactions. This project aims to provide a scalable and reliable payment processing system for businesses and individuals. The API integrates with Razorpay, a popular payment gateway, to enable seamless transactions.

The Payment Gateway API is built using Spring Boot, a widely-used framework for building web applications. It utilizes Maven as its build tool, ensuring efficient dependency management and project structure. The API follows standard professional guidelines for coding, testing, and documentation, ensuring maintainability and readability.

The primary goal of this project is to provide a robust and secure payment processing system that can be easily integrated into existing applications. The API offers a range of features, including payment order creation, email notifications, and CORS configuration. With its modular design and well-structured codebase, the Payment Gateway API is an ideal solution for businesses looking to streamline their online payment processes.

✨ Features
================
The Payment Gateway API offers the following features:

1. **Payment Order Creation**: Create payment orders with unique identifiers and track their status.
2. **Email Notifications**: Send automated email notifications to customers and administrators upon payment success or failure.
3. **CORS Configuration**: Configure CORS settings to enable cross-origin resource sharing.
4. **Razorpay Integration**: Seamlessly integrate with Razorpay for secure payment processing.
5. **Payment Order Repository**: Store and retrieve payment orders using a dedicated repository.
6. **Payment Service**: Handle payment-related logic, including order creation and status updates.
7. **Email Service**: Send emails using a dedicated email service.
8. **Security**: Ensure secure payment processing using industry-standard encryption and security protocols.

🧰 Tech Stack Table
======================
| Technology | Description |
| --- | --- |
| **Frontend** | Working |
| **Backend** | Java Spring Boot |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Payment Gateway** | Razorpay |
| **Email Service** | Spring Mail |

📁 Project Structure
======================
The project is structured into the following folders:

* `com.example.paymentgateway`: Main package containing the application's primary classes.
* `com.example.paymentgateway.Controller`: Package containing controller classes, including `PaymentController`.
* `com.example.paymentgateway.Entity`: Package containing entity classes, including `PaymentOrder`.
* `com.example.paymentgateway.Repository`: Package containing repository interfaces, including `PaymentRepo`.
* `com.example.paymentgateway.Service`: Package containing service classes, including `PaymentService` and `EmailService`.
* `com.example.paymentgateway.Configuration`: Package containing configuration classes, including `CorsConfig`.

⚙️ How to Run
================
To run the Payment Gateway API, follow these steps:

1. **Setup**: Install Java 17 or later, Maven 3.8 or later, and a compatible IDE (e.g., Eclipse, IntelliJ IDEA).
2. **Environment**: Set up a Razorpay account and obtain the necessary API keys and credentials.
3. **Build**: Run `mvn clean package` to build the project and create a JAR file.
4. **Deploy**: Deploy the JAR file to a compatible server (e.g., Tomcat, Jetty).


📸 Screenshots
================  
** Postman Api testing **
<img width="1896" height="1006" alt="image" src="https://github.com/user-attachments/assets/5138ae2b-5f9d-4e62-a1c4-0e495df12b47" />  
** Email Notification "'
<img width="1677" height="737" alt="image" src="https://github.com/user-attachments/assets/4bd0d10b-5907-430b-af21-e0c92d1c1b69" />




📦 API Reference
================
The Payment Gateway API offers the following endpoints:

* `POST /payment/create-order`: Create a new payment order.
* `POST /payment/update-status`: Send the mail to Payee

For a detailed API reference, please refer to the [API Documentation](https://example.com/api-docs).

👤 Author
================
The Payment Gateway API was developed by [Ranjan Prasad](https://example.com).

📝 License
================
The Payment Gateway API is licensed under the [MIT License](https://opensource.org/licenses/MIT).
