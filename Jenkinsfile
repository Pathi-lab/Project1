@Library('my-shared-library') _
import org.jenkinsci.plugins.scriptsecurity.scripts.*
  
pipeline {
  agent any
  stages{
    stage("build"){
      steps{
        script {
      def z = new org.foo.Zot()
//z.checkOutFrom("Project2")
      //z.checkOutFrom("Project1")
      jobDsl targets: 'jenkinsCD.groovy'
      } 
      }
      }}

}
