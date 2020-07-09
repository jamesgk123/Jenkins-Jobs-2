node ("slavea") {
  stage(shell commands){
     sh '''
        uptime
	hostname
	'''
   }
 }
