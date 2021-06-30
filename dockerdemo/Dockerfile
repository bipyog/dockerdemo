FROM openjdk:8-jdk-alpine
RUN rm -rf /var/cache/apk/* && \
    rm -rf /tmp/*
RUN apk update
RUN apk add --no-cache curl vim wget bash
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV MY_PROP DockerDockerILoveYou
EXPOSE 8090
#CMD ["echo", "\$MY_PROP"]
ENTRYPOINT ["java","-jar","/app.jar", "--my-prop=${MY_PROP}"]

#docker build . -t dockerdemo/my-demo:latest --network=host