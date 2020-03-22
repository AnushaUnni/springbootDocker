# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine as javabuilder
# Set the current working directory inside the image
WORKDIR /app
# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn
# Copy the pom.xml file
COPY pom.xml .
# Copy the project source
COPY src src
# The application's jar file
ARG JAR_FILE=target/simple-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
ADD ${JAR_FILE} simple.jar
# Add Maintainer Info
LABEL maintainer="anushaunni.auau@gmail.com"
# Add a volume pointing to /tmp
#VOLUME /tmp
# Make port 9001 available to the world outside this container
EXPOSE 9000
# Run the jar file
ENTRYPOINT ["java","-jar","simple.jar"]

