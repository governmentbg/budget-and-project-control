package bg.infosys.daeu.ws.wsbg.regix;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.soap.Addressing;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@Addressing
@WebService(name = "IRegiXEntryPoint", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRegiXEntryPoint {

    /**
     * 
     * @param request
     * @return
     *     returns bg.government.regixclient.ServiceExecuteResult
     */
    @WebMethod(operationName = "Execute", action = "http://tempuri.org/IRegiXEntryPoint/Execute")
    @WebResult(name = "ExecuteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Execute", targetNamespace = "http://tempuri.org/", className = "bg.infosys.daeu.ws.wsbg.regix.Execute")
    @ResponseWrapper(localName = "ExecuteResponse", targetNamespace = "http://tempuri.org/", className = "bg.infosys.daeu.ws.wsbg.regix.ExecuteResponse")
    public ServiceExecuteResult execute(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        ServiceRequestData request);

    /**
     * 
     * @param argument
     * @return
     *     returns bg.government.regixclient.ServiceResultData
     */
    @WebMethod(operationName = "CheckResult", action = "http://tempuri.org/IRegiXEntryPoint/CheckResult")
    @WebResult(name = "CheckResultResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CheckResult", targetNamespace = "http://tempuri.org/", className = "bg.infosys.daeu.ws.wsbg.regix.CheckResult")
    @ResponseWrapper(localName = "CheckResultResponse", targetNamespace = "http://tempuri.org/", className = "bg.infosys.daeu.ws.wsbg.regix.CheckResultResponse")
    public ServiceResultData checkResult(
        @WebParam(name = "argument", targetNamespace = "http://tempuri.org/")
        ServiceCheckResultArgument argument);

    /**
     * 
     * @param request
     * @return
     *     returns bg.government.regixclient.ServiceResultData
     */
    @WebMethod(operationName = "ExecuteSynchronous", action = "http://tempuri.org/IRegiXEntryPoint/ExecuteSynchronous")
    @WebResult(name = "ExecuteSynchronousResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ExecuteSynchronous", targetNamespace = "http://tempuri.org/", className = "bg.infosys.daeu.ws.wsbg.regix.ExecuteSynchronous")
    @ResponseWrapper(localName = "ExecuteSynchronousResponse", targetNamespace = "http://tempuri.org/", className = "bg.infosys.daeu.ws.wsbg.regix.ExecuteSynchronousResponse")
    public ServiceResultData executeSynchronous(
        @WebParam(name = "request", targetNamespace = "http://tempuri.org/")
        ServiceRequestData request);

}