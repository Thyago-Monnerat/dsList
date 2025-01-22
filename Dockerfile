# Use uma imagem base do OpenJDK (Java)
FROM openjdk:17-alpine

# Diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo JAR da sua aplicação para o container
COPY target/dslist-0.0.1-SNAPSHOT.jar /app/dslist.jar

# Comando para rodar sua aplicação
ENTRYPOINT ["java", "-jar", "/app/dslist.jar"]

# Exponha a porta em que sua API vai rodar
EXPOSE 8080
