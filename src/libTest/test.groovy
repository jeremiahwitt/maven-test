def executePipeline(variables){
    stage('Build'){
        echo "Hello!"
	echo "${variables.TEST_VAR}"
    }
}
