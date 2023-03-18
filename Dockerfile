#FROM openjdk:8
#COPY ./target/Calculator_DevOps-1.0-SNAPSHOT.jar ./
#WORKDIR ./
#CMD ["java", "-cp", "Calculator_DevOps-1.0-SNAPSHOT.jar", "Calculator"]

FROM openjdk:8
COPY ./target/Calculator_DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator_DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]

