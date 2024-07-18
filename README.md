
# 🌟 Data Visualization Dashboard Web Application 🌟

![Dashboard](https://your-image-link-here.png)

This is a sample dashboard website created with Spring Boot for the backend, and Angular,SbAdmin and Thymeleaf for the front-end. This project demonstrates a comprehensive approach to building a data visualization dashboard using provided CSV data.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Data Visualization](#data-visualization)
- [Filters](#filters)
- [Usage](#usage)
- [License](#license)

## 🌟 Overview

This project involves:

- 🚀 Creating a sample web-application and REST microservices using Spring Boot.
- 🎨 Providing frontend with SbAdmin template and Thymeleaf template engine.
- ⚙️ Implementing profiles and properties of Spring Boot.
- 📈 Logging with Logback.
- 🔒 Securing the application with Spring Security.
- 🗄️ Storing data with Spring Data and Hibernate.
- 📊 Visualizing data using interactive charts and graphs.

## ✨ Features

- **Spring Boot Backend**: Robust backend services.
- **SbAdmin and Thymeleaf Frontend**: Elegant and responsive UI.
- **Spring Security**: Secure authentication and authorization.
- **Data Visualization**: Interactive charts and graphs using various charting libraries.
- **Database Integration**: Data stored and retrieved from a database.
- **Filtering Options**: Multiple filters for data visualization.

## 🛠 Technologies Used

- **Backend**: Spring Boot, Spring Data, Hibernate, Spring Security
- **Frontend**: Angular,SbAdmin, Thymeleaf
- **Database**: (choice of MongoDB, PostgreSQL, SQL, MySQL)
- **Chart Libraries**: D3.js, Chart.js, FusionCharts, Plotly.js, Google Charts, Highcharts
- **Logging**: Logback
- **API**: RESTful services with Java/Spring Boot

## 🛠️ Setup and Installation

### Prerequisites

- Java 11 or higher ☕
- Maven 3.6+ 🛠
- Node.js and npm 🌐
- (Your choice of database) 🗄️

```bash
cd company-dashboard
```

### Backend Setup

1. **Install Dependencies**

```bash
mvn clean install
```

2. **Configure Database**

Update `application.properties` with your database configuration.

3. **Run the Application**

```bash
mvn spring-boot:run
```

### Frontend Setup

1. **Navigate to Frontend Directory**

```bash
cd src/main/resources/static
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

### Additional Notes

- Ensure that you have the necessary dependencies installed and configured properly.
- For any issues, please raise an issue in the repository or contact me directly.

Happy Coding! 🎉
