def call(gradle_action,distname) {
   echo "Running ${gradle_action} with"
    sh "./gradlew ${gradle_action} --no-daemon"
    archiveArtifacts artifacts: "dist/${distname}"
    return "success"
}
