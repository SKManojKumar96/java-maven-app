def gv

pipeline {
    agent any
    stages {
        stage ("init") {
               steps {
                   script {
                       gv = load 'script.groovy'
                   }
               }
        }
        stage ("build jar") {
            steps {
                script {
                    gv.buildJar()
                }
            }
        }
        stage ("build Image") {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }
        stage ("deploy App") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
