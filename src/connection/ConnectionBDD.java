package connection;

import java.sql.*;

public class ConnectionBDD {
	 public static Connection initConnection() 
	 {
		 Connection co = null;
		 String url = "jdbc:mysql://localhost/chatRoomDB";
			 try
		 {
				 Class.forName("org.gjt.mm.mysql.Driver");
				 co = DriverManager.getConnection(url,"root",null);
				 //JOptionPane.showMessageDialog(null,"Connection OK");
		 }
		 catch (ClassNotFoundException fe)
		 {
			 System.out.println("Driver introuvable : " +fe.getMessage());
		 }
		 catch (SQLException se)
		 {
			 System.out.println("Connexion impossible : " +se.getMessage());
		 }
		 return co;  
	 }

}
