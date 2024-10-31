package exercice10;

import java.util.Scanner;

public class Methodes {
    public static void main(String[] args) {
        direBonjour();
        System.out.println("_____________________\n");
        System.out.print("Entrez votre prénom : ");
        Scanner scanner = new Scanner(System.in);
        String Prenom = scanner.nextLine();
        System.out.print("\nVotre prénom en majuscule est : ");
        dire(Prenom);
        System.out.println("_____________________\n");
        int[] nombreMin = new int[2];
        for (int i = 0; i < nombreMin.length; i++) {
            System.out.print("Entrez un nombre : ");
            int chiffreMin = scanner.nextInt();
            nombreMin[i] = chiffreMin;
        }
        int mathMin = mathMin(nombreMin[0], nombreMin[1]);
        System.out.print("Le nombre le plus petit est : ");
        System.out.println(mathMin);
        System.out.println("_____________________\n");
        int[] nombreMax = new int[2];
        for (int i = 0; i < nombreMax.length; i++) {
            System.out.print("Entrez un nombre : ");
            int chiffreMax = scanner.nextInt();
            nombreMax[i] = chiffreMax;
        }
        int mathMax = mathMax(nombreMax[0], nombreMax[1]);
        System.out.print("Le nombre le plus petit est : ");
        System.out.println(mathMax);
        System.out.println("_____________________\n");
        double[] nombrePow = new double[2];
        String[] nPow = {"la base", "l'éxposant"};
        for (int i = 0; i < nombrePow.length; i++) {
            System.out.print("Entrez un nombre pour " + nPow[i] + " : ");
            double chiffrePow = scanner.nextDouble();
            nombrePow[i] = chiffrePow;
        }
        double mathPow = mathPow(nombrePow[0], nombrePow[1]);
        System.out.println("Le résultat de " + nombrePow[0] + " à la puissance " + nombrePow[1] + " est de : " + mathPow);
        System.out.println("_____________________\n");
        System.out.print("Entrez un nombre : ");
        double nombreSqrt = scanner.nextDouble();
        double mathSqrt = mathSqrt(nombreSqrt);
        System.out.println("La racine carrée de ce nombre est : " + mathSqrt);
        System.out.println("_____________________\n");
        System.out.print("Entrez un nombre négatif : ");
        double nombreAbs = scanner.nextDouble();
        double mathAbs = mathAbs(nombreAbs);
        System.out.println("Le nombre positif est : " + mathAbs);
        System.out.println("_____________________\n");
        scanner.close();

    }

    public static void direBonjour() {
        System.out.println("Bonjour");
    }

    public static void dire(String PrenomM) {
        PrenomM = PrenomM.toUpperCase();
        System.out.println(PrenomM);
    }

    public static int mathMin(int nombre1, int nombre2) {
        int mathMin = Math.min(nombre1, nombre2);
        return mathMin;
    }

    public static int mathMax(int nombre1, int nombre2) {
        int mathMax = Math.max(nombre1, nombre2);
        return mathMax;
    }

    public static double mathPow(double nombre1, double nombre2) {
        double mathPow = Math.pow(nombre1, nombre2);
        return mathPow;
    }

    public static double mathSqrt(double nombre1) {
        double mathSqrt = Math.sqrt(nombre1);
        return mathSqrt;
    }

    public static double mathAbs(double nombre1) {
        double mathAbs = Math.abs(nombre1);
        return mathAbs;
    }
}
