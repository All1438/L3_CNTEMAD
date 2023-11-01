public class exo4_2017 {
    public static void main(String[] args){
        int[][] pascal = new int[5][5]; // le tableau a une taille de 5 lignes et 5 colonnes = 25 éléments
        for(int i = 0; i < pascal.length; i++){
            pascal[i][0] = 1;
            for(int j = 1; j < pascal.length; j++) {
                if(i > 0){
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        for(int ligne = 0; ligne < 5; ligne++){
            for(int col = 0; col < 5; col++){
                System.out.printf("%4d", pascal[ligne][col]);
            }
            System.out.printf("\n");
        }
    }
}
