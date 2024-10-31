public class test4 {
    static final int MAX = 6;
    static final int MIN = 1;
    static final int NBR_NOTES = 5;
    static final int MOYENNE = 4;
public static void main(String[] args) {
    int[] note = new int[NBR_NOTES];
    for (int i = 0; i < note.length; i++) {
        note[i] = ( int ) ( Math.random() * ( MAX - MIN + 1) ) + MIN;
        System.out.print("La note est de : " + note[i] + " --> ");
        switch (note[i]) {
            case 4 :
                System.out.println("Suffisant");
                break;
            case 5 :
                System.out.println("Bien");
                break;
            case 6 :
                System.out.println("Très bien");
                break;
            default:
                System.out.println("Insuffisant");
        }
    }
    double moyenne = 0;
    for (int i = 0; i < note.length; i++) {
        moyenne = moyenne + note[i];
    }
    moyenne = moyenne / NBR_NOTES;
    System.out.println("La moyenne est de : " + moyenne);
    if (moyenne > MOYENNE) {
        System.out.println("L'élève est promut !");
    } else {
        System.out.println("L'élève n'est pas promut !");
    }
}
    
}