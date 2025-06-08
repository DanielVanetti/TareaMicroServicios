#Establecer la imagen de Docker para JavaRuntime
FROM openjdk:21-jdk-slim
#Copiar el archivo al contenedor
COPY target/eureka-0.0.1-SNAPSHOT.jar eureka-0.0.1-SNAPSHOT.jar

#Commandos para ejecutar el jar
ENTRYPOINT ["java","-jar","eureka-0.0.1-SNAPSHOT.jar"]