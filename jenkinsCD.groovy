pipelineJob('testseed') {
    definition {
        cps {
            //script(readFileFromWorkspace('project-a-workflow.groovy'))
            sandbox()
        }
    }
}
