pipeline {
  agent any
   environment{
         mavenCMD = "usr/local/maven"
      }
     stages {
        stage('Init'){
           steps{
              echo 'Initializing the pipeline'
           }
        }
        stage('SCM Checkout'){
                steps{
                   echo 'Initializing the pipeline with GIT repository SC'
                   git 'https://github.com/mrinalblr/spring-cicd.git'
                }
            }
        stage('Build'){
                steps{
                    echo 'Building the Jar '
                    sh "${mavenCMD} clean package"
                    sh 'docker build . -t deomrinal/spring-cicd:1.0.0'
                }
         }
     }
  }
