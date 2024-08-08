FROM openjdk:22
ADD terget/devops-jenkins.jar devops-jenkins.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/devops-jenkins.jar"]
LABEL authors="ganeshgc"

