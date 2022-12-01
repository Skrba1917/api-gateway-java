FROM adoptopenjdk/maven-openjdk11
COPY ./ ./
RUN mvn clean package
ENTRYPOINT ["java","-jar","target/api_gateway.jar"]
EXPOSE 8443