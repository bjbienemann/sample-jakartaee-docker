# sample-jakartaee-docker
A sample of the maven docker plugin with Jakarta EE and Apache TomEE.

### Docker
To build:
<pre><code>mvn clean package tomee:exec docker:build</code></pre>
To run:
<pre><code>docker run --name sample -p 8080:8080 -e JAVA-OPS='-Xmx100m' sample-jakartaee-docker</code></pre>
To test:
<pre><code>curl -X GET http://localhost:8080/sample/resource/host</code></pre>

### Docker Compose
To up:
<pre><code>docker-compose up -d</code></pre>
To test:
<pre><code>curl -X GET http://localhost/sample/resource/host</code></pre>
To down:
<pre><code>docker-compose down</code></pre>

### References
* [Jakarta EE and Docker: What You Should Know](https://dzone.com/articles/jakarta-ee-and-docker-what-you-should-know)
