@Library('TestCut@master') _
pipeline {
    agent any
    stages {
        stage ('Test')  {
          steps { 
//             sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
            echo "JenkinsFile Output"
            cuturl()
          }
        }
    }
}
