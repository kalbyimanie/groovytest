pipeline{
	agent{
		node{
			label "master"	
		}
	}
	stages{
		stage("Ping Host"){
			steps{
				sh ''' cd $WORKSPACE;chmod +x run.sh;./run.sh '''
			} 
		}
	}
}



