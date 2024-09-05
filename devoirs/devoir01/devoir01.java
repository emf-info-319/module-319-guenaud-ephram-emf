public class devoir01 {
    public static void main(String[] args) {
        byte monAge = 16; //La variable doit être de type byte car un âge ne vas pas être plus haut que 127
        boolean estMajeur; //La variable doit être de type boolean pour avoir un vais ou faux
        if (monAge > 20) {
            estMajeur = true;
        }
        else {
            estMajeur = false;
        }
        System.out.println("Je m'appelle GUENAUD Ephram");
        System.out.println("Mon âge est de " + monAge + "ans");
        if (estMajeur == true) {
            System.out.println("Je suis majeur");
        }
        else {
            System.out.println("Je ne suis pas encore majeur");
        }
    }
}
