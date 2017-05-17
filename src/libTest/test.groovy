def executePipeline(variables){
    stage('Build'){
        echo "Hello!"
	sh "echo '${variables.TEST_VAR}"
    }
}
