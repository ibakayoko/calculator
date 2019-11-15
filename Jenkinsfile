pipeline {
     agent any
     stages {
          stage("Compile"){
              steps {
                  sh "./mvnw compile"
              }
          }
          stage("Unit test"){
              steps {
                  sh "./mvnw test -Djacoco.skip=true"
              }
          }
          stage("Code coverage") {
		     steps {
		           sh "./mvnw test -Dmaven.test.skip=true"
                  publishHTML(target: [
                  	reportDir: 'build/reports/jacoco/test/html',
                    reportFiles: 'index.html',
                    reportName: "JaCoCo Report"
                  ])
		          sh "./mvnw verify"
		     }
		 }
     }
}