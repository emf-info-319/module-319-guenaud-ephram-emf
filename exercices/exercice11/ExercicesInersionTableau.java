package exercice11;

public class ExercicesInersionTableau {
    public final static int MIN = 0;
    public final static int MAX = 100;
    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        System.out.println("\nContenu du tableau initial : ");
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }

        
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        System.out.println("\nContenu du tableau final : ");
        for (int y = 0; y < tableauFinal.length; y++) {
            System.out.println("Tableau final [" + y + "] = " + tableauFinal[y]);
        }
    }

    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        return tableauInverse;
    }
}
