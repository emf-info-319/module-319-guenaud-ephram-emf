package Test;
public class test {
    public static void main(String[] args) {
    int jour = 3;
    switch (jour) {
        case 1:
        System.out.println("Lundi");
        break;
        case 2: 
        System.out.println("Mardi");
        break;
        case 3:
        System.out.println("Mercredi");
        case 4:
        System.out.println("Jeudi");
        break;
    default:
        System.out.println("Jour inconnu");
    }
    }
}