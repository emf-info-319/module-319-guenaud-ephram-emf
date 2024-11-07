public class SuiteDeValeurs {
    public final static int TAILLE_TABLEAU = 20;
    public final static int VALEUR_MIN = 0;
    public final static int VALEUR_MAX = 50;
    public final static int VALEUR_RECHERCHEE = 7;
    public static void main(String[] args) {
        int[] tableau = genereTableau(VALEUR_MAX, VALEUR_MIN, TAILLE_TABLEAU);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Tableau [" + i + "] = [" + tableau[i] + "]");
        }
        int min = rechercheMin(tableau);
        int max = rechercheMax(tableau);
        System.out.println("La plus petite valeur trouvée est : " + min);
        System.out.println("La plus grande valeur trouvée est : " + max);
        int occurence = rechercheValeur(tableau, VALEUR_RECHERCHEE);
        if (occurence == -1) {
            System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] n'a pas été trouver dans le tableau");
        } else {
            System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + occurence + "] du tableau");
        }
        
    }

    public static int[] genereTableau(int max, int min, int taille) {
        int[] tableau = new int[taille];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        }
        return tableau;
    }

    public static int rechercheMin(int[] tableau) {
        int min = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static int rechercheValeur(int[] tableau, int valeurAChercher) {
        int index = -1;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurAChercher) {
                index = i;
            }
        }
        return index;
    }
}
