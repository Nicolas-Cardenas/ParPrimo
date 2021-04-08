# Imagen base para java
FROM openjdk:8

COPY . .

ENV numuno=1 \
    numdos=5


RUN ["javac", "ParPrimoEnv.java"]

ENTRYPOINT ["java", "ParPrimoEnv"]

