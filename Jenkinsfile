pipeline {
    agent any
    //environment {
      def JENKINSURL = sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
    //}
    stages {
        stage ('Test')  {
          steps { 
           // sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"  
            echo "jenkins URL"
            echo "------------------"
            echo "${JENKINSURL}"
            echo "------------------"
          }
        }
    }
}
