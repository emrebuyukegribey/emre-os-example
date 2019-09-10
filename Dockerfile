FROM  java:8
EXPOSE 8080
ADD /target/emre-os-example.jar emre-os-example.jar
ENTRYPOINT ["java","-jar","emre-os-example.jar"]