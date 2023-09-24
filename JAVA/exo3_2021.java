import java.util.ArrayList;
import java.util.HashMap;
public class exo3_2021 {

    public static void main(String[] args) {
        int[] tableau = {2, 4, 3, 5, 6, 1}; // Vous pouvez changer les valeurs du tableau pour tester différentes configurations
        int sommeDonnee = 7;

        ArrayList<Pair<Integer, Integer>> paires = trouverPairesSommeDonnee(tableau, sommeDonnee);  

        System.out.println("Les paires dont la somme est " + sommeDonnee + " sont :");
        for (Pair<Integer, Integer> paire : paires) {
            System.out.println("(" + paire.getFirst() + ", " + paire.getSecond() + ")");
        }
    }

    public static ArrayList<Pair<Integer, Integer>> trouverPairesSommeDonnee(int[] tableau, int somme) {
        ArrayList<Pair<Integer, Integer>> paires = new ArrayList<>(); // qui contient les objets de type <Pair<Integer, Integer>> chaque élément de cette liste sera une objet pair
        HashMap<Integer, Integer> valeursVues = new HashMap<>(); // HashMap<Integer, Integer> = permet de stocké des pairs de clé et de valeurs

        for (int nombre : tableau) {
            int difference = somme - nombre;
            if (valeursVues.containsKey(difference)) { // vérifie si la clé de 'difference' existe dans le HashMap appelé 'ValeursVues'
                paires.add(new Pair<>(nombre, difference)); // new Pair<>() permet de créer une nouvelle pair d'entrer
            }
            valeursVues.put(nombre, difference); // .put() = permet d'ajouter une entré au HashMap (Mettre a jour les données)
        }

        return paires;
    }
}

class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}


