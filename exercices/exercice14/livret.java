public class livret {
    public static int MAX = 5;
    public static int MIN = 20;
    public static void main(String[] args) {
        int nombre1 = choisirUnNombre(MAX, MIN);
        int nombre2 = choisirUnNombre(MAX, MIN);
        String[] tableMultiplication = construireTableMultiplication(nombre1, nombre2);
        System.out.println("Les chiffres sont : " + nombre1 + " " + nombre2);
        for (int i = 0; i < tableMultiplication.length; i++) {
            System.out.println(tableMultiplication[i]);
        }
    }

    public static int choisirUnNombre(int min, int max){
        int nombre = ( int ) ( Math.random() * ( max - min + 1 ) ) + min;
        return nombre;
    }

    public static String[] construireTableMultiplication(int nbr1, int nbr2){
        String[] tabMultiplication = new String[nbr1 * nbr2];
            int col1 = 1;
            int col2 = 1;
        for (int i = 0; i < tabMultiplication.length; i++) {
           // do {
                tabMultiplication[i] = col1 + " X " + col2 + " = " + (col1 * col2);
                if (col2 == nbr2) {
                    col1++;
                    col2 = 1;
                    //break;
                }
                col2++;
              //  break;
           // } while  (col1 != nbr1);
        }
        return tabMultiplication;
    }
}
