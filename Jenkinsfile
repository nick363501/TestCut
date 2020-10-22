 def jenkinsurl = sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"
pipeline {
    agent any
   // environment {
     
    //}
    stages {
        stage ('Test')  {
          steps { 
           // sh "echo ${env.BUILD_URL} | rev | cut -d '/' -f3- | rev"  
            echo "jenkins URL"
            echo "------------------"
            echo "${jenkinsurl}"
            echo "------------------"
          }
        }
    }
}
