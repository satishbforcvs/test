To set up repo locally run next command:
- mvn clean install
Maven will pull all listed in pom.xml dependencies and build the project.

Next run 'mvn test'. Build will succeed and tests will pass, target folder will be created. 
You can find report in HTML format under target/site/jacoco/index.html

Run Spring Boot application and check next endpoints that are configured/enabled:
  - greeting endpoint GET /
  - health check endpoint GET /actuator/health
  - info endpoint GET /actuator/info
  - prometheus metric GET /actuator/prometheus

More info is in guidelines-from-template.md