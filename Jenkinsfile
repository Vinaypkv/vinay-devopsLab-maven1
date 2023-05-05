pipeline {
    agent {
        node {
            label 'java11'
        }
    
    }

    options {
                timestamps()
                buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '2'))
                timeout(time: 240, unit: 'MINUTES')
                disableConcurrentBuilds()
                }

        stages {

            stage ('AppCodeCheckout') {
                steps {

                    git 'https://github.com/Vinaypkv/vinay-devopsLab-maven1.git'

                }
            }
            stage ('CI Build') {

                steps {
                    

                        sh 'mvn clean package'

                    

                     }
    
            }

            stage('Archive and clean workspace') {
                steps {
                    
                    archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
                    cleanWs()
                }

            }
    }
}
