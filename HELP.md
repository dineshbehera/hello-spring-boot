# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.oned.hello-spring-boot' is invalid and this project uses 'com.oned.hellospringboot' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#actuator)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)


## Commands :
* mvn clean package 
* docker build -t dineshbehera/hello-spring-boot:latest .
* docker push dineshbehera/hello-spring-boot:latest

* docker login --> login to docker hub

* docker pull <<image path>>
<br>
  docker pull dineshbehera/hello-spring-boot
* docker run -d -p [host_port]:[container_port] –name [container_name] [image_id/image_tag]
    <br>
  docker run -d -p 8080:8080 --name hello-spring-boot dineshbehera/hello-spring-boot:latest

  open http:localhost:8080

## For kubernetes :
* kubectl -n developemnt get nodes -o wide
* kubectl -n development get deployments -o wide
* kubectl -n development get pods -o wide
* kubectl -n development get services -o wide


* kubectl -n development create deployment hello-spring-boot-manual --image=dineshbehera/hello-spring-boot:latest

 or

 * kubectl -n development create -f k8.yaml

* deploy manually

* kubectl -n development get services

we can see that our service "hello-spring-boot" is running, but the external IP address is <pending>. To expose the service, execute that command below.
* minikube -n development service hello-spring-boot

  open URL

* kubectl -n development get pods
* kubectl -n development logs <<pod name>>


