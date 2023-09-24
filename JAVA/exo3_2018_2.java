public class exo3_2018_2 {
    public static void main(String[] args){
        System.out.println("Calcule des surfaces des rectangles: ");
        for(int longueur = 1; longueur <= 5; longueur++){
            for(int largeur = 1; largeur <= 5; largeur++){
                int surface = longueur * largeur;
                System.out.println("Longueur: " + longueur + "m, Largeur: " + largeur + "m, Surface: " + surface + "m²");
            }
        }
    }
}
