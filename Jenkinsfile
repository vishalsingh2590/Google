pipeline {
    agent any

    environment {
        PROJECT_NAME = 'Google'
        DEPLOY_ENV = 'staging'
        EMAIL_RECIPIENTS = 'vishal.singh@arcgate.com'
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
                body: "The build, test, and deployment of ${env.PROJECT_NAME} completed successfully."
            )
        }
        failure {
            echo '❌ Pipeline failed.'
            mail(
                to: "${env.EMAIL_RECIPIENTS}",
                subject: "❌ ${env.PROJECT_NAME} - Build Failed",
                body: "The pipeline for ${env.PROJECT_NAME} has failed. Please check the Jenkins logs."
            )
        }
    }
}
