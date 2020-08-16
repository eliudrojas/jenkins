pipelineJob('pipelinJob'){
	definition {
		cps {
			script(readFileFromWorkspace('pipelineJob.groovy'))
			sandbox()
		}
	}
}