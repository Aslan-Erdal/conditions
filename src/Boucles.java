import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Boucles {
    public static int greater = 0;
    public static int smaller = 0;

    public static int temp = 0;
    public static int temp2 = 0;

    public static void main(String[] args) {

        // Exercice Numéro 1

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nbr = clavier.nextInt();
        for (int i = nbr; i <= nbr + 10; i++) {
            System.out.println(i);
        }


        // Exercice Numéro 2

        Scanner clavier2 = new Scanner(System.in);
        System.out.println("Entrez un nombre de départ");
        int nbr2 = clavier2.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(nbr2 * i);
        }

        // Exercice Numéro 3

        Scanner clavier3 = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nbr3 = clavier3.nextInt();
        for (int i = 1; i <= nbr3; i++) {
            System.out.println(i);
        }

        // Exercice Numéro 4

        Scanner clavier4 = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nbr4 = clavier4.nextInt();

        for (int i = 1; i <= nbr4; i++) {
            if ( i % 2 == 0 ) {
                System.out.println(i);
            }
        }

        // Exercice Numéro 5

        Scanner clavier5 = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nbr5 = clavier5.nextInt();

        for (int i = 1; i <= nbr5; i++) {
            if ( i % 2 == 1 ) {
                System.out.println(i);
            }
        }

        // Exercice Numéro 6

        Scanner clavier6 = new Scanner(System.in);
        System.out.println("Entrez un premier nombre");
        int nbr6 = clavier6.nextInt();

        System.out.println("Entrez un second nombre");
        int nbr6_2 = clavier6.nextInt();

        if (nbr6 > nbr6_2) greater = nbr6; else greater = nbr6_2;
        if (nbr6 < nbr6_2) smaller = nbr6; else smaller = nbr6_2;
        for (int i = smaller; i <= greater; i++) System.out.println(i);

        // Exercice Numéro 7

        Scanner clavier7 = new Scanner(System.in);
        System.out.println("Entrez un premier nombre");
        int nbr7 = clavier7.nextInt();

        for (int i = 1; i <= nbr7; i++) {
            System.out.println(temp+=i);
        }

        // Exercice Numéro 8

        Scanner clavier8 = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nbr8 = clavier8.nextInt();

        int fact = 1;
        for (int i = 1; i <= nbr8; i++) {
            fact = fact * i;
            System.out.println( i + " : " +fact);
        }

        // Exercice Numéro 9

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 20; i++) {
            Scanner clavier9 = new Scanner(System.in);
            System.out.println("Entrez le nombre numéro " + i);
            int nbr9 = clavier9.nextInt();
            if (nbr9 > max) {
                max = nbr9;
            }
        }
        System.out.println(max);

        // Exercice Numéro 10
        Integer[] tab = new Integer[10];
        for (int i = 0; i <10; i++) {
            Scanner clavier10 = new Scanner(System.in);
            System.out.println("Entrez le nombre numéro " + i);
            int nbr10 = clavier10.nextInt();
            tab[i] = nbr10;
        }
        int max1 = 0;
        for (int i = 0; i < tab.length; i++) {
            max1 += tab[i];
        }
        System.out.println(max1 / 10 + "/20");

        // Exercice Numéro 11
        ArrayList<Float> tab2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner clavier11 = new Scanner(System.in);
            System.out.println("Entrez le nombre numéro " + i);
            Float nbr11 = clavier11.nextFloat();
            tab2.add(nbr11);
        }
        System.out.println(tab2);

        ArrayList<Float> lessThan170 = new ArrayList<>();
        for (int i = 0; i < tab2.size(); i++) {
            if (tab2.get(i) < 1.70) {
                lessThan170.add(tab2.get(i));
            }
        }
        System.out.println(lessThan170.size());

        // Exercice Numéro 12
        Scanner clavier12 = new Scanner(System.in);
        System.out.println("Entrez le nombre numéro ");
        Float nbr12 = clavier12.nextFloat();

        for (int i = 0; i < nbr12; i++) {
            for (int j = 0; j < nbr12; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Exercice Numéro 13

        Scanner clavier13 = new Scanner(System.in);
        System.out.println("Entrez le nombre numéro ");
        int nbr13 = clavier13.nextInt();

        for (int i = 0; i < nbr13; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Exercice Numéro 14
        Scanner clavier14 = new Scanner(System.in);
        System.out.println("Entrez le nombre numéro");
        int nbr14 = clavier14.nextInt();

        for (int i = nbr14; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }

        // Exercice Numéro 15
        Scanner clavier15 = new Scanner(System.in);
        System.out.println("Entrez le nombre numéro");
        int nbr15 = clavier15.nextInt();
        for (int i = nbr15; i >= 1; i--) {
            for (int k = 0; k < (nbr15 -i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


        // Exercice Numéro 16
        Scanner clavier16 = new Scanner(System.in);
        System.out.println("Entrez le nombre numéro");
        int nbr16 = clavier16.nextInt();
        for (int i = 1; i <= nbr16; i++) {
            for (int k = 0; k < (nbr16 -i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // Exercice Numéro 16
        Scanner clavier17 = new Scanner(System.in);
        System.out.println("Entrez le nombre numéro");
        int nbr17 = clavier17.nextInt();
        for (int i = nbr17 - 1; i >= 1; i--) {
            for (int k = 0; k < (nbr17 -i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
