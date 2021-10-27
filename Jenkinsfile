@Library('my-shared-library@main') _
pipeline {
  agent none
  stages{
    stage("build"){
      script {
      def z = new com.util.utils()
      z.checkOutFrom("Project1")
      }      
      }}
}
