import java.util.Scanner;
public class exo3_2020 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        int nombre = scanner.nextInt();
        if(Armstrong(nombre)){
            System.out.print("est un nombre Armstrong");
        } else {
            System.out.print("N'est pas un nombre Armstrong");
        }
    }

    public static boolean Armstrong(int nombre){
        int nbrDigits = String.valueOf(nombre).length();
        int som = 0;
        int nbrOriginal = nombre;
        while(nombre > 0){
            int digit = nombre % 10;
            som += Math.pow(digit, nbrDigits);
            nombre /= 10; 
        }
        return som == nbrOriginal;

    }
}