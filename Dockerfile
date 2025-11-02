# Stage 1: Use a lightweight Java image
FROM openjdk:17-slim

# Set a volume for temporary files
VOLUME /tmp

# Define an argument for the JAR file path
ARG JAR_FILE=target/*.jar

# Copy the built JAR file from the 'target' directory into the container
COPY ${JAR_FILE} app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]