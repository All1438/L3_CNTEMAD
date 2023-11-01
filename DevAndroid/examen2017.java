import java.util.ArrayList;
import java.util.Scanner;

class Etudiant{
    // Attribut
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    // Constructeur
    public Etudiant(String matricule, String nom, String prenom, int age){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    // Getteur
    public String getMatricule(){
        return matricule;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Matricule: " + matricule + ", Nom: " + nom + ", Prenom: " + prenom + ", Age: " + age;
    }
}

public class examen2017 {
    public static void main(String[] args){
        ArrayList<Etudiant> listeEtudiants = new ArrayList<>();//  peut contenir des objets de la classe Etudiant, ArrayList<>() = qui est vide au début
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n Options:");
            System.out.println("1 - Ajouter un étudiant");
            System.out.println("2 - Afficher tous les étudiants");
            System.out.println("3 - Rechercher un étudiant par matricule");
            System.out.println("4 - Supprimer un étudiant par matricule");
            System.out.println("5 - Quiter");
            System.out.print("Choisissez un option: ");

            int option = scanner.nextInt();
            
            if (option == 1) {
                System.out.print("Matricule de l'étudiant : ");
                String matricule = scanner.next(); // scanner.next() = lit la prochaine série de caractère jusqu'a ce qu'elle rencontre un espace blanc
                System.out.print("Nom de l'étudiant : ");
                String nom = scanner.next();
                System.out.print("Prénom de l'étudiant : ");
                String prenom = scanner.nextLine();
                System.out.print("Âge de l'étudiant : ");
                int age = scanner.nextInt();

                Etudiant etudiant = new Etudiant(matricule, nom, prenom, age);
                listeEtudiants.add(etudiant); // .add est un fonction de Array
                System.out.println("Étudiant ajouté avec succès!");
            } else if (option == 2) {
                System.out.println("\nListe des étudiants :");
                for (Etudiant etudiant : listeEtudiants) {
                    System.out.println(etudiant);
                }
            } else if (option == 3) {
                System.out.print("Entrez le matricule de l'étudiant à rechercher : ");
                String matricule = scanner.next();
                boolean found = false;
                for (Etudiant etudiant : listeEtudiants) {
                    if (etudiant.getMatricule().equalsIgnoreCase(matricule)) {
                        System.out.println("Étudiant trouvé : " + etudiant);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Aucun étudiant trouvé avec ce matricule.");
                }
            } else if (option == 4) {
                System.out.print("Entrez le matricule de l'étudiant à supprimer : ");
                String matricule = scanner.next();
                Etudiant etudiantToRemove = null;
                for (Etudiant etudiant : listeEtudiants) {
                    if (etudiant.getMatricule().equalsIgnoreCase(matricule)) {
                        etudiantToRemove = etudiant;
                        break;
                    }
                }
                if (etudiantToRemove != null) {
                    listeEtudiants.remove(etudiantToRemove);
                    System.out.println("Étudiant supprimé avec succès!");
                } else {
                    System.out.println("Aucun étudiant trouvé avec ce matricule.");
                }
            } else if (option == 5) {
                System.out.println("Programme terminé.");
                break;
            } else {
                System.out.println("Option non valide. Réessayez.");
            }
        }
    }
}


