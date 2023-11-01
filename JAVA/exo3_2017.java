public class exo3_2017 {
    public static void main(String[] args){
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade distribution: ");
        for(int counter = 0; counter < array.length; counter++){
            if(counter == 10){
                System.out.printf("%5d:", 100);// qui signifie qu'il affiche 100 en 5 caractère de largeur minimale(  100)
                // format = permet de formater un chaine de caractère
            }
            else {
                System.out.printf("%02d-%02d:", counter * 10, counter * 10 + 9); //%02d = il affiche 2 caractère de largeur avec 0 en début
            }
            for(int stars = 0; stars < array[counter]; stars++){
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
