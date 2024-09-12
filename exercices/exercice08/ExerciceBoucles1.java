public class ExerciceBoucles1 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.println("Boucle for, itération " + i);
        }
        System.out.println("......Changement de Boucle.....");
        int z = 0;
        boolean uneCondition = true;
        while (uneCondition == true) {
            z++;
            System.out.println("Boucle while, itération " + z);
            if (z > 4) {
                uneCondition = false;
            }
        }
        System.out.println(".....Changement de Boucle.....");
        int y = 0;
        boolean laCondition = true;
        do {
            y++;
            System.out.println("Boucle do-while, itération " + y);
            if (y > 4) {
                laCondition = false;
            }
        } while (laCondition == true);
    }

}
