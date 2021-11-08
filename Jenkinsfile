@Library('my-shared-library') _
import org.jenkinsci.plugins.scriptsecurity.scripts.*
import jenkins.model.Jenkins
  
pipeline {
  agent any
  stages{
    stage("build"){
      steps{
        script {
      def z = new org.foo.Zot()
//z.checkOutFrom("Project2")
      //z.checkOutFrom("Project1")
          def job_dsl_security = j.getExtensionList('javaposse.jobdsl.plugin.GlobalJobDslSecurityConfiguration')[0]
          job_dsl_security.useScriptSecurity = false
        println 'Job DSL script security has changed.  It is now disabled.'
        job_dsl_security.save()
        j.save()
          jobDsl scriptText: 'job("example-5")'

      } 
      }
      }}

}
