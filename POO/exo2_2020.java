import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class exo2_2020 {
    // Information pour la connexion a la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/votre_base_de_données";
    private static final String UTILISATEUR  = "nom_utilisateur";
    private static final String PASSWORD = "Password";

    public static Connection obtenirConnection() {
        Connection connexion = null;
        try{
            // Charger le pilote JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Etablir la connection
            connexion = DriverManager.getConnection(URL, UTILISATEUR, PASSWORD);
            System.out.println("Connexion à la base de données établie");
        } catch(ClassNotFoundException e) {
            System.err.println("Le pilote JDBC MySQL n'a pas été trouvé");
            e.printStackTrace();
        } catch(SQLException e){
            System.err.println("Erreur lors de la connexion à la base de données");
            e.printStackTrace();
        }
        return connexion;
    }
    public static void fermerConnexion(Connection connexion){
        if(connexion != null){
            try{
                connexion.close();
                System.out.println("Connexion a la base de données fermée");
            } catch(SQLException e){
                System.err.println("Erreur lors de la fermeture de la connexion");
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args){
        Connection connexion = obtenirConnection();
        // On peut executer des operations sur la base de données ici

        fermerConnexion(connexion);
    }
    
}
