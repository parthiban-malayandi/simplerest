pipeline {
    agent any
    environment {
    		DOCKERHUB_CREDENTIALS=credentials('dockerhub-cred-mine')
    	}
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
                sh "sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'"
                sh "docker push practacc/simple-rest"
           }
        }
    }
}