# Client Side Load Balancing with Ribbon and Spring Cloud

This is the server component (spring boot rest project) for the example that showcases the client Side Load Balancing with Ribbon and Spring Cloud.
 
## Technologies

1. Spring Boot (spring-boot-starter-web, spring-boot-starter-tomcat)
2. Java 8
3. Tomcat 8.5
4. Maven
 
## Exposed methods

**1. Get a greeting string. HTTP Method: GET**
```
http://localhost:8090/greetingserver/greeting
```

**2. Home. HTTP Method: GET**
```
http://localhost:8090/greetingserver/
```

## How to run it

**1. Maven**
```
 mvn spring-boot:run
```
