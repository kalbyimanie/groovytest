pipeline{
	agent {
		node 'master'
	}
	stages {
		stage("A") {
			steps {
				script {
					def int numb=${NUMBER}
					print("${numb}")
					// if("${NUMBER}" == NULL){
					// 	print("NO NUMBER")
					// }
					// else{
					// 	print("NUMBER: ${NUMBER}")
					// }
				}
			}
		}
	}
}