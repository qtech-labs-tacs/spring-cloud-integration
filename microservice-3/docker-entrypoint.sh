#!/bin/sh

APP_FILE=${1}

echo Starting ${APP_FILE}


runMicroservice(){
		java $JAVA_OPTS -jar -Dspring.profiles.active=${profile} /home/${APP_FILE}
}


_main(){
	runMicroservice

}

#Execution starts from here
_main
