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
	}
}
