#### This file is coming from the template repo used for setting up a starter Java Spring Boot project for your needs. 

### Steps to create a Java Spring Boot project and circleci build pipeline
This is a template project for CircleCI Java 11 Spring Boot app build and deploy
- Once you have your project created from this template run 'mvn clean install' or use your IDE to install dependencies.
- This repo contains base tests, to run them use 'mvn test' command or run using your IDE.
- To confirm project is set up properly - run project itself. It runs on port 8080 and GET request to the root '/' returns 'Greetings from Spring Boot!'.
- This template repo contains the following files:
    - `.cirlcleci/config.yml`
        -  circleci pipeline looks for The `config.yml` in '.circleci' folder to create and build the pipeline
    - `Dockerfile`
        - pipeline uses this dockerfile to build Spring Boot app. It uses the base 11-jdk.
    - `pipeline/values.yaml`
        - Jenkins use this file for deploying the apps to 'lab/dev/test/prod' environments  
    - `Jenkinsfile`
        - Jenkinsfile to use the shared pipeline code for deploying apps
    Your project should have these files when you create project using the scratch template and may have to edit these files depending on your project needs.
    - Project specific file/folders
    - config.yml contains multiple jobs to build, publish and deploy the apps
    - lombook.config for lombook
    - dependabot.yml under .github folder contains dependabot settings
    - pipeline/metadata.yaml is template for integration with Harness
    - project-metadata.json - project metadata files. To update them please refer to next sources:
      - https://github.com/aetna-digital-infrastructure/metadata-standards/blob/master/TAG_MANUAL.md
      - https://cvsdigital.atlassian.net/wiki/spaces/EDS/pages/2241888491/DSO+-+Metadata+Standards
- Add project in CircleCI if it has not been added yet.
- Any additional build secrets required for your image can be added to the environment variables in CircleCI or exported directly in the config.yml
- Build should kick off in CircleCI when a pull request is opened against the project repo
- Once pipeline is executed you will see your project added to Snyk, SonarCloud, Twistlock, Checkmarx scanners.
- First time you might see sonar scanner job failed, even your project is been successfully added to SonarCloud and Quality Gate passed. To fix it, just rerun failed job.
- Once your project added to CircleCI and SonarCloud, you need to update badges in README.md file.
- Next endpoints are configured/enabled from the beginning:
  - greeting endpoint GET /
  - health check endpoint GET /actuator/health
  - info endpoint GET /actuator/info
  - prometheus endpoint GET /actuator/prometheus

##GitHub Flow
- GitHub flow is enabled on the projects that allow the semantic versioning `<major version>.<minor version>.<patch version>` of the artifacts by git-tag.sh script in .circleci folder. 
- The branches naming conventions should be as follows:- feature/`<branch name>`, hotfix/`<branch name>` (branches with feature toggles) and hotfix-manual/`<branch name>` (branches without feature toggles). Feature branches update minor version and hotfix branches update patch version. Major versions are updated in git-tag.sh. 
- Branches are merged to master branch except the hotfix-manual branches, the changes in the hotfix-manual branch need to cherry picked into feature branch in order to merge changes to master branch.
## notes

