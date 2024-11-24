public class TournoiGuenaudEphram {
    public final static String[] EQUIPES = new String[] { "FC Richemont", "FC Central", "FC Schoenberg",
            "FC Beauregard", "Team AFF", "Etoile Sport" };
    public final static int MAX_GOAL = 10;
    public static int[] pointsEquipes;

    public static void main(String[] args) {
        pointsEquipes = new int[EQUIPES.length];
        for (int i = 0; i < EQUIPES.length; i++) {
            if (i == EQUIPES.length - 1) {
                simuleMatch(i, 0);
            } else {
                simuleMatch(i, i + 1);
            }
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < pointsEquipes.length; i++) {
            System.out.println("L'équipe " + EQUIPES[i] + " a " + pointsEquipes[i] + " points.");
        }
        System.out.println("--------------------------------");
        int[] gagnants = trouveGagnants();
        for (int i = 0; i < gagnants.length; i++) {
            int indexGagnant = gagnants[i];
            System.out.println("L'équipe " + EQUIPES[gagnants[i]] + " a gagné");
        }
    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[index1] = pointsEquipes[index1] + 3;
            System.out.println("L'équipe " + EQUIPES[index1] + " a gagner contre l'équipe " + EQUIPES[index2]);
        } else if (scoreEquipe1 < scoreEquipe2) {
            pointsEquipes[index2] = pointsEquipes[index2] + 3;
            System.out.println("L'équipe " + EQUIPES[index2] + " a gagner contre l'équipe " + EQUIPES[index1]);
        } else {
            pointsEquipes[index1] = pointsEquipes[index1] + 1;
            pointsEquipes[index2] = pointsEquipes[index2] + 1;
            System.out.println("Match nul entre " + EQUIPES[index1] + " et " + EQUIPES[index2]);
        }
    }

    public static int rechercheMaxPts() {
        int ptsMax = pointsEquipes[0];
        for (int i = 1; i < pointsEquipes.length; i++) {
            if (ptsMax < pointsEquipes[i]) {
                ptsMax = pointsEquipes[i];
            }
        }
        return ptsMax;
    }

    public static int[] trouveGagnants() {
        int maxPts = rechercheMaxPts();
        int compteurDesGagnants = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                compteurDesGagnants++;
            }
        }
        int y = 0;
        int[] equipeGagnante = new int[compteurDesGagnants];
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                equipeGagnante[y] = i;
                y++;
            }
        }
        return equipeGagnante;
    }
}
