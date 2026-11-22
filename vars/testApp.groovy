
def call(String appName) {

    echo "Starting tests for ${appName}"

    sh 'echo Running unit tests'

    sh 'echo Running integration tests'

    echo "Testing completed for ${appName}"
}
