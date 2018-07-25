FROM openjdk:8
WORKDIR /
ADD target/devops-2.0.3.RELEASE.jar devops-2.0.3.RELEASE.jar
EXPOSE 8080
CMD java -jar devops-2.0.3.RELEASE.jar