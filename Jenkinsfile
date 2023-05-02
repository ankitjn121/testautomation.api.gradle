pipeline {
    agent any

    environment {
        TEST_PREFIX = "test-IMAGE"
    }

    stages {

        stage('Integration Test') {
            when {
                branch 'release'
            }

            steps {
            echo 'Run integration tests here...'
                sh "gradle test"
            }
        }

    }
}