pipeline {
    agent any
    stages{
        stage("Build"){
            steps{
                sh "mvn clean package"
            }
        }

        stage("Push Docker"){
            steps{
                sh "docker push"
            }
        }

    }
}