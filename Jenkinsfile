pipeline {
    agent any

    environment {
        // Example environment variables
        PROJECT_NAME = 'Google'
        DEPLOY_ENV = 'staging'
        EMAIL_RECIPIENTS = 'vishal.singh@arcgate.com'
    }

    stages {
        stage('Build') {
            steps {
                echo '🛠️ Building the application...'
          
            }
        }

        stage('Test') {
            steps {
                echo '✅ Running tests...'
                
            }
        }

        stage('Deploy') {
            steps {
                echo "🚀 Deploying project"
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline succeeded.'
            mail to: "${vishal.singh@arcgate.com}",
                 subject: "✅ ${Google} - Build Successful",
                 body: "The build, test, and deployment of ${Google} completed successfully."
        }
        failure {
            echo '❌ Pipeline failed.'
            mail to: "${vishal.singh@arcgate.com}",
                 subject: "❌ ${Google} - Build Failed",
                 body: "The pipeline for ${gOOGLE} has failed. Please check the Jenkins logs."
        }
    }
}
