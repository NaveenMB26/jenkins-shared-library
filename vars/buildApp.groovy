def call(String appName) {

    echo "Starting build for ${appName}"

    sh 'echo Installing dependencies'

    sh 'echo Building application'

    echo "Build completed for ${appName}"
}
