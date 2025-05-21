# Spring Boot Config Tips Demo

This project demonstrates the difference between `@Value` and `@ConfigurationProperties` in a Spring Boot application.

## Endpoints

- `/value` — Reads values using `@Value`
- `/config` — Reads values using `@ConfigurationProperties`

## How to Run

```bash
./mvnw spring-boot:run
```

## Why Use `@ConfigurationProperties`

- Cleaner code for multiple values
- Better testing support
- Easier refactoring
- Validation support
