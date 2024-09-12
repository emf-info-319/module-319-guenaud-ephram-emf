package exercices.exercice08;

public class ExcerciceBoucles4 {
    public static void main(String[] args) {
        System.out.println("Boucle for:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Décollage !!");
        System.out.println(" ");
        System.out.println("Boucle while:");
        int z = 6;
        boolean uneCondition = true;
        while (uneCondition == true) {
            z--;
            System.out.println(z);
            if (z == 1) {
                uneCondition = false;
            }
        }
        System.out.println("Décollage !!");
        System.out.println(" ");
        System.out.println("Boucle do-while:");
        int y = 6;
        boolean laCondition = true;
        do {
            y--;
            System.out.println(y);
            if (y < 2) {
                laCondition = false;
            }
        } while (laCondition == true);
        System.out.println("Décollage !!");
    }
}
