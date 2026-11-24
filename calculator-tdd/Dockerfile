# Etapa 1: compilar con Maven (si fallan los tests, no se genera la imagen)
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B clean package

# Etapa 2: imagen final con solo Java y las clases compiladas
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/classes ./classes
ENTRYPOINT ["java", "-cp", "classes", "com.zubirimanteo.devops.App"]
