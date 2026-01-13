#!/user/bin/env groovy
def call() {
    echo "building a jar..."
   sh 'mvn clean package'
}
