package com.creditease.monitorframework.fat.client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.5 2015-06-20T09:33:27.312+08:00 Generated source version: 2.6.5
 * 
 */
@WebService(targetNamespace = "http://service.fat.monitorframework.creditease.com/", name = "TestService")
@XmlSeeAlso({ ObjectFactory.class })
public interface TestService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "echo", targetNamespace = "http://service.fat.monitorframework.creditease.com/", className = "com.creditease.monitorframework.fat.client.Echo")
    @WebMethod
    @ResponseWrapper(localName = "echoResponse", targetNamespace = "http://service.fat.monitorframework.creditease.com/", className = "com.creditease.monitorframework.fat.client.EchoResponse")
    public String echo();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "echoFault", targetNamespace = "http://service.fat.monitorframework.creditease.com/", className = "com.creditease.monitorframework.fat.client.EchoFault")
    @WebMethod
    @ResponseWrapper(localName = "echoFaultResponse", targetNamespace = "http://service.fat.monitorframework.creditease.com/", className = "com.creditease.monitorframework.fat.client.EchoFaultResponse")
    public String echoFault();
}
