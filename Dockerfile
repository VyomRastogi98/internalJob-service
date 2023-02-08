FROM openjdk:8
ADD /target/internalJob-service-0.1.jar internaljob.jar
ENTRYPOINT ["java","-jar","/internaljob.jar"]