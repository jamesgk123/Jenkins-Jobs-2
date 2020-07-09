node (slavea){
     stage ("shell command") {
     sh label: '', script: '''uptime
                              hostname'''
   }
}
