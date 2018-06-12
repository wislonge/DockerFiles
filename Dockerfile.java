FROM java:8
VOLUME /tmp
ADD itmuch/microservice-provider-user:0.0.1-SNAPSHOT
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
