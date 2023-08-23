FROM openjdk:8u102-jre

WORKDIR /home

COPY target/microservice-3-1.0.jar .

COPY docker-entrypoint.sh docker-entrypoint.sh

RUN chmod +x /home/docker-entrypoint.sh

EXPOSE 8081

ENTRYPOINT ["/home/docker-entrypoint.sh"]
CMD ["microservice-3-1.0.jar"]




