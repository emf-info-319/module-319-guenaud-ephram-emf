public class ExercicesString {
    public final static int POSITION = 17;

    public static void main(String[] args) {
        String maChaineDeCaractere = "Je suis un poisson qui se retrouve contenu";
        String nomVariable = "maChaineDeCaractere";
        System.out.println(
                "Nombre de caractère contenu dans la variable " + nomVariable + " : " + maChaineDeCaractere.length());
        System.out.println("Le mot contenu commence à la position : " + maChaineDeCaractere.indexOf("contenu"));
        System.out.println("La position " + POSITION + " contient la lettre : " + maChaineDeCaractere.charAt(POSITION));
        String monPrenom = "Ephram";
        for (int i = 0; i < monPrenom.length(); i++) {
            System.out.println("La lettre à la position " + i + " est : " + monPrenom.charAt(i));
        }
        if (monPrenom.contains("test")) {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" contient le texte \"test\".");
        } else {
            System.out.println("La chaîne de caractère \"" + monPrenom + "\" ne contient pas le texte \"test\".");
        }
    }

    public static void méthodeA(boolean méthodeA){
        méthodeA = true;
    }
}
