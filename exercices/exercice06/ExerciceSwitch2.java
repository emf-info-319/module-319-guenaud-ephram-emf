public class ExerciceSwitch2 {
    public static void main(String[] args) {
        int age = 7;
        switch (age) {
            case 7 :
                System.out.println("Poussin");
                break;
            case 8 & 9 : 
                System.out.println("Pupille");
                break;
            case 10 & 11 :
                System.out.println("Minime");
                break;
            default:
                System.out.println("Inconnu");
                break;
        }
    }
}
