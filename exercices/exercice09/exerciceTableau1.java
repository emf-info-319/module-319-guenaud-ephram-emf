public class exerciceTableau1 {
    public static void main(String[] args) {
        int[] monTableau; //déclaration du tableau
        monTableau = new int[3];
        for (int valeurCellule = 0; valeurCellule < monTableau.length; valeurCellule++) {
            System.out.println(monTableau[valeurCellule]);
        }
        String[] monTableauTxt;
        monTableauTxt = new String[3];
        for (int valeurCellule1 = 0; valeurCellule1 < monTableauTxt.length; valeurCellule1++) {
            System.out.println(monTableauTxt[valeurCellule1]);
        }
        boolean[] monTableauBoolean;
        monTableauBoolean = new boolean[3];
        for (int valeurCellule2 = 0; valeurCellule2 < monTableauBoolean.length; valeurCellule2++) {
            System.out.println(monTableauBoolean[valeurCellule2]);
        }
    }
}
