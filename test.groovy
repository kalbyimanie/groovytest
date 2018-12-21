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
			steps{
				sh ''' echo "Passing Check" '''
			}
		}
	}
}