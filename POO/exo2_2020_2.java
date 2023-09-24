import java.util.Date;
// Class Abonné
public class Abonne{
    private String nom;
    private int identifiant;
    public Abonne(String nom, int identifiant){
        this.nom = nom;
        this.identifiant = identifiant;
    }
    public String getNom(){
        return nom;
    }
    public int getIdentifiant(){
        return identifiant;
    }
}
// Class Ouvrage (Classe parente Livre et Bande dessinée)
public class Ouvrage{
    private String title;
    private String auteur;
    private Date dateEmprunt;
    private Abonne emprunteur;
    public Ouvrage(String title, String auteur){
        this.title = title;
        this.auteur = auteur;
        this.dateEmprunt = null;
        this.emprunteur = null;
    }
    public String getTitle(){
        return title;
    }
    public String getAuteur(){
        return auteur;
    }
    public Date getDateEmprunt(){
        return dateEmprunt;
    }
    public Abonne getEmprunteur(){
        return emprunteur;
    }
    public void emprunter(Abonne abonne, Date dateEmprunt){
        this.emprunteur = abonne;
        this.dateEmprunt = dateEmprunt;
    }
    public void rendre(){
        this.emprunteur = null;
        this.dateEmprunt = null;
    }
}
// Class Livre(specialisation de la classe Ouvrage)
public class Livre extends Ouvrage{
    pubic Livre(String title, String auteur){
        super(title, auteur);
    }
}
// Class BandeDessinee
public class BandeDessinee extends Ouvrage{
    private String dessinateur;
    public BandeDessinee(String title, String auteur, String dessinateur){
        super(title, auteur);
        this.dessinateur = dessinateur;
    }
    public String getDessinateur(){
        return dessinateur;
    }
}
