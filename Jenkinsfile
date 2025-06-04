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
                bat "mvn test"
            }
        }

        stage('Compile') {
            steps {
                echo '✅ Compiling code...'
                bat "mvn compile"
            }
        }

        stage('Deploy') {
            steps {
                echo "🚀 Deploying project..."
                // Add actual deployment command here
            }
        }
    }
}
