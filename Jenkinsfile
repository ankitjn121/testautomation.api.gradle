pipeline {
    agent any

    environment {
        TEST_PREFIX = "test-IMAGE"
    }

    stages {
        stage("Clone Git Repository") {
            steps {
                git(
                    url: "https://github.com/ankitjn121/testautomation.api.gradle",
                    branch: "master",
                    changelog: true,
                    poll: true
                )
            }
        stage('Integration Test') {
            when {
                branch 'master'
            }

            steps {
            echo 'Run integration tests here...'
                sh "gradle test"
            }
        }

    }
}
