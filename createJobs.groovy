pipelineJob('pipelinJob'){
	definition {
		cps {
			script(readFileFromWorkspace('pipelineJob.groovy'))
			sandbox()
		}
	}
}

pipelineJob('theme-park-job') {
	definition {
		cpsScm {
			scm {
				git {
					remote {
						url 'https://github.com/eliudrojas/ThemeRidePark.git'
					}
					branch 'master'
				}
			}
		}
	}
}