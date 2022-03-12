FROM circleci/jdk8:0.1.1

COPY ./target/FirstSpringBootProject-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java","-jar","app.jar" ]