package exercice07;

public class OperateurCalcule {
    public static void main(String[] args) {
        int n = 1;
        int x = 4;
        int y = 8;
        //voici 3 variable de nombre pour pouvoir calculer avec tout les opérateur de calcul
        y = n * x; //on multiplie les variable "n" et "x"
        if (y %2 == 1) {
            System.out.println("Le nombre est impair"); //voici quelque ligne de code pérmétant de savoir si le nombre est pair ou impair 
        }
        else {
            System.out.println("Le nombre est pair");
        }
    }
}
