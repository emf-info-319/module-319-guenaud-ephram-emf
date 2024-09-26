public class devoir03 {
  public static void main(String[] args) {
    int jour = 21;
    int mois = 2;
    int annee = 2024; //declaration de variable
    int[] tableauMois;
    tableauMois = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};//tableau pour avoir tout les jours dans un mois de l'annee 
    int jourtotal = 0;
    if (annee %  4 == 0 || annee % 400 == 0) { //modulo pour savoir si l'annee est bisextile ou pas
        tableauMois[2] = 29;
    }
    jourtotal = jourtotal + jour;
    for (int i = 0; i < mois; i++) { //agrémenter de 1 la variable i tant que la variable ne dépasse pas la valeur du mois
      jourtotal = jourtotal + tableauMois[i];
    }
    System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourtotal + " de l'annee " + annee);
  }
}
