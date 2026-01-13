#!/user/bin/env groovy
def call() {
  withCredentials([usernamePassword(credentialsId: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                        sh 'docker build -t pradeepchouhan115/docker.repo:jma-2.4 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh 'docker push pradeepchouhan115/docker.repo:jma-2.4'
                    }
}
