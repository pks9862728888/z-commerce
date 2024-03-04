# Getting Started <hr />

### To start postgresql server in local (docker) <hr />
```shell
docker run -p 5432:5432 --name zcommercedb -e POSTGRES_PASSWORD=mysecretpassword -d postgres:16.0-alpine
```
**hostname:** localhost <br />
**port:** 5432 <br />
**db:** postgres <br />
**username:** postgres

### To kill already running ps <hr />
```shell
netstat -nlp | grep 5423
```
```shell
kill pid
```

### Reference Documentation <hr />
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.3/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.3/reference/htmlsingle/index.html#web)

### Guides <hr />
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

