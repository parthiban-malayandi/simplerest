pipeline {
    agent any
    stages{
        stage("Build"){
            steps{
                sh "mvn clean package"
            }
        }

        stage("Build Docker Image"){
            steps{
                sh "docker build -t practacc/simple-rest ."
            }
        }
        stage("Push Docker"){
            steps{
                sh "docker push practacc/simple-rest"
           }
        }
    }
}