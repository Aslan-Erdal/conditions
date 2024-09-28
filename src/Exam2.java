import java.util.Arrays;

public class Exam2 {

    public static void main(String[] args) {

        //resultat(13.0, 15.5, 14.5);

        //racineEquation(5.0, 2.0);

        // multipleDeTrois(20);

        //Integer[] T= {-4,10,8,25,-6};
        //produitElementTab(T);

        Integer[] tab = {5,8,47,-9,5,8,100,5,78};
        Integer n = 5;
        int o = occurrence(tab, n);
        System.out.println(o);
    }

    // Exercice Numéro 1 :
    public static void resultat(Double note1, Double note2, Double note3) {
        if (note1 < 12 || note2 < 12 || note3 < 12) {
            System.out.println("Échoué");
        } else {
            System.out.println("Réussi");
        }
    }

    // Exercice Numéro 2 :
    public static void racineEquation(Double a, Double b) {
        double racine = 0;
        if (a == 0) {
            System.out.println("Pas de racines !");
        } else {
            racine =  (-b / a);
        }
        System.out.println(racine);
    }

    // Exercice Numéro 3 :
    public static void multipleDeTrois(Integer number) {
        //System.out.println(n);
        int i = 1;
        System.out.print("Les multiples de 3 entre 1 et 20 sont : ");
        while (i <= number) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    // Exercice Numéro 4 :
    public static void produitElementTab(Integer[] T) {
        int result = 1;
        for (int i = 0; i < T.length; i++) {
            result *=  T[i];
        }
        System.out.println(result);
    }

    // Exercice Numéro 5 :
    public static int occurrence(Integer[] tab, Integer n) {
        int temp = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                if (i > temp) {
                    temp = i;
                }
            }
        }
        if (temp > 0) {
            return temp;
        } else {
            return -1;
        }
    }


}
