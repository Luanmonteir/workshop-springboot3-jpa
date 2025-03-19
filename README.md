# Workshop Spring Boot 3 com JPA

Este projeto é uma aplicação de exemplo desenvolvida durante um estudo sobre Spring Boot 3 e JPA. O objetivo é demonstrar a implementação de operações CRUD (Criar, Ler, Atualizar, Deletar) utilizando Spring Data JPA com um banco de dados relacional.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória para testes)
- **Maven** (gerenciamento de dependências)

## Pré-requisitos

- Java 21 instalado
- Maven 3 instalado

## Como Executar a Aplicação

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/Luanmonteir/workshop-springboot3-jpa.git
Navegue até o diretório do projeto:

bash
Copiar
Editar
cd workshop-springboot3-jpa
Execute a aplicação utilizando o Maven:

bash
Copiar
Editar
mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

Endpoints Disponíveis
A aplicação expõe os seguintes endpoints para gerenciamento de entidades:

GET /api/v1/entities: Retorna uma lista de todas as entidades.
GET /api/v1/entities/{id}: Retorna uma entidade específica pelo ID.
POST /api/v1/entities: Cria uma nova entidade.
PUT /api/v1/entities/{id}: Atualiza uma entidade existente pelo ID.
DELETE /api/v1/entities/{id}: Deleta uma entidade pelo ID.
Substitua "entities" pelo nome da entidade que está sendo gerenciada.

Configuração do Banco de Dados
Por padrão, a aplicação está configurada para utilizar o banco de dados H2 em memória. As configurações podem ser encontradas no arquivo application.properties:​

properties
Copiar
Editar
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
Para utilizar outro banco de dados, como MySQL ou PostgreSQL, ajuste as propriedades acima conforme necessário.​

Referências
Documentação do Spring Boot
Guia do Spring Data JPA
Exemplo de Aplicação Spring Boot 3 com REST API
