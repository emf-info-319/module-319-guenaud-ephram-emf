public class test3 {
 
    public static void main(String[] args) {
       
        int []tab1;
        tab1 = new int[] { 4, 8, 7, 9, 1, 5, 4, 6};
        int []tab2;
        tab2 = new int[] { 7 , 6 , 5 , 2 , 1 , 3 , 7 , 4 };
        int []resultat;
        resultat = new int[8];
 
 
        System.out.print("Tableau 1 : ");
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i] + " " );
        }
 
        System.out.print("\n"+"Tableau 2 : ");
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " " );
        }
       
 
        System.out.print("\n"+"Résultat : ");
        for (int i = 0; i < resultat.length; i++) {
            System.out.print(tab1[i] + tab2[i] + " ");
        }
 
 
    }
}