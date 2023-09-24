import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez les éléments du tableau 1 séparés par des espaces : ");
        String input1 = scanner.nextLine();
        int[] tableau1 = convertirEnTableau(input1);

        System.out.print("Entrez les éléments du tableau 2 séparés par des espaces : ");
        String input2 = scanner.nextLine();
        int[] tableau2 = convertirEnTableau(input2);

        int schtroumpf = calculerSchtroumpf(tableau1, tableau2);

        System.out.println("Le schtroumpf est : " + schtroumpf);
    }

    public static int[] convertirEnTableau(String input) {
        String[] elements = input.split(" ");
        int[] tableau = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            tableau[i] = Integer.parseInt(elements[i]);
        }
        return tableau;
    }

    public static int calculerSchtroumpf(int[] tableau1, int[] tableau2) {
        int schtroumpf = 0;

        for (int i = 0; i < tableau1.length; i++) {
            for (int j = 0; j < tableau2.length; j++) {
                schtroumpf += tableau1[i] * tableau2[j];
            }
        }

        return schtroumpf;
    }
}
