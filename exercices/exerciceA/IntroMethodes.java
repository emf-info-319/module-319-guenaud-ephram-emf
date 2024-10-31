import java.util.Scanner;

public class IntroMethodes {
    public static void main(String[] args) {
        debut();

        int valeur = demandeNombre();

        int valeur1 = demandeNombre();

        int valeur2 = demandeNombre();

        int resultat = somme(valeur, valeur1, valeur2);


        System.out.println("\nLa somme est : " + resultat);

        fin();
    }

    public static void debut() {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On vas voir les méthodes dans ce cours. \n");
    }

    public static void fin() {
        System.out.println("\nProgramme terminé");
    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre --> ");
        int nombre = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + nombre + " !");
        return nombre;
    }

    public static int somme(int nombre1, int nombre2, int nombre3) {
        int somme = nombre1 + nombre2 + nombre3;
        return somme;
    }
}
