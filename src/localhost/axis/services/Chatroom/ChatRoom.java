/**
 * ChatRoom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package localhost.axis.services.Chatroom;

public interface ChatRoom extends java.rmi.Remote {
    public boolean login(java.lang.String in0) throws java.rmi.RemoteException;
    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException;
    public java.util.Vector getMessages(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getUsersOnline() throws java.rmi.RemoteException;
    public boolean sendMessage(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public int getNumberOfUsersOnline() throws java.rmi.RemoteException;
}
