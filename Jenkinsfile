pipeline {
    agent any
    stages {
        stage ('Test')  {
          steps { 
              sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
              //echo jenkinsURL = sh 'echo "${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"'
          }
        }
    }
}