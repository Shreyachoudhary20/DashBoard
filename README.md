
🌟 Data Visualization Dashboard Web Application 🌟
PROTOTYPE:
![Dashboard](![Screenshot 2024-07-19 151110](https://github.com/user-attachments/assets/c997c6f4-9391-4a57-b150-f2cd672f8239)
)

This project is a sophisticated web application designed for data visualization, integrating a Spring Boot backend with Node.js and Express.js, and utilizing React.js for the frontend. The dashboard employs MongoDB for data storage and leverages Chart.js for dynamic and interactive data visualization.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Data Visualization](#data-visualization)
- [Filters](#filters)
- [Usage](#usage)
- [Challenges](#challenges)
- [Accomplishments](#accomplishments)
- [License](#license)

## 🌟 Overview

This project involves:

- 🚀 **Backend Development**: Utilizing Spring Boot for REST microservices, and Node.js with Express.js for additional backend services.
- 🎨 **Frontend Development**: Employing React.js engine for a modern and responsive UI.
- 🗄️ **Database Management**: Using MongoDB for data storage and retrieval.
- 📈 **Data Visualization**: Creating interactive charts and graphs with Chart.js.
- 🔒 **Security**: Implementing secure authentication and authorization with Spring Security.

## ✨ Features

- **Spring Boot Backend**: Robust backend services with RESTful APIs.
- **Node.js and Express.js**: Additional backend services for handling data retrieval and processing.
- **React/ Angular Frontend**: Modern and responsive user interface.
- **Spring Security**: Secure authentication and authorization mechanisms.
- **MongoDB Integration**: Data stored and retrieved from a MongoDB database.
- **Chart.js Visualization**: Interactive charts and graphs.
- **Dynamic Filters**: Multiple filters for detailed data exploration.

## 🛠 Technologies Used

- **Backend**: Spring Boot, Spring Data, Hibernate, Spring Security, Node.js, Express.js
- **Frontend**: React
- **Database**: MongoDB
- **Chart Libraries**: Chart.js
- **API**: RESTful services with Java/Spring Boot and Node.js/Express.js
- **Logging**: Logback (for Java backend)

## 🛠️ Setup and Installation

### Prerequisites

- Java 11 or higher ☕
- Maven 3.6+ 🛠
- Node.js and npm 🌐
- MongoDB 🗄️

### Backend Setup

1. **Install Dependencies**

   Navigate to the backend directory and install dependencies:

   ```bash
   cd backend
   mvn clean install
   ```

2. **Configure Database**

   Update `application.properties` with your MongoDB configuration.

3. **Run the Java Backend**

   ```bash
   mvn spring-boot:run
   ```

4. **Install Node.js Dependencies**

   Navigate to the Node.js backend directory and install dependencies:

   ```bash
   cd ../node-backend
   npm install
   ```

5. **Run Node.js Backend**

   ```bash
   npm start
   ```

### Frontend Setup

1. **Navigate to Frontend Directory**

   ```bash
   cd ../frontend
   ```

2. **Install Dependencies**

   ```bash
   npm install
   ```

3. **Run Frontend**

   ```bash
   npm start
   ```

## 📊 Data Visualization

### Important Variables to be Visualized

- Intensity 🔥
- Likelihood 💡
- Relevance 🎯
- Year 📅
- Country 🌍
- Topics 📚
- Region 🌎
- City 🏙

### Visualization Examples

![Dashboard Example](![Screenshot 2024-07-19 143003](https://github.com/user-attachments/assets/35f14160-3a88-451f-94fa-857590cc1e45)
)
![Dashboard Example](![Screenshot 2024-07-19 144902](https://github.com/user-attachments/assets/cf3f644f-c854-4719-9c0e-da93c94b7c22)
)
![Dashboard Example](![Screenshot 2024-07-19 143018](https://github.com/user-attachments/assets/dd73a03c-dc89-4a09-9fc1-7a318928babd)
)
![Dashboard Example](https://your-image-link-here.png)

## 🔍 Filters

- End Year Filter 🗓️
- Topics Filter 📚
- Sector Filter 🏢
- Region Filter 🌎
- PEST Filter 📊
- Source Filter 📰
- SWOT Filter 📈
- Country Filter 🌍
- City Filter 🏙
- Any other relevant filters 📌

## 🚀 Usage

1. **Access the Dashboard**

   Navigate to `http://localhost:8080` to access the dashboard.

2. **Interactive Visualizations**

   Use the filters to explore different aspects of the data through interactive graphs and charts.

## 🏆 Challenges

- **Data Integration**: Combining data from different sources and ensuring compatibility between MongoDB, Spring Boot, and Node.js.
- **Performance Optimization**: Ensuring that the dashboard performs efficiently with large datasets and complex queries.
- **Cross-Technology Compatibility**: Ensuring smooth interaction between Spring Boot, Node.js, Angular, and Chart.js.
- **Security Implementation**: Securing the application with robust authentication and authorization mechanisms.
- **User Experience**: Designing an intuitive and responsive UI that provides a seamless experience for data exploration and visualization.

## 🎉 Accomplishments

- **End-to-End Integration**: Successfully integrated Spring Boot, Node.js, and MongoDB with a unified frontend.
- **Dynamic Data Visualization**: Created interactive and visually appealing charts and graphs with Chart.js.
- **Robust Backend**: Developed a scalable backend with both Java and Node.js for handling diverse data operations.
- **User-Friendly Interface**: Implemented a responsive and aesthetically pleasing UI with Angular, SbAdmin, and Thymeleaf.
- **Effective Data Filtering**: Developed comprehensive filtering options to enhance data analysis and visualization.

## 📝 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
Happy Coding !!
