public class ExerciceCondition1 {
    public static void main(String[] args) {
        int valeurATester = 5;
        System.out.println("Valeur entrée : " + valeurATester);
        System.out.println("calcule en cours.....");
        if (valeurATester > 0){
            System.out.println("Le nombre est positif");
        }
        else if (valeurATester < 0) {
            System.out.println("Le nombre est négatif");
        }
        else if (valeurATester == 0) {
            System.out.println("Le nombre est NUL");
        }
    }
}
