FROM livingobjects/jre8
WORKDIR /home
RUN sleep 1
COPY /build-data/myapp/myapp-0.0.1-SNAPSHOT.jar /home
ENTRYPOINT java -jar *.jar
