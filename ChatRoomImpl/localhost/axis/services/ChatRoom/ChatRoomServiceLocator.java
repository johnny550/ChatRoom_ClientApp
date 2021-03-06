/**
 * ChatRoomServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package localhost.axis.services.ChatRoom;

public class ChatRoomServiceLocator extends org.apache.axis.client.Service implements localhost.axis.services.ChatRoom.ChatRoomService {

    public ChatRoomServiceLocator() {
    }


    public ChatRoomServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChatRoomServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChatRoom
    private java.lang.String ChatRoom_address = "http://localhost:8080/axis/services/ChatRoom";

    public java.lang.String getChatRoomAddress() {
        return ChatRoom_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChatRoomWSDDServiceName = "ChatRoom";

    public java.lang.String getChatRoomWSDDServiceName() {
        return ChatRoomWSDDServiceName;
    }

    public void setChatRoomWSDDServiceName(java.lang.String name) {
        ChatRoomWSDDServiceName = name;
    }

    public localhost.axis.services.ChatRoom.ChatRoom getChatRoom() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChatRoom_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChatRoom(endpoint);
    }

    public localhost.axis.services.ChatRoom.ChatRoom getChatRoom(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.axis.services.ChatRoom.ChatRoomSoapBindingStub _stub = new localhost.axis.services.ChatRoom.ChatRoomSoapBindingStub(portAddress, this);
            _stub.setPortName(getChatRoomWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChatRoomEndpointAddress(java.lang.String address) {
        ChatRoom_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.axis.services.ChatRoom.ChatRoom.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.axis.services.ChatRoom.ChatRoomSoapBindingStub _stub = new localhost.axis.services.ChatRoom.ChatRoomSoapBindingStub(new java.net.URL(ChatRoom_address), this);
                _stub.setPortName(getChatRoomWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ChatRoom".equals(inputPortName)) {
            return getChatRoom();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/axis/services/ChatRoom", "ChatRoomService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/axis/services/ChatRoom", "ChatRoom"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChatRoom".equals(portName)) {
            setChatRoomEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
