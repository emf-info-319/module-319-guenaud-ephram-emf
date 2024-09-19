public class exerciceTableau4 {
    public static void main(String[] args) {
        int[] monTableau;
        monTableau = new int[3];
        int n = 0;
        for (int i = 0; i <= 20; i++) {
            if (i >= 18) {
                monTableau[n] = i;
                System.out.println("Cellule " + n + " : " + monTableau[n]);
                n++;
            }
            continue;
        }
    }
}
