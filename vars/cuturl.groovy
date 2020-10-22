//{    def jenkinsUrl = sh (
//        "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
//        returnStdout: true
//    ).trim()
//}
def call(String name = 'human') {​​
    // Any valid steps can be called from this code, just like in other// Scripted Pipeline
    echo "Hello, ${​​name}​​."
}​​