# 💳 API de Consulta de Créditos – Desafio Técnico

Projeto fullstack com API RESTful em **Spring Boot** e front-end em **Angular**, que permite consultar créditos constituídos com base no número da NFS-e ou número do crédito.

---

## 🔧 Tecnologias Utilizadas

- **Backend**: Java 17, Spring Boot, Spring Data JPA, Hibernate
- **Frontend**: Angular 15+
- **Banco de Dados**: PostgreSQL
- **Mensageria**: Kafka (via Docker)
- **Containerização**: Docker + Docker Compose
- **Testes**: JUnit, Mockito
- **Padrões**: MVC, Repository, Singleton, Factory

---

## 📦 Estrutura do Projeto

 ├── backend/ # Código da API Spring Boot 

 ├── frontend/ # Aplicação Angular 
 
 ├── docker-compose.yml 
  
 └── README.md

---

## 🚀 Como Executar o Projeto

### Pré-requisitos:

- Docker
- Docker Compose
- Node.js + Angular CLI (caso deseje rodar o front manualmente)

---

### 🔁 Subindo tudo com Docker Compose

Na raiz do projeto, execute:

```bash
docker-compose up --build
```

Aguarde os containers subirem. O projeto estará disponível em: http://localhost:4200

- URLs:
- API Backend	http://localhost:8080
- Frontend	http://localhost:4200
- PostgreSQL	localhost:5437 (user: postgres / senha: postgres)
- Kafka	kafka:9092

Ver tópicos e conteúdos Kafka:

- Acessar container do Kafka: 
```bash
docker exec -it kafka bash
```
- Ver tópicos do Kafka: 
```bash
kafka-topics --bootstrap-server kafka:9092 --list
```
- Ler conteúdo do tópico 'consultas-credito': 
```bash
kafka-console-consumer --bootstrap-server kafka:9092 --topic consultas-credito --from-beginning
```