import java.util.Scanner;

public class devoir05 {
    public final static int MAX = 100;
    public final static int MIN = 1;
    public static void main(String[] args) {
        int nbre = ( int ) ( Math.random() * ( MAX - MIN + 1 ) ) + MIN;
        boolean laCondition = true;
        System.out.println("Salut, ");
        System.out.println("Aujourd'hui on vas jouer à un jeux");
        System.out.println("Je vais choisir un nombre entre 1 et 100 et tu vas devoir le trouver");
        System.out.println("C'est partis !");
        do {
            System.out.println("Entre une valeur stp :) ");
            Scanner scanner = new Scanner( System.in );
            int valeur = scanner.nextInt();
            if (valeur < nbre) {
                System.out.println("Trop petit dommage");
            } else if (valeur > nbre) {
                System.out.println("Trop grand dommage");
            } else if (valeur == nbre) {
                System.out.println("Bravo, tu as trouvé !");
                laCondition = false;
            }
        } while (laCondition == true);
    }
}
