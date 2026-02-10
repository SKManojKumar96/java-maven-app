def buildJar() {
    echo 'building the application....'
    sh 'mvn package'
}

def buildImage() {
    echo 'building the image....'
    withCredentials([usernamePassword(credentialsId: 'dockerhub-id', usernameVariable: 'USER', passwordVariable: 'PASS')]){
        sh 'docker build -t vetri1807/demo-app:jma-1.1 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push vetri1807/demo-app:jma-1.1'
    }
}

def deployApp() {
    echo 'successfully deployed the application....'
}

return this
