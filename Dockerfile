FROM centos:latest
RUN yum install -y \
       java-11-openjdk \
       java-11-openjdk-devel
ADD target/transunion-demo-project.jar transunion-demo-project.jar
EXPOSE 8073
ENTRYPOINT ["java", "-jar", "/transunion-demo-project.jar"]
