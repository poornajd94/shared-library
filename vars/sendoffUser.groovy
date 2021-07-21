def call(string username = 'null', String designation = 'null') {
	echo "This is shared library greetUser: ${username}"
	pipeline {
		environment {
			USER_NAME = "$username"
			DESG = "${designation}"
		}
		agent any 
		stages {
			stage {
				steps {
					echo "Bye $USER_NAME, Nice meeting you !"
					echo "Designation: $DESG"
				}	
			}
		}
	}
}