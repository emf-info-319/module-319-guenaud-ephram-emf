public class Phraseur {
    public static void main(String[] args) {
        String[] sujets = new String[] { "Cesar, " };
        String[] verbes = new String[] { "nique ", "baise ", "suce " };
        String[] choses = new String[] { "ta mère ", "ton oncle ", "ton père " };
        for (int i = 0; i < 10 - 1; i++) {
            String sujet = choisirMot(sujets);
            String verbe = choisirMot(verbes);
            String chose = choisirMot(choses);
            System.out.println(sujet + verbe + chose);
        }
    }

    public static int nbreAleatoire(int min, int max) {
        int nombre = (int) (Math.random() * (max - min + 1)) + min;;
        return nombre;
    }

    public static String choisirMot(String[] tab) {
        int randomMot = nbreAleatoire(0, tab.length - 1);
        String mot = tab[randomMot];
        return mot;
    }
}
