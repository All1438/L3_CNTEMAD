import java.util.Scanner;
public class exo2_2017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer le nombre de depart: ");
        int nbrDepart = scanner.nextInt();
        System.out.println("les 10 nombres suivants sont: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(nbrDepart + i);
        }
    }
}
