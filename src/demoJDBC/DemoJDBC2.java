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
			String sql2 = "SELECT np, nomp\r\n" + 
					"FROM produits\r\n" + 
					"WHERE coul = 'rouge' AND pds > 2000;";
			String sql3 = "SELECT nomr\r\n" + 
					"FROM representants\r\n" + 
					"INNER JOIN ventes\r\n" + 
					"ON representants.nr = ventes.nr\r\n" + 
					"WHERE qt >= 1\r\n" + 
					"GROUP BY nomr;";
			String sql4 = "SELECT nomc\r\n" + 
					"FROM clients\r\n" + 
					"INNER JOIN ventes\r\n" + 
					"ON clients.nc = ventes.nc\r\n" + 
					"WHERE ville = 'Lyon' AND qt > 180\r\n" + 
					"GROUP BY nomc;";
			String sql5 = "SELECT r.nomr, c.nomc \r\n" + 
					"FROM representants r\r\n" + 
					"INNER JOIN ventes ON r.nr = ventes.nr\r\n" + 
					"INNER JOIN clients c ON c.nc = ventes.nc\r\n" + 
					"INNER JOIN produits ON produits.np = ventes.np\r\n" + 
					"WHERE  coul = 'rouge' AND qt > 100\r\n" + 
					"GROUP BY nomc;";
			
			//etape 5 : execution de la requete
			ResultSet result = st.executeQuery(sql);
						
			//etape 6 : récupérer les résultats
			int ncVar;
			String nomcVar;
			String villeVar;
			
			while (result.next()) {
				//recuperer le "nc"_numéro de client
				ncVar = result.getInt("nc");
				//recuperer le "nomc"_nom du client
				nomcVar = result.getString("nomC");
				//recuperer "ville"
				villeVar = result.getString("ville");
				
				//affficher une phrase utilisant les résultats
				System.out.println("Numero client : " + ncVar + ", nom client : " + nomcVar + ", ville : " + villeVar);
			}
			
			ResultSet result2 = st.executeQuery(sql2);
			
			int npVar;
			String nompVar;
			
			//afficher les numéros et les noms des produits de couleur rouge et de poids supérieur à 2000
			while (result2.next()) {
				//recuperer le "np"_numéro du produit
				npVar = result2.getInt("np");
				//recuperer le "nomp"_nom du produit
				nompVar = result2.getString("nomP");
				
				//affficher une phrase utilisant les résultats
				System.out.println("Produits de couleur rouge et de poids supérieur à 2000 : " + npVar + " (numéro du produit) " + nompVar + " (nom du produit)");
			}
			
			ResultSet result3 = st.executeQuery(sql3);
			
			String nomrVar;
			
			//afficher les représentants ayant vendu au moins un produit
			while (result3.next()) {
				//recuperer le "nomR"_nom du preprésentant
				nomrVar = result3.getString("nomR");
				
				//affficher une phrase utilisant les résultats
				System.out.println( nomrVar + " est un représentant ayant vendu au moins un produit." );
			}
			
			ResultSet result4 = st.executeQuery(sql4);
			
			// afficher les nom des clients de Lyon ayant acheté un produit pour une quantité supérieure à 180

			while (result4.next()) {
				//recuperer le "nomC"_nom du client
				nomcVar = result4.getString("nomC");
				
				//affficher une phrase utilisant les résultats
				System.out.println( nomcVar + " est un client habitant Lyon et  ayant acheté un produit pour une quantité supérieur à 100." );
			}
			
			ResultSet result5 = st.executeQuery(sql5);
			
			
			// afficher les noms des représentants et des clients à qui ces représentants ont vendu un produit de couleur rouge pour une quantité supérieure à 100
			while (result5.next()) {
				//recuperer le "nomC"_nom du client
				nomcVar = result5.getString("nomC");
				//recuperer le "nomR"_nom du preprésentant
				nomrVar = result5.getString("nomR");
				
				//affficher une phrase utilisant les résultats
				System.out.println( nomrVar + " a vendu un produit de couleur rouge pour une quantité supérieure à 100 à " + nomcVar + ".");
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
