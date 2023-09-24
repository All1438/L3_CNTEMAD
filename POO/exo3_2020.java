import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class exo3_2020 {
    private static final String URL = "jdbc:mysql://localhost:3306/FORMATION";
    private static final String UTILISATEUR = "nom_utilisateur";
    private static final String PASSWORD = "mot_de_passe";
    public static Connection getConnection(){
        Connection connexion = null;
        try{
            //Chargement du pilote JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Etablissement de la connexion
            connection = DriverManager.getConnection(URL, UTILISATEUR, PASSWORD);
            System.out.println("Connexion à la base de données établie.");
        } catch(ClassNotFoundException e){
            System.err.println("Erreur: Pilote JDBC non trouvé.");
            e.PrintStackTrace();
        } catch(SQLException e){
            System.err.println("Erreur: Imposible de ce connecté à la base de données.");
            e.PrintStackTrace();
        }
        return connexion;
    }
    public static void closeConnection(Connection connexion){
        if(connexion != null){
            try{
                connexion.close();
                System.out.println("Connexion à la base de données fermé.");
            } catch(SQLException e){
                System.err.println("Erreur de la fermeture de la connexion");
            }
        }
    }

    public static void main(String[] args) {
        Connection connexion = null;
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            // Etablissement de la connexion
            connex  ion = DriverManager.getConnection(URL, UTILISATEUR, PASSWORD);
            // Création des tables (vous devez écrire les requêtes CREATE TABLE appropriées)
            Statement statement = connexion.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Enseignant (MatriEns INT, NomEns VARCHAR(255), PrenomEns VARCHAR(255), ...)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Matiere (IdMati INT, NomMati VARCHAR(255), MatriEns INT, ...)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Etudiant (NumEtud INT, NomEtud VARCHAR(255), PrenomEtud VARCHAR(255), ...)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Former (IdMatiere INT, NumEtudiant INT, DebutFormation DATE, FinFormation DATE, ...)");

            // Insertion de trois enregistrements dans la table Etudiant (vous devez écrire les requêtes INSERT INTO appropriées)
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO Etudiant (NumEtud, NomEtud, PrenomEtud, ...) VALUES (?, ?, ?, ...)");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Étudiant 1");
            preparedStatement.setString(3, "Prénom 1");
            preparedStatement.executeUpdate();yyyyyyyyyyyyyyyyyyyy

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Étudiant 2");
            preparedStatement.setString(3, "Prénom 2");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Étudiant 3");
            preparedStatement.setString(3, "Prénom 3");
            preparedStatement.executeUpdate();

            // Affichage de la liste des étudiants qui n'ont pas encore participé à une formation
            Statement selectStatement = connexion.createStatement();
            ResultSet resultSet = selectStatement.executeQuery("SELECT * FROM Etudiant e LEFT JOIN Former f ON e.NumEtud = f.NumEtudiant WHERE f.IdMatiere IS NULL");
            System.out.println("Liste des étudiants sans formation :");
            while (resultSet.next()) {
                int numEtudiant = resultSet.getInt("NumEtud");
                String nomEtudiant = resultSet.getString("NomEtud");
                String prenomEtudiant = resultSet.getString("PrenomEtud");
                System.out.println("Numéro : " + numEtudiant + ", Nom : " + nomEtudiant + ", Prénom : " + prenomEtudiant);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Erreur : Pilote JDBC non trouvé.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erreur : Impossible de se connecter à la base de données.");
            e.printStackTrace();
        } finally {
           closeConnection(connexion);
        }
    }
}
