pipeline {
    agent any

    environment {
        PROJECT_NAME = 'Google'
        DEPLOY_ENV = 'staging'
        EMAIL_RECIPIENTS = 'vsingh2590@gmail.com'
    }

    stages {
        stage('Build') {
            steps {
                echo '🛠️ Building the application...'
                // Add build steps here
            }
        }

        stage('Test') {
            steps {
                echo '✅ Running tests...'
                // Add test steps here
            }
        }

        stage('Deploy') {
            steps {
                echo "🚀 Deploying project..."
                // Add deployment steps here
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline succeeded.'
            mail(
                to: "${env.EMAIL_RECIPIENTS}",
                subject: "✅ ${env.PROJECT_NAME} - Build Successful",
                body: "The build, test, and deployment of ${env.Google} completed successfully."
            )
        }
        failure {
            echo '❌ Pipeline failed.'
            mail(
                to: "${env.EMAIL_RECIPIENTS}",
                subject: "❌ ${env.Google} - Build Failed",
                body: "The pipeline for ${env.Google} has failed. Please check the Jenkins logs."
            )
        }
    }
}
