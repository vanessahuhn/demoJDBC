package demoJDBC;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DemoJDBC2 {

	public static void main(String[] args) {
		//etape 2 : connexion
				String url = "jdbc:mysql://localhost/formation";
				String user = "root";
				String pwd = "Password29";
		
		//etape 1 : chargement du driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = (Connection) DriverManager.getConnection(url,  user,  pwd);
			
			//etape 3 : creation d'un statement
			Statement st = (Statement) cn.createStatement();
			
			//etape 4 : definir notre requete
			String sql = "SELECT * FROM formation.clients";
			
			//etape 5 : execution de la requete
			ResultSet result = st.executeQuery(sql);
			
			//etape 6 : récupérer les résultats
			int ncVar;
			String nomcVar;
			String villeVar;
			
			while (result.next()) {
				//recuperer le "nc"
				ncVar = result.getInt("nc");
				//recuperer le "nomc"
				nomcVar = result.getString("nomC");
				//recuperer "ville"
				villeVar = result.getString("ville");
				
				//affficher une phrase utilisant les résultats
				System.out.println("Numero client : " + ncVar + ", nom client : " + nomcVar + ", ville : " + villeVar);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
