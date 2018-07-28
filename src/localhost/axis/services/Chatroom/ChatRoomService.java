/**
 * ChatRoomService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package localhost.axis.services.Chatroom;

public interface ChatRoomService extends javax.xml.rpc.Service {
    public java.lang.String getChatRoomAddress();

    public ChatRoom getChatRoom() throws javax.xml.rpc.ServiceException;

    public ChatRoom getChatRoom(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
