pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile the project
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run unit tests
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                // Package into a JAR
                sh 'mvn package'
            }
        }
        stage('Deploy') {
            steps {
                // Placeholder for deployment
                echo 'Deploy stage - add your deployment steps here'
            }
        }
    }
}
