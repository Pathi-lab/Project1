@Library('my-shared-library') _
pipeline {
  agent any
  stages{
    stage("build"){
      steps{
        script {
      def z = new org.foo.Zot()
z.checkOutFrom("Project2")
      //z.checkOutFrom("Project1")
        }
      } 
      }}
  job('example') {
  steps {
    shell('echo Hello World!')
  }
}
}
