import java.util.Scanner;
public class exo2_2020 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        int nombre = scanner.nextInt();
        if(estPremier(nombre)){
            System.out.print("Le nombre " + nombre + " est premier");
        } else {
            System.out.print("Le nombre " + nombre + " n'est pas premier");
        }
    }

    public static boolean estPremier(int nombre){
        if(nombre <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(nombre); i++){ // Math.sqrt() = la racine carré en Java
            if(nombre % i == 0){
                return false;
            }
        }
        return true;
    }
}
