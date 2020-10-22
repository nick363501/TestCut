pipeline {
    agent any
    environment {
      //JENKINSURL = sh "${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
    }
    stages {
        stage ('Test')  {
          steps { 
            sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
            //echo "jenkins URL"
            //echo "------------------"
            //echo "${env.JENKINSURL}"
            //echo "------------------"
          }
        }ß