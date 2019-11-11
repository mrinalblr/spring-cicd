pipeline {
  agent any
   environment{
       mavenHome = tool name: 'usr/local/maven', type: 'maven'	
       mavenCMD = "${mavenHome}/bin/mvn"
       dockerHubRegistry = 'mrdeo/get-started'
       dockerImage = ''
        
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

                }
         }
        stage('Building Image'){
                steps{
                    echo 'Building the docker image'
                    dockerImage = docker.build dockerHubRegistry + ":BUILD_NUMBER"
                }
        }
     }
  }
