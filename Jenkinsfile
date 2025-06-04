pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo '🛠️ Building the application...'
                bat "mvn clean"
            }
        }

        stage('Test') {
            steps {
                echo '✅ Running tests...'
                bat "mvn clean"
            }
        }
        stage('Compile') {
            steps {
                echo '✅ complile tests...'
                bat "mvn compile"
            }


        stage('Deploy') {
            steps {
                echo "🚀 Deploying project..."
                
            }
        }
    }
}
