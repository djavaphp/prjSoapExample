package prjsoapexample

import groovyx.net.ws.WSClient

class MasterController {

	def index = {conversion() }
	
		def conversion = {
			def proxy = new WSClient("http://localhost:8080/prjSoapExample/services/master?wsdl", this.class.classLoader)
			proxy.initialize()
			println "proxy :::"+ proxy.addition(10+20)			
		}
	
}
