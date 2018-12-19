pipeline{
	agent {
		node 'master'
	}
	stages {
		stage("A") {
			steps {
				script {
					int numb="${NUMBER}".toInteger()
					for(int i=0;i<=$numb;i++){
						println("GET:[" + i + "]")
					}
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