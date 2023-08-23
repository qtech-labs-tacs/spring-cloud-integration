#!/bin/bash

compileAndPackageApplicationArtifactsThatIsJar(){
	mvn clean install -DskipTests
}

buildImages(){
	
	cd ./microservice-1
	docker image build -t microservice-1:1 .
	
	cd ../
}


helmDryRun(){

	echo "Deploying on Kubernetes Cluster"
	
	cd ./charts/microservice-1-chart
	helm install --debug --dry-run  --values values-dev.yaml microservice-1-deployment .

	cd ../../
	
}


helmInstall(){

	echo "Deploying"
	
	cd ./charts/microservice-1-chart
	helm install --values values-dev.yaml microservice-1-deployment .

	cd ../../
	
}




_main(){

	echo "------------------------------------------"
	echo " compiling and building jars "
	echo "------------------------------------------"
	
	compileAndPackageApplicationArtifactsThatIsJar
	
	
	echo "------------------------------------------"
	echo " Building Images "
	echo "------------------------------------------"
	
	buildImages

	echo "------------------------------------------"
	echo " Helm Dry Run "
	echo "------------------------------------------"
		
	helmDryRun
	
	echo "------------------------------------------"
	echo " Helm Installing charts "
	echo "------------------------------------------"
	
	helmInstall
	
}



_main


