pipeline{
	agent{
		node{
			label "master"
		}
	}
	stages{
		stage("Stage1"){
			steps{
				print "Test Stage1"
			}
		}
		stage("Stage2"){
			steps{
				print "Test Stage2"
			}
		}
		stage("Exec Shell"){
			steps{
				sh '''cd $WORKSPACE;./run.sh'''
			}
		}
	}
}
