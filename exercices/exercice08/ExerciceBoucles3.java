package exercices.exercice08;

public class ExerciceBoucles3 {
    public static void main(String[] args) {
        int z = 0;
        boolean uneCondition = true;
        while (uneCondition == true) {
            z++;
            System.out.println("Boucle while, itération " + z);
            if (z > 4) {
                uneCondition = false;
            }
        }
    }
}
