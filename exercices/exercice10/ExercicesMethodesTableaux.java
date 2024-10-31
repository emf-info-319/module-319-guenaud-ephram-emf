package exercice10;

public class ExercicesMethodesTableaux {
    public final static int MAX = 10;
    public final static int MIN = 3;
    public static void main(String[] args) {
        int[] tab = creeTableau(4);
    }

    public static int[] creeTableau(int taille) {
        int[] tableau = new int[taille];
        return tableau;
    }

    public static int[] valeurTableau(int[] tableauARemplir, int valeurADonner) {
        for (int i = 0; i < tableauARemplir.length; i++) {
            tableauARemplir[i] = valeurADonner;
        }
        return tableauARemplir;
    }
}
