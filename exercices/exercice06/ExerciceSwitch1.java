public class ExerciceSwitch1 {
    public static void main(String[] args) {
    int noteDuModule = 7;
    switch (noteDuModule) {
        case 1:
            System.out.println("Travail non rendu");
            break;
        case 2: 
            System.out.println("Très insuffisant");
            break;
        case 3:
            System.out.println("Insuffisant");
            break;
        case 4:
            System.out.println("Suffisant");
            break;
        case 5: 
            System.out.println("Bien");
            break;
        case 6: 
            System.out.println("Très bien");
        default:
            System.out.println("note incorect");
            break;
    }
 }   
}
