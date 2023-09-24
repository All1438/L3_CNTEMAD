import java.util.Scanner;
import java.util.ArrayList;

public class exo3_2020_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer la taille du tableau: ");
        int taille = scanner.nextInt();
        int[] tableau = new int [taille]; // permet d'alloué la taille du tableau
        System.out.println("Entrer les elements du tableau entre 1 et 9: ");
        for(int i = 0; i < taille; i++){
            tableau[i] = scanner.nextInt();
        }
        ArrayList<Integer> nombreManquants = trouverNombreManquants(tableau); // mettre la valeur retourner dans une variable et mettre de même type que la fonction
        System.out.print("Les nombres manquants sont: ");
        for(int nombre : nombreManquants){
            System.out.print(nombre + " ");
        }

    }
    public static ArrayList<Integer> trouverNombreManquants(int[] tableau){ // Permet de retourner  un nombre variable d'éléments et qui peut grandir au fur et à mesure que vous ajoutez des éléments
        ArrayList<Integer> nombreManquants = new ArrayList<>(); // permet d'alloué un tableau qui peut grandir a fur et à mesure
        boolean[] presence = new boolean[10]; // permet d'alloué 10 taille de tableau de 0 à 9 de type boolean les données contenu, tout initialiser par false
        // Marqué les nombres présents dans le tableau
        for(int nombre : tableau){
            if(nombre >= 1 && nombre <= 9){
                presence[nombre] = true; // mettre les tableaux entrer  entre 1 et 9 en true et les manquants en false
            }
        }
        // Trouver nombre manquant
        for(int i = 1; i <= 9; i++){
            if(!presence[i]){ // permet de dire que si false alors ...
                nombreManquants.add(i); // permet d'ajouter dans un tableau de type ArrayList
            }
        }
        return nombreManquants;

    }
}
