def call(gradle_action,distname,path) {

 if("${path}" == 'null') {
        error 'Variable path is wrongly is not defined'
    }
    echo "Running ${gradle_action} with"
    sh "mkdir -p dist"
    sh "./gradlew ${gradle_action} --no-daemon"
    path = remove_backslash(path);
        archiveArtifacts artifacts
        : "${path}/${distname}", followSymlinks: false
    }
}

def remove_backslash(path) {
    while("${path}".endWith('/')) {
        path = path.substring(0, path.length() - 1)
    }
    return path
}