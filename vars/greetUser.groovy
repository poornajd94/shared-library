def call(string username = 'null') {
	echo "This is shared library greetUser: ${username}"
	pipeline {
		environment {
			USER_NAME = "$username"
		}
		agent any 
		stages {
			stage {
				steps {
					echo "Hi $USER_NAME, How are you !"
				}	
			}
		}
	}
}