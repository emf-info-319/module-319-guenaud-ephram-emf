public class exerciceTableau3 {
    static final int VALEUR_MIN = 1;
    static final int VALEUR_MAX = 6;

    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[10];
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (int) (Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
        }
        int z = 0;
        for (int y = 0; y < monTableau.length; y++) {
            System.out.println("Cellule " + z + " : " + monTableau[y]);
            z++;
        }
        int b = 0;
        for (int n = 0; n < monTableau.length; n++) {
            b = b + monTableau[n];
        }
        double moyenne = b / 10;
        System.out.println("La moyenne est de : " + moyenne);
    }
}
