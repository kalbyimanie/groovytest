pipeline{
	agent{
		node{
			label "master"
			// priveleged true		
		}
	}
	stage("Ping Host"){
		steps{
			sh ''' cd $WORKSPACE;chmod +x run.sh;./run.sh '''
		}
	}
}
