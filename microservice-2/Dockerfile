FROM openjdk:8u102-jre

WORKDIR /home

COPY target/microservice-2-1.0.jar .

COPY docker-entrypoint.sh docker-entrypoint.sh

RUN chmod +x /home/docker-entrypoint.sh

EXPOSE 8082

ENTRYPOINT ["/home/docker-entrypoint.sh"]
CMD ["microservice-2-1.0.jar"]




