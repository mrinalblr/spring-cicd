pipeline {
  agent any
   environment{
       mavenHome = tool name: 'usr/local/maven', type: 'maven'	
       mavenCMD = "${mavenHome}/bin/mvn"
       dockerHubRegistry = 'mrdeo/spring-cicd'
       dockerHubCredentials = 'dockerhubcred'
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
                    script{
                        dockerImage = docker.build dockerHubRegistry + ":latest"
                     }

                }
        }
        stage('Publish to Docker Hub'){
                steps{
                    echo 'Publishing the docker image to docker hub'
                    script{
                        docker.withRegistry('',dockerHubCredentials){
                         dockerImage.push()
                        }
                    }
                }
        }
        stage('Deploying to local docker'){
                steps{
                    echo 'Deploying to locally running docker'
                    echo "${dockerImage}"
                    sh "docker run -d -p 8083:8082 --name stackfortech mrdeo/spring-cicd:latest"
                }
        }

     }
  }
