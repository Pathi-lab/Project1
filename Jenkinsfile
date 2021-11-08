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
pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('project-a-workflow.groovy'))
            sandbox()
        }
    }
}
}
