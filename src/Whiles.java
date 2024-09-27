import java.util.ArrayList;
import java.util.Scanner;

public class Whiles {

    public static void main(String[] args) {
    /*
        // Exercie Numéro 1
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 1 et 3 : ");
        int number = keyboard.nextInt();
        while (number < 1 || number > 3) {
            System.out.println("Réessayez! Le nombre doit être entre 1 et 3.");
            number = keyboard.nextInt(); // Redemander un nombre
        }
        System.out.println("Le nombre " + number + " me convient.");

        // Exercice Numéro 2
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Entrez un nombre entre 10 et 20 : ");
        int number2 = keyboard2.nextInt();
        while (number2 < 10 || number2 > 20) {
            if (number2 > 20) {
                System.out.println("« Plus petit ! »");
                number2 = keyboard2.nextInt();
            } else if (number2 < 10) {
                System.out.println("« Plus grand ! »");
                number2 = keyboard2.nextInt();
            }
        }
        System.out.println("Le nombre " + number2 + " me convient.");

        // Exercice Numéro 3

        ArrayList<Integer> tableau = new ArrayList<>();
        int temp = 0;
        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int number3 = keyboard3.nextInt();
        tableau.add(number3);
        while (number3 > 0) {
            System.out.println("Entrez un nouveau nombre : ");
            number3 = keyboard3.nextInt();
            tableau.add(number3);
        }
        for (int i = 1; i < tableau.size(); i++) {
            if (tableau.get(i) > temp) {
                temp = tableau.get(i);
            }
        }
        System.out.println("Le plus grand nombre est : " + temp + " est sa position est : " + tableau.indexOf(temp));
        System.out.println("Le processus s'est arrêté!");

        // Exercice Numéro 4
        Scanner keyboard4 = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int number4 = keyboard4.nextInt();
        int somme = number4;
        while (number4 > 0) {
            System.out.println("Entrez un nouveau nombre : ");
            number4 = keyboard4.nextInt();
            somme += number4;
        }
        System.out.println("Je paye : ");
        int payer = keyboard4.nextInt();
        int rendreMonnaie = (somme - payer);

        System.out.println("Payer : " + payer);
        System.out.println("Somme : " + somme);
        System.out.println("RendreMonnaie : " + rendreMonnaie);

        int coupure10 = rendreMonnaie / 10;
        rendreMonnaie = rendreMonnaie % 10;
        System.out.println("10 Euros : " + "Voici " + coupure10 + " billet(s)");

        int coupure5 = rendreMonnaie / 5;
        rendreMonnaie = rendreMonnaie % 5;
        System.out.println("5 Euros : " + "Voici " + coupure5 + " billet(s)");

        int coupure1 = rendreMonnaie / 1;
        rendreMonnaie = rendreMonnaie % 1;
        System.out.println("1 Euro : " + "Voici " + coupure1 + " billet(s)");
        System.out.println("Restant : " + rendreMonnaie);


        // Exercice Numéro 5
        // ArrayList<Integer> tableau5 = new ArrayList<>();
        Scanner keyboard5 = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int number5 = keyboard5.nextInt();
        int pos = number5;
        int neg = number5;
        int somme5 = number5;
        somme += number5;
        while (number5 > 0) {
            System.out.println("Entrez un nouveau nombre : ");
            number5 = keyboard5.nextInt();

            somme5 += number5;
            if (number5 > pos) { pos = number5; }
            if (number5 < neg && number5 != 0) {
                neg = number5;
            }
            // tableau5.add(number5);
        }

        System.out.println(pos);
        System.out.println(neg);
        System.out.println(somme);

        // Exercice Numéro 6
        Scanner keyboard6 = new Scanner(System.in);
        System.out.println("Cachez le nombre : ");
        int cache = keyboard6.nextInt();

        System.out.println("Devinez le nombre caché ");
        int number6;
        while (true) {
            //System.out.println("Devinez le nombre caché ");
            number6 = keyboard5.nextInt();

            if (number6 < cache) {
                System.out.println("C'est plus!");
            } else if (number6 > cache) {
                System.out.println("C'est moins!");
            } else{
                System.out.println("Bravo!");
                System.out.println("Le nombre caché est : " + cache);
                return;
            }
        }

        // Exercice Numéro 7
        Scanner keyboard7 = new Scanner(System.in);
        System.out.println("Cachez le nombre : ");
        int nombre7 = keyboard7.nextInt();
        int i = 1;
        while (i <= nombre7) {
            System.out.println(i);
            i++;
        }

        // Exercice Numéro 8
        Scanner keyboard8 = new Scanner(System.in);
        System.out.println("Cachez le nombre : ");
        int nombre8 = keyboard8.nextInt();
        int count = 0;

        while (nombre8 != 0) {
            nombre8 = nombre8 / 10;
            count++;
        }
        System.out.println("Nombre de chiffre : " + count);

        // Exercice Numéro 9
        Scanner keyboard9 = new Scanner(System.in);
        System.out.println("Vous êtes majeur ? ");
        String question = keyboard9.next();

        while (true) {
            if (question.equals("Oui") || question.equals("Non")) {
                System.out.println("D'accord! j'ai compris");
                return;
            } else {
                System.out.println("Vous êtes majeur ? ");
                question = keyboard9.next();
            }
        }

        // Exercice Numéro 10
        Scanner keyboard10 = new Scanner(System.in);
        System.out.println("Indiquez un nombre : ");
        int nombre10 = keyboard10.nextInt();
        int firstN;
        int lastN = nombre10 % 10;

        while (nombre10 >= 10) {
            nombre10 = nombre10 / 10;
        }
        firstN = nombre10;

        System.out.println("Le premier nombre est " + firstN + ", et le dernier nombre est " + lastN + ".");

     */

    }
}
