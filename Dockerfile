FROM livingobjects/jre8
WORKDIR /home
RUN sleep 20000
COPY /build-data/myapp-0.0.1-SNAPSHOT.jar /home
ENTRYPOINT java -jar *.jar
