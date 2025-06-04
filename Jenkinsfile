pipeline {
    agent any

    tools {
    maven 'Maven 3.6.3'
  
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
