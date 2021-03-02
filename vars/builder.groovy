def call(gradle_action,distname) {
   echo "Running ${build} with"
    sh "./gradlew ${build} --no-daemon"
    archiveArtifacts artifacts: "dist/${distname}"
    return "success"
}
