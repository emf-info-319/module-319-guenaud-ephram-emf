package devoirs.devoir04;

public class devoir4 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 9;
        int day = 30;
        int[] tableauJ = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] tableauM = new String[] { "Janvier", "Fevrier", "Mars", "Avril", "Mais", "Juin", "Juillet", "Aout",
                "Septembre", "Octobre", "Novembre", "Decembre" };
        System.out.println("La date entré est le " + day + "." + month + "." + year);
        int monthV = month - 1;
        if (year <= 0) {
            System.out.println("L'année [" + year + "] est hors limites !");
        } else if (year >= 9999) {
            System.out.println("L'année [" + year + "] est hors limites !");
        } else if (month <= 0) {
            System.out.println("Le mois [" + month + "] est hors limites !");
        } else if (month >= 13) {
            System.out.println("Le mois [" + month + "] est hors limites !");
        } else if (day > tableauJ[monthV]) {
            System.out.println("Le jour [" + day + "] est hors limites !");
        } else if (day <= 0) {
            System.out.println("Le jour [" + day + "] est hors limites !");
        } else {
            System.out.println("La date formatée est le " + day + " " + tableauM[monthV] + " " + year);
        }

    }
}
