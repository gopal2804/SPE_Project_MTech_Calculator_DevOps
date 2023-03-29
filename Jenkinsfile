
pipeline {
	//agent any is a directive in a Jenkins pipeline that specifies where the pipeline will be executed. 
	//In this case, it is set to "any", which means that the pipeline can be executed on any available agent or node. 
	//The agent or node is the environment where the pipeline will run, and it can be a physical machine, a virtual machine, or a container. 
	//By setting agent any, the pipeline can run on any available agent that meets the specified requirements for the pipeline.
	agent any

    stages {
        stage('Git Pulling Stage') {
            steps {
                //this stage clone the github repository 
		git url: 'https://github.com/gopal2804/SPE_Project_MTech_Calculator_DevOps.git',branch: 'master',credentialsId: 'GitCredential'
            }
        }
        stage('Maven Build Stage') {
            steps {
                // this stage build the project and create the jar file
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image Stage') {
            steps {
		//this stage build the docker image of your code. 
		//This command builds a Docker image for a calculator project and tags it with the name "gopal2804/calculator_project". 
		//. specifies the current directory
                sh 'docker build -t gopal2804/calculator_project .'
            }
        }
        stage('Publish Docker Image Stage') {
            steps {
                withDockerRegistry([ credentialsId: "docker", url: "" ]) {
		    // this stage push the build image in the docker hub 
                    sh 'docker push gopal2804/calculator_project'
                }
            }
        }
        stage('Clean Docker Image Stage') {
            steps {
		//thiis stage clear any pre publiished image
                sh 'docker rmi -f gopal2804/calculator_project'
            }
        }
        stage('Deploy and Run Image'){
            steps {
		//this stage deploy and run the docker image using ansible
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }

    }

    
}
