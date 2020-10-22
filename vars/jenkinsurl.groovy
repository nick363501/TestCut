{
    def jenkinsurl = sh (
        "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
        returnStdout: true
    ).trim()
}