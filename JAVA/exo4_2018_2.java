public class exo4_2018_2 {
    public static void main(String[] args){
        double[][][] tab = {
            {{12, 0, 10.5}, {13, 7.5, 0}, {14, 6, 8}}, // diviser par 3 par 3 car c'est une matrice
            {{17, 0, 10},{15, 13, 12.5}, {0, 19, 6}}
        };
        int nbrNull = 0;
        for(int x = 0; x < tab.length; x++){ // compte le 1er {}
            for(int y = 0; y < tab[x].length; y++){ // compte le 1er dans le 1er {{}}
                for(int z = 0; z < tab[x][y].length; z++){
                    if(tab[x][y][z] == 0){
                        nbrNull++;
                    }
                }
            }
        }
        System.out.print("Le nombre des valeurs null est: " + nbrNull);
    }
}
