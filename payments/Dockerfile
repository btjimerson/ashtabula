FROM maven:3.8.7-eclipse-temurin-19 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM eclipse-temurin:19
RUN apt-get update
RUN wget https://get.helm.sh/helm-v3.9.3-linux-amd64.tar.gz
RUN tar xvf helm-v3.9.3-linux-amd64.tar.gz
RUN mv linux-amd64/helm /usr/local/bin
RUN rm helm-v3.9.3-linux-amd64.tar.gz
RUN rm -rf linux-amd64
RUN helm repo add yugabytedb https://charts.yugabyte.com
RUN helm repo update
WORKDIR /opt
EXPOSE 8080
COPY --from=build /home/app/target/*.jar /opt/app.jar
CMD java -jar /opt/app.jar