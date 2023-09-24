import java.util.Scanner;
public class exo2_2018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre positif: ");
        int nombre = scanner.nextInt(); // nextInt permet
        int nombreInverse = inverserChiffres(nombre);
        System.out.print("L'inverse du chiffre est:" + nombreInverse);
    }
    public static int inverserChiffres(int nombre){
        int nombreInverse = 0;
        while(nombre > 0){
            int dernierChiffre = nombre % 10; // si on divisible par 10 le reste du diviseur sera le dernier chiffre
            nombreInverse = nombreInverse * 10 + dernierChiffre; // nombreInverse * 10 pour pour mettre en place le dernier dernierChiffre
            nombre /= 10; // pour éliminer le dernier chiffre
        }
        return nombreInverse; // toujours retourner si de type int
    }
}
