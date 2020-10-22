pipeline {
    agent any
    environment {
        JENKINSURL = sh "echo "${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
    }
    stages {
        stage ('Test')  {
          steps { 
            sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"  
           //  JENKINSURL = sh (
            //    script: 'echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev',
             //   returnStatus: true
             // ) == 0
              
          }
        }
    }
}
