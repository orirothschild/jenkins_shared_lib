package org.foo
def build_gradle() {
   echo 'Running build automation'
    sh './gradlew build --no-daemon'
    archiveArtifacts artifacts: 'dist/trainSchedule.zip'}

return this
