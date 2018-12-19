pipeline{
	agent {
		node 'master'
	}
	stages {
		stage("A") {
			steps {
				script {
					print "${NUMBER}"
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