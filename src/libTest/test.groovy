def executePipeline(){
    stage('Build'){
        echo "Hello!"
	echo "${TEST_VAR}"
    }
}
