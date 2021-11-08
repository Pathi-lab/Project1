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
          //def signature = 'new groovy.json.JsonSlurperClassic'
//org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)
toApprove = ScriptApproval.get().getPendingScripts().collect()
toApprove.each {pending -> ScriptApproval.get().approveScript(pending.getHash())}
          jobDsl scriptText: 'job("example-4")'
      } 
      }
      }}

}
