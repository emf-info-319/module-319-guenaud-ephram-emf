public class devoir02 {
    static final int CAPACITE_RESERVOIR_A = 3;
    static final int CAPACITE_RESERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;

        int remplissage = ( int ) ( Math.random() * (CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B - 0 + 1 ) );

        System.out.println("Il y a " + remplissage + " litres à remplir.");

        while (reservoirA + reservoirB < remplissage) {
            if (reservoirA < CAPACITE_RESERVOIR_A) {
                reservoirA++;
                System.out.println("Remplissage du réservoir A...");
            } else if (reservoirB < CAPACITE_RESERVOIR_B) {
                reservoirB++;
                System.out.println("Remplissage du réservoir B...");
            }

            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B : " + reservoirB);
        }

        System.out.println("Remplissage terminé!");
    }
}
