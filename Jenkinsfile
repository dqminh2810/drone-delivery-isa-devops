pipeline {
    agent any

    stages {
        stage('Git') {
            steps {
                git 'https://github.com/dqminh2810/drone-delivery-isa-devops.git'
            }
        }
        stage('Check ENV') {
            steps {
                sh '''
                    echo "Node name is $NODE_NAME"
                    echo "Job name is $JOB_NAME"
                    echo "Current workspace is $WORKSPACE"
                    hostname -I
                    mvn -version
                '''
            }
        }
        stage('Build Maven + Docker') {
            steps {
                sh '''
                    echo "Building..."
                    cd ${WORKSPACE}
                    find . -type f -name "*.sh" -exec chmod +x {} ";"
                    ./build.sh
                '''
            }
        }
        stage('Funtional J2E test') {
            steps {
                sh '''
                    echo "Functional J2E testing..."
                    cd ${WORKSPACE}/j2e
                    mvn test
                '''
            }
        }
        stage('Integration test') {
            steps {
                sh '''
                    echo "Setup integation test env"
                    cd ${WORKSPACE}/docker
                    docker-compose -f docker-compose.service.yaml up -d

                    echo "Integration testing..."
                    cd ${WORKSPACE}/clients/integration_tests_cli
                    mvn test
                '''
            }

			post {
                always {
                    sh '''
                        echo "Clean integration test env"
                        cd ${WORKSPACE}/docker
                        docker-compose -f docker-compose.service.yaml down
                        cd ${WORKSPACE}
                    '''
                }
            }
        }
    }
}
