pipeline {
    agent any

    tools {
        maven 'Maven_3.8.6'  // This should exactly match the name from Jenkins config
    }

    stages {
        stage('Build') {
            steps {
                echo '🛠️ Building the application...'
                bat 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                echo '✅ Running tests...'
                bat 'mvn test'
            }
        }
        stage('Compile') {
            steps {
                echo '✅ Compiling the tests...'
                bat 'mvn compile'
            }
        }
        stage('Deploy') {
            steps {
                echo '🚀 Deploying project...'
            }
        }
    }
}
