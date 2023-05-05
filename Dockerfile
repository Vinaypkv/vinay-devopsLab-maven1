FROM adoptopenjdk/openjdk11:x86_64-alpine-jre-11.0.18_10
VOLUME /tmp
COPY target/vinay-devopsLab-maven-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar app.jar

