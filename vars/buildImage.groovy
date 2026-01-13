#!/user/bin/env groovy
def call(String imagename) {
  withCredentials([usernamePassword(credentialsId: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                        sh "docker build -t $imagename ."
                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh "docker push $imagename"
                    }
}
