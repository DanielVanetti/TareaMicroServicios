#Establecer la imagen de Docker para JavaRuntime
FROM openjdk:21-jdk-slim
#Copiar el archivo al contenedor
COPY target/client-0.0.1-SNAPSHOT.jar client-0.0.1-SNAPSHOT.jar

#Commandos para ejecutar el jar
ENTRYPOINT ["java","-jar","client-0.0.1-SNAPSHOT.jar"]