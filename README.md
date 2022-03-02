# Songr

Songr is a basic Java webapp using Spring MVC, Spring Boot and Thymeleaf and built with Gradle.


## Instructions

Currently there are 4 routes that can be accessed.

- Build from the command line inside the `songr` directorying with `./gradlew bootRun`
  - Setup a Postgres server with a database named "songr" and a table called "album".
  - The `src/main/resources/application.properties` file contains generic user/name password resources change these to match your Postgres server username and password.
- While the app is running direct your web browser to [localhost:8080](http://localhost:8080)
- The root route goes to the Songr app, follow the link at the top to "Album" to get to the [/albums](http://localhost:8080/albums) route.
  - The menu button will bring out a form for adding new albums to the database and displaying on the page.


## Other Routes

- The [/hello](http://localhost:8080/hello) route will conduct a "Hello World".
- The [/capitalize](http://localhost:8080/capitalize/test) route will capitalize the text after the route name in the addess (the link shows "TEST").


