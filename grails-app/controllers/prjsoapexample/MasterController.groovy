package prjsoapexample

import groovyx.net.ws.WSClient

class MasterController {

	def index = {conversion() }
	
		def conversion = {
			def proxy = new WSClient("http://localhost:8080/prjSoapExample/services/master?wsdl", this.class.classLoader)
			proxy.initialize()
			println "Addition :::"+ proxy.addition(10,20)
			println "Substraction :::"+ proxy.substraction(10,20)
			println "Multiplication :::"+ proxy.multiplication(10,20)
			println "Division :::"+ proxy.division(20,10)
			println "Show Message :::"+ proxy.showmessage("Hello Kruti")
		}
	
}
