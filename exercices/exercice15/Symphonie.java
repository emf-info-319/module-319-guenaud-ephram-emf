public class Symphonie {
    public static String[] NOTES = new String[] {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
    public static int NBRE_NOTES = 5;
    public static int NBRE_PARTITIONS = 3;
    public static void main(String[] args) {
        String partition;
        int i = 0;
        do{
            partition = creerLaPartition();
            System.out.println("La partition " + i + " est :" + partition);
            partition = " ";
            i++;
        } while (i < NBRE_PARTITIONS);
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

    public static String creerLaPartition() {
        String partition = " ";
        String note = " ";
        for (int i = 0; i < NBRE_NOTES; i++) {
            boolean estDiese = estDiese();
            if (estDiese == true) {
                note = NOTES[choisirUnNombre(1, 7)] + "#";
            } else {
                note = NOTES[choisirUnNombre(1, 7)];
            }
            partition = partition + " " + note;
        }
        return partition;
    }
}
