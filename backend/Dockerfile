# Etapa de build
FROM maven:3.9.5-eclipse-temurin-17 AS builder

# Cria o diretório da aplicação
WORKDIR /app

# Copia os arquivos do projeto para o container
COPY pom.xml .
COPY src ./src

# Gera o arquivo .jar
RUN mvn clean package -DskipTests

# Etapa final (imagem menor e otimizada)
FROM eclipse-temurin:17-jre

# Diretório da aplicação
WORKDIR /app

# Copia o JAR gerado da etapa anterior
COPY --from=builder /app/target/local.jar app.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
