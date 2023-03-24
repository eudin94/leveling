# API de Nivelamento

## Banco de dados:
- Opção 1 - Docker:

 ***Precisa ter o docker instalado***

Abrir um terminal na raíz do projeto e executar o comando:
```
docker-compose up -d
```
O container do MySQL será criado de acordo com as configurações presentes no arquivo "application.yml".

- Opção 2 - MySQL:

Configurar o arquivo "application.yml" de acordo com sua porta e usuário do MySQL:
```
spring:
  application.name: contact-api
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3310/leveling
    username: user
    password: pass123
  flyway:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3310/leveling
    user: user
    password: pass123
```
Trocar **AMBAS** as configurações de datasource e flyway:

**URL:** Trocar a porta para a correspondente da sua máquina e criar a database "leveling"

**USERNAME:** Trocar para seu usuário MySQL

**PASSWORD:** Trocar por sua senha MySQL

## Rodando e testando:
***A API está rodando em Java 17***
- Inicie a api executando o arquivo "Application.java"
- Quando a api terminar a inicialização, acesse o swagger pelo link:

### [Swagger](http://localhost:8080/contact-api/swagger-ui/index.html)
<br>
Através do swagger será possível testar os endpoints criados, de registro e de listagem!