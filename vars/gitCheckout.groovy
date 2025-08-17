def call(Map config) {
    echo "Checking out from ${config.url} at branch ${config.branch}"
    // if (config.branch == "main") {
    //     checkout([
    //         $class: 'GitSCM',
    //         branches: [[name: "*/${config.branch}"]],
    //         userRemoteConfigs: [[url: config.url, credentialsId: config.credentialId]]
    //     ])
    // } else {
    //     echo "Checking out from ${config.branch}, which is not a valid branch"
    // }
}
