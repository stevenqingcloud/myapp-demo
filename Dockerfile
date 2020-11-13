FROM livingobjects/jre8
WORKDIR /home
RUN sleep 1000
COPY ~/.m2/repository/com/mycompany/myapp/myapp/0.0.1-SNAPSHOT/myapp-0.0.1-SNAPSHOT.jar /home
ENTRYPOINT java -jar *.jar
