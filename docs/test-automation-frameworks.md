## Code Quality Integrations
Template repo contains basic unit tests framework with report in HTML format.
To run tests execute next command:
- mvn test
Once run is completed you will see 'BUILD SUCCESS' in console and target folder will appear in project.
To check HTML report you need to open target/site/jacoco/index.html in browser.
Report will show local code coverage.
To configure code coverage for Sonar Cloud you need to use sonar-project.properties
Lombook.config excludes lombook annotations (like getters, setters etc.) and POJO classes from code coverage.
Minimal code coverage for local is set to 75%. To alter it, you have to change value for 'COVEREDRATIO' variable im pom.xml
Otherwise (code coverage is less than 75%) build in CircleCI will fail.
Sonar Cloud Quality Gate rule demands at least 85% code coverage.