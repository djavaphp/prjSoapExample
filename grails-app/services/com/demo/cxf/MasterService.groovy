package com.demo.cxf

import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult
import javax.jws.WebService
import org.grails.cxf.utils.EndpointType

import org.grails.cxf.utils.GrailsCxfEndpoint
@WebService(portName = "MasterServicePort",
	 serviceName = "MasterService",
	  name = "MasterService",
	   targetNamespace = "http://www.google.com")
class MasterService {
	
	static expose = [EndpointType.JAX_WS_WSDL]
	
    @WebMethod
	int addition(int value1 , int value2) {		
		int sum =  value1+value2		
		return sum
	}
    
}
