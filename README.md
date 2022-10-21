# K8S Student Lister

## Intoduction

The following repository consists of two micro-services that depend from eachother.

- __Micro-service A:__ The micro-service which will be exposed to our clients. It is implemented using _Gin_, a Go framework.
- __Micro-service B:__ The micro-service consists of the datasource. It's a __Spring Boot__ API, in which we can query the students data.

Both of these micro-services are deployed on a kubernetes cluster, in which they communicate using services!

## Diagram

<p
    align="center"
>
    <img
        src="./assets/diagral.drawio.png" alt="diagram"
    />
</p>
