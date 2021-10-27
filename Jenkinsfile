@Library('my-shared-library') _
pipeline {
  agent none
  stages{
    stage("build"){
      script {
      def z = new com.util.Utils()
      z.checkOutFrom("Project1")
      }      
      }}
}
