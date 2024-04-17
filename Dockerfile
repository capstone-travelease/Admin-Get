FROM openjdk:21

VOLUME /tmp

COPY target/*.jar Get-Services-0.0.1-SNAPSHOT.jar

EXPOSE 16497
ENTRYPOINT ["java","-jar","/Get-Services-0.0.1-SNAPSHOT.jar"]