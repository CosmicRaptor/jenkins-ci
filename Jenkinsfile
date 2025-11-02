pipeline {
    agent any // Run on any available Jenkins agent

    tools {
        // Assumes you've configured Maven in Jenkins > Global Tool Configuration
        maven 'MyMaven' 
    }

    environment {
        PATH = "/usr/local/bin:${env.PATH}"
    }

    stages {
        stage('1. Checkout Code') {
            steps {
                // Pulls the code from your Git repo (links to Topic 1)
                echo 'Code was checked out by the SCM job configuration.'
            }
        }

        stage('2. Build & Test Java App') {
            steps {
                // Runs the Java build and tests (links to Topic 2)
                sh "mvn clean package" 
            }
        }

        stage('3. Build Docker Image') {
            steps {
                script {
                    // Builds the Docker image from your Dockerfile (links to Topic 4)
                    echo "Building Docker image..."
                    sh "docker build -t my-practical-app:latest ."
                }
            }
        }

        stage('4. Deploy Docker Container') {
            steps {
                script {
                    // This stops and removes any old container before running a new one
                    echo "Deploying new container..."
                    sh "docker stop my-app-container || true"
                    sh "docker rm my-app-container || true"

                    // Runs your app as a container (links to Topic 5)
                    sh "docker run -d -p 8080:8080 --name my-app-container my-practical-app:latest"
                }
            }
        }
    }

    post {
        always {
            echo "Pipeline finished."
            // Good practice to clean up the Maven artifacts
            cleanWs() 
        }
    }
}