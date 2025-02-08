# Contact API

Esta API de Contatos permite que os usuários criem e gerenciem um sistema de agendamento telefonico. 
Com funcionalidades como criacão/Atualização de contatos, buscar contato especifoco ou buscar todos os contatos, ativa e inativa o contato e Favoritar ou desfavoritar contato. 
a API é ideal para desenvolvedores que desejam integrar recursos agendamento telefonico em suas aplicações.

## Tecnologias Utilizadas

- OpenJdk 22.0.1
- Spring Boot 3.4.2
- Java Version 17
- Springdoc OpenAPI 2.8.4
- PostgreSQL
- Docker

## Instalação

Siga os passos abaixo para instalar e configurar o projeto:

1. **Clone o repositório**:
   ```
   git clone https://github.com/joseferreiratechne/contactapi.git
   cd contactapi
   ```

## Verificações e execuções

1. **Verifique se o Docker está instalado**:
Execute o comando abaixo para verificar se o Docker está instalado e funcionando corretamente:
```
docker --version
```

2. Se o Docker não estiver instalado, siga as instruções de instalação para o seu sistema operacional.

3. **Inicie os containers com Docker Compose**:

Execute o comando abaixo para iniciar o container do PostgreSQL.

```
docker-compose up -d
```

4. **Instale as dependências**:

```
mvn install
```

5. **Executo a aplicação**

```
mvn spring-boot:run
```

## Uso
Após iniciar a aplicação, você pode acessar os seguintes endpoints:

Documentação da API: http://localhost:8080/swagger-ui.html
API Docs: http://localhost:8080/v3/api-docs

**Exemplo de Requisição**
```
curl -X GET http://localhost:8080/api/v1/exemplo
```

## Versionamento da API
A API utiliza versionamento na URL. As versões da API são especificadas na URL, permitindo que diferentes versões coexistam. Por exemplo, para acessar a versão 1 da API, utilize o seguinte formato por exemplo:
http://localhost:8080/api/v1/contacts
