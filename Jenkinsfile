@Library('my-shared-library') _
pipeline {
  agent any
  stages{
    stage("build"){
      steps{
        script {
      def z = new org.foo.Zot()
//z.checkOutFrom("Project2")
      //z.checkOutFrom("Project1")
          jobDsl scriptText: 'job("example-2")'
              jobDsl removedJobAction: 'DELETE',
           removedViewAction: 'DELETE',
           lookupStrategy: 'SEED_JOB',
           additionalClasspath: ['libA.jar', 'libB.jar'].join('\n'),
           additionalParameters: [message: 'Hello from pipeline', credentials: 'SECRET']
        }
      } 
      }}

}
