public class devoir02 {
    public final static int CAPACITE_RESERVOIR_A = 3;
    public final static int CAPACITE_RESERVOIR_B = 5;
    public static void main(String[] args) {
        int reservoirA;
        int reservoirB;
        int remplissage = ( int ) ( Math.random() * ( CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B - 0 + 1 ) ) + 0; 
        System.out.println("Nombre de litre à remplir : " + remplissage);
        while (remplissage == 0) {
            System.out.println("Il y a 5 litres à remplir.");
            remplissage--;
            System.out.println("Remplissage du réservoir A...");
        }
    }
}
