import java.util.Scanner;
public class Poo_2020 {
    // Attributs
    private String nom;
    private String matierePrincipale;
    private double prix;
    private String couleur;
    // Constructeur
    public Poo_2020(String nom, String matierePrincipale, double prix, String couleur){
        this.nom = nom;
        this.matierePrincipale = matierePrincipale;
        this.prix = prix;
        this.couleur = couleur;
    }
    // Methode toString pour l'affichage
    @Override
    public String toString(){ // 'System.out.println()' permet d'appeler automatiquement la fonction toString
        return "Jouet [Nom=" + nom + ", Matiere Principale=" + matierePrincipale + ", Prix=" + prix + ", Couleur=" + couleur +"]";
    }
    // Accesseur (getter) 
    //pour l'attribut prix, permet de recuperer la valeur de l'attribut 'prix'
    public double getPrix(){
        return prix;
    }
    // Modificateur (setteur)
    // pernmet de définir ou mettre a jour en appelant cette method
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    // augmentation
    public void augmenterPrix(double pourcentage){
        double augmentation = prix * (pourcentage / 100);
        prix += augmentation;
    }
    // Method destiner au adulte
    public boolean destinationAdulte(){
        return couleur.equalsIgnoreCase("Noir"); // equals = une fonction d'egalisation
        // equalsIgnoreCase() = ignorer les majuscules
    }
    public String getNom(){
        return nom;
    }
    public String getMatiere(){
        return matierePrincipale;
    }
    // Methode principale pour tester la classe
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Poo_2020 jouetx = new Poo_2020("Jouet1", "Plastique", 10.99, "Blue");
        System.out.println(jouetx); // permet d'appeler la method toString
        double prixJouet1 = jouetx.getPrix();
        System.out.println(prixJouet1);
        jouetx.setCouleur("vert");

        Poo_2020 jouet1 = new Poo_2020("Poupée Barbie", "Plastique", 15.0, "Bleu");
        Poo_2020 jouet2 = new Poo_2020("J'eu d'échec", "Bois", 45.0, "noir");

        System.out.print("Entrez le pourcentage d'augmentation pour la poupé Barbie: ");
        double pourcentage = scanner.nextDouble();
        jouet1.augmenterPrix(pourcentage);
        System.out.print("Poupé Barbie - Nouveaux prix: " + jouet1.getPrix() + "euros");
        scanner.close();

        System.out.print("Jouet 1 - Nom: " + jouet1.getNom() +", Prix: " + jouet1.getPrix() +", Matière: " + jouet1.getMatiere());
        if(jouet1.destinationAdulte()){
            System.out.println("Jouet 1 - Destiné aux adultes: Oui");
        } else {
            System.out.println("Jouet 1 - Destiné aux adultes: Non");
        }
        System.out.print("Jouet 2 - Nom: " + jouet2.getNom() +", Prix: " + jouet2.getPrix() +", Matière: " + jouet2.getMatiere());
        if(jouet2.destinationAdulte()){
           System.out.println("Jouet 2 - Destiné aux adultes: Oui");
        } else {
           System.out.println("Jouet 2 - Destiné aux adultes: Non");
        }

    }
}
