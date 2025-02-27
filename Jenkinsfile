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
                sh "ls > file.txt"
            }
        }
        stage("Artifact"){
            steps{
                sh "mvn clean package"
            }
        }
    }
}
