# Imagen base para java
FROM openjdk:lastest
COPY . .
RUN ["javac", "ParPrimo.java"]
ENTRYPOINT ["java", "ParPrimo"]

