FROM jboss/base-jdk:8
ADD rango-0.0.1-SNAPSHOT.jar rango-app.jar
ENTRYPOINT ["java", "-jar", "rango-app.jar"]
