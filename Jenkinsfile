pipeline {
    agent any
    //environment {
    //    def jenkinsurl = sh ('echo "${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"')
    //}
    stages {
        stage ('Test')  {
          steps { 
              JENKINSURL = sh (
                script "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev",
                returnStatus: true
              ) == 0
              
          }
        }
    }
}
