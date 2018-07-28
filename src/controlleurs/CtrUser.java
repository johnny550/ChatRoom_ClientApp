package controlleurs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import connection.ConnectionBDD;

import clientapp.Client1;

public class CtrUser 
{
	
	static int checkMethodeLog;
	
	
	public static int getCheckMethodeLog() {
		return checkMethodeLog;
	}


	public static void checkLogPass() {
		Connection maCo = ConnectionBDD.initConnection();
		
			if (maCo == null) return;
			String req = "Select Pass from users where Login='"+Client1.getTxtLog().getText()+"'";
			
			try
			{
				Statement st = maCo.createStatement();
				ResultSet rs = st.executeQuery(req);
				if (rs.next())
				{
					String pass=rs.getString("Pass");
					char[] mdp=Client1.getTxtMDP().getPassword();
					String chaineMdp=new String(mdp);
					if(pass.equals(chaineMdp))
					{
						//JOptionPane.showMessageDialog(null, "Connection réussie");
						checkMethodeLog=1;
					}
					else
					{
						
						JOptionPane.showMessageDialog(null, "Mot de passe incorrect");
						
					}
				}
				else
				{
					
					JOptionPane.showMessageDialog(null, "Login incorrect");		
				}
				
				}
			catch (SQLException se) 
			{
				System.out.println("impossible d’exécuter la requête");
			}
	}
	
	
	public static void inscription(String log, String pass, boolean online) 
	{
	
		Connection maCo = ConnectionBDD.initConnection();
		if (maCo == null) return;
		
		String  req = "Insert into users(Login,Pass,IsOnline) values (?,?,?)";
		try
		{ 
			maCo = DriverManager.getConnection("jdbc:mysql://localhost/chatroomdb","root","");
			

			// Etape 2 : Création d'un statement
			PreparedStatement pst = maCo.prepareStatement(req);
			//pst.setString(1,idVote);
			pst.setString(1,log);
			pst.setString(2, pass);
			pst.setBoolean(3, false);	
		
			// Etape 3: Exécution requête
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Inscription réussie");
			pst.close();
		}
		catch (SQLException se)
		{
			System.out.println("impossible d’exécuter la requête");
			
		}
	
	}
	
	public static void loginEffect()
	{
		String sql="update users set IsOnline=true where Login='"+Client1.getTxtLog().getText()+"'"; //Date système en sql
	
	 try{
		 
		 Connection maCo = ConnectionBDD.initConnection();
		 maCo = DriverManager.getConnection("jdbc:mysql://localhost/chatroomdb","root","");

		 
		 Statement st = maCo.createStatement();
		 int resultat = st.executeUpdate(sql);
		 //System.out.println(resultat +" ligne(s) modifiée(s)");
		 st.close(); maCo.close();   
		}
		catch(Exception e){
			System.out.println("impossible d’exécuter la requête");
		}
		
	}
	
	 
	 public static void logoutEffect()
		{
			String sql="update users set IsOnline=false where Login='"+Client1.getTxtLog().getText()+"'"; //Date système en sql
		
		 try{
			 
			 Connection maCo = ConnectionBDD.initConnection();
			 maCo = DriverManager.getConnection("jdbc:mysql://localhost/chatroomdb","root","");

			 
			 Statement st = maCo.createStatement();
			 int resultat = st.executeUpdate(sql);
			 //System.out.println(resultat +" ligne(s) modifiée(s)");
			 st.close(); maCo.close();   
			}
			catch(Exception e){
				System.out.println("impossible d’exécuter la requête");
			
		}
}
	
	
			 
	 
	
}
