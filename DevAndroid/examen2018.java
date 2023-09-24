import java.util.Scanner;
public class examen2018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] notes = new double[5]; // déclare les Tableau permet de stocké les 5 notes
        for(int i = 0; i < 5; i++){
            System.out.print("Saisissez la note " + (i + 1) + ": ");
            notes[i] = scanner.nextDouble(); // nextDouble() = permet d'inserer les valeurs avec ',' virgule
        }
        double somme = 0;
        for(int i = 0; i < 5; i++){
            somme += notes[i];
        }
        double moyenne = somme / 5;
        System.out.print("La moyenne des notes est: "+ moyenne);
    }
}