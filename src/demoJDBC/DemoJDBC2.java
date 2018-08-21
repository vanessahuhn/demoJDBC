package demoJDBC;

import com.mysql.jdbc.Statement;

public class DemoJDBC2 {

	public static void main(String[] args) {
		//etape 1 : chargement du driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//etape 2 : connexion
		String url = "jdbc:mysql://localhost/formation";
		String user = "root";
		String pwd = "Password29";
		
		Connection cn = DriverManager.getConnection(url,  user,  pwd);
		
		//etape 3 : creation d'un statement
		Statement st = cn.createStatement();
		
		//etape 4 : definir notre requete
		String sql = "SELECT * FROM formation.clients";
		
		//etape 5 : execution de la requete
		ResultSet result = st.executeQuery(sql);
		
	}

}
