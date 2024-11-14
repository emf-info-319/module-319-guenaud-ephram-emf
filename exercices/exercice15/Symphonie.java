public class Symphonie {
    public static String[] NOTES = new String[] {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
    public static int NBRE_NOTES = 5;
    public static int NBRE_PARTITIONS = 3;
    public static void main(String[] args) {
        
    }

    public static int choisirUnNombre(int min, int max) {
        int nombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return nombre;
    }

    public static boolean estDiese() {
        boolean estDiese = false;
        int nombre = choisirUnNombre(1, 2);
        if (nombre == 1) {
            estDiese = true;
        } else {
            estDiese = false;
        }
        return estDiese;
    }

    public static String creerLaPartition(int NBRE_NOTES) {
        String partition = " ";
        for (int i = 0; i < NBRE_NOTES; i++) {
            boolean estDiese = estDiese();
            if (estDiese == true) {
                
            }
            partition = partition + " " + NOTES[choisirUnNombre(1, 7)];
        }
    }
}
