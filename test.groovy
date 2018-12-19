pipeline{
	agent {
		node 'master'
	}
	stages {
		stage("A") {
			steps {
				script {
					if($NUMBER == NULL){
						print("NO NUMBER")
					}
					else{
						print("NUMBER: $NUMBER")
					}
				}
			}
		}
	}
}