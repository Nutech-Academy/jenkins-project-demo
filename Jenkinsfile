pipeline{
    agent any
    tools{
        maven "maven"
    }
    stages{
        stage("Build"){
            steps{
                sh "mvn compile"
            }
        }
        stage("Test"){
            steps{
                sh "mvn test"
                sh "sleep 90"
            }
        }
        stage("Artifact"){
            steps{
                sh "mvn clean package"
            }
        }
    }
}
