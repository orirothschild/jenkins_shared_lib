def call(gradle_action,distname) {
   echo "Running ${gradle_action} with"
   sh "mkdir -p dist"
   sh "./gradlew ${gradle_action} --no-daemon"
    archiveArtifacts artifacts: "dist/${distname}", followSymlinks: false
}
