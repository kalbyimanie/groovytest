pipeline{
	agent {
		node 'master'
	}
	stages {
		stage("A") {
			steps {
				sh ''' chmod +x run.sh; ./run.sh '''
				}
			}
		}
		stage("Check") {
			script{
				try{
					sh ''' ./run.sh '''
				}catch(error){
					throw error
				}
			}
		}
		stage("B"){
			script{
				println("Processing stage B")
			}
		}	
	}
}