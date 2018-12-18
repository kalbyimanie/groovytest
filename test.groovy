pipeline{
	agent{
		node{
			label "master"
			// priveleged true		
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
