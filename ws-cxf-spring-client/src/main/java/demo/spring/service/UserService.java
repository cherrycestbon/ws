package demo.spring.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-23T06:14:57.967+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://service.spring.demo/", name = "UserService")
@XmlSeeAlso({ObjectFactory.class})
public interface UserService {

    @WebMethod
    @RequestWrapper(localName = "getUserById", targetNamespace = "http://service.spring.demo/", className = "demo.spring.service.GetUserById")
    @ResponseWrapper(localName = "getUserByIdResponse", targetNamespace = "http://service.spring.demo/", className = "demo.spring.service.GetUserByIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public demo.spring.service.User getUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getAllUsers", targetNamespace = "http://service.spring.demo/", className = "demo.spring.service.GetAllUsers")
    @ResponseWrapper(localName = "getAllUsersResponse", targetNamespace = "http://service.spring.demo/", className = "demo.spring.service.GetAllUsersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<demo.spring.service.User> getAllUsers();
}
