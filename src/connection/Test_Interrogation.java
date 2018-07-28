package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class Test_Interrogation
{
	public static void main (String[] args)
	{
		Connection maCo = ConnectionBDD.initConnection();
		if (maCo == null) return;
		String req = "Select * from users";
		try
		{
			Statement st = maCo.createStatement();
			ResultSet rs = st.executeQuery(req);
			while (rs.next())
			{
				System.out.println("login : "+rs.getString("Login")+" mdp: "+ rs.getString("Pass"));
			}
			rs.close(); st.close(); maCo.close();
		}
		catch (SQLException se)
		{
			System.out.println("impossible d’exécuter la requête");
		}
	}
}


