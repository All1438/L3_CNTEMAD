import java.util.Scanner;

public class exo4_2018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le nombre de valeur a saisir: ");
        int nbrValeurs = scanner.nextInt();
        int[] tableau = new int [nbrValeurs]; // permet de declarer un tableau et new pour alloé sa taille
        for(int i = 0; i < nbrValeurs; i++){
            System.out.print("Entrer la valeur " + (i + 1) + ":"); // le mettre dans un ( ) pour effectuer un calcul dans print
            tableau[i] = scanner.nextInt();
        }
        int nbrNegative = 0;
        int nbrPositive = 0;
        for(int valeur : tableau){ // permet de manasesy la valeur de tableau
            if(valeur < 0){
                nbrNegative ++;
            } else if(valeur > 0){
                nbrPositive ++;
            }
        }
        System.out.println("Nombre de valeur negative: " + nbrNegative);
        System.out.print("Nombre de valeur positive: " + nbrPositive);
    }
}