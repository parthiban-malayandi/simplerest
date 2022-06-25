pipeline {
    agent any
    stages{
        stage("Build"){
            steps{
                dir ../
                sh "mvn clean package"
            }
        }

        stage("Push Docker"){
            steps{
                sh "docker build -t practacc/simple-rest ."
            }
        }

    }
}