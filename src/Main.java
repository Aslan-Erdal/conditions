import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Exercice Numéro 1 :
        // Ecrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par un charmant « Bonjour » suivi du prénom.
        Scanner sayHello = new Scanner(System.in);
        System.out.println("Quel est votre prénom ?");
        String username = sayHello.nextLine();
        System.out.println("Bonjour, " + username + "!");

        // Exercice Numéro 2 :
        // Ecrire un programme qui demande un nombre à l’utilisateur, puis qui calcule et affiche le carré de ce nombre.

        Scanner racineCarre = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int number = racineCarre.nextInt();
        System.out.println("Le carré de ce nombre " + number * number);

        // Exercice Numéro 3 :
        // Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe ensuite si ce nombre est positif ou négatif (on laisse de côté le cas où le nombre vaut zéro).
        Scanner posNeg = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nbrPosNeg = posNeg.nextInt();
        if (nbrPosNeg > 0) {
            System.out.println("Le nombre est positif");
        } else if (nbrPosNeg < 0) {
            System.out.println("Le nombre est négatif");
        }

        // Exercice Numéro 4 :
        // Ecrire un programme qui lit le prix HT d’un article, le nombre d’articles et le taux de TVA (ex :20), et qui fournit le prix total TTC correspondant
        Scanner tva = new Scanner(System.in);
        System.out.print("Indiquez le prix HT : ");
        double priceHt = tva.nextInt();

        double priceTva = priceHt * 0.20;
        System.out.println("TTC : " + (priceHt + priceTva));

        // Exercice Numéro 5 :
        // Ecrire un algorithme qui demande deux nombres à l’utilisateur et l’informe ensuite si leur produit est négatif ou positif (on laisse de côté le cas où le produit est nul). Attention toutefois : on ne doit pas calculer le produit des deux nombres.

        Scanner firstNumberF = new Scanner(System.in);
        System.out.println("Le premier number : ");
        int first = firstNumberF.nextInt();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Le second number : ");
        int second = firstNumberF.nextInt();

        if ((first > 0 && second > 0) || (first < 0 && second < 0)) {
            System.out.print("Le produit est positif");
        } else {
            System.out.print("Le produit est négatif");
        }

        // Exercice Numéro 6 :
        // Ecrire un algorithme qui demande trois nombres à l’utilisateur et l’informe ensuite s’ils sont rangés ou non dans l’ordre croissant.
        Scanner one = new Scanner(System.in);
        System.out.println("Le premier nombre : ");
        int numberOne = one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.println("Le second nombre : ");
        int numberTwo = one.nextInt();

        Scanner three = new Scanner(System.in);
        System.out.println("Le troisieme nombre : ");
        int numberThree = one.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree && numberTwo > numberThree) {
            System.out.print("Les nombres sont croissant");
        } else {
            System.out.println("Les nombres sont décroissant");
        }



        // Exercice Numéro 7 :
        // Ecrire un algorithme qui permet d’afficher la valeur absolue d'un réel saisie au clavier . |x|=x si x>0
        //|x|=-xsi x<0
        Scanner x = new Scanner(System.in);
        int xValue = x.nextInt();
        if (xValue > 0) {
            System.out.println("la valeur absolue  : " + xValue);
        } else if (xValue < 0){
            System.out.println("La valeur absolue : " + -xValue);
        }

        // Exercice Numéro 8 :
        // Écrire un algorithme qui : demande à l’utilisateur deux nombres, et l'informe s'il y a au moins un positif.
        Scanner fNumber = new Scanner(System.in);
        System.out.println("Le premier nombre : ");
        int firstNumber1 = fNumber.nextInt();

        Scanner sNumber = new Scanner(System.in);
        System.out.println("Le second nombre : ");
        int secondNumber2 = sNumber.nextInt();

        if (firstNumber1 > 0 && secondNumber2 > 0) {
            System.out.println("Tous les nombre sont positifs");
        } else {
            System.out.println("Il y a au moins un nombre positif");
        }

        // Exercice Numéro 9 :
        // Ecrire un algorithme qui demande un nombre à l’utilisateur, et l’informe ensuite si ce nombre est positif ou négatif (on inclut cette fois le traitement du cas où le nombre vaut zéro).
        Scanner uNumber = new Scanner(System.in);
        System.out.println("Le premier nombre : ");
        int userNumber = uNumber.nextInt();

        if (userNumber > 0) {
            System.out.println("Le nombre est positif !");
        } else if (userNumber < 0) {
            System.out.println("Le nombre est négatif !");
        } else {
            System.out.println("Le nombre est Zéro !");
        }

        // Exercice Numéro 10 :
        // Ecrire un algorithme qui demande deux nombres à l’utilisateur et l’informe ensuite si le produit est négatif ou positif (on inclut cette fois le traitement du cas où le produit peut être nul). Attention toutefois, on ne doit pas calculer le produit !
        Scanner firstNumberOne = new Scanner(System.in);
        System.out.println("Le premier number : ");
        int first1 = firstNumberOne.nextInt();

        Scanner secondNumberTwo = new Scanner(System.in);
        System.out.println("Le second number : ");
        int second2 = secondNumberTwo.nextInt();

        if (first1 > 0 && second2 > 0) {
            System.out.print("Le produit est positif");
        } else if ((first1 > 0 || second2 > 0) || (first1 < 0 || second2 < 0)) {
            System.out.print("Le produit est négatif");
        } else {
            System.out.print("Le produit est null");
        }

        // Exercice Numéro 11 :
        // Ecrire un algorithme qui demande l’âge d’un enfant à l’utilisateur. Ensuite, il l’informe de sa catégorie :
        //-"Poussin"de6à7ans -"Pupille"de8à9ans
        //- "Minime" de 10 à 11 ans - "Cadet" après 12 ans
        Scanner age = new Scanner(System.in);
        System.out.println("Quel est votre age ? ");
        int childAge = age.nextInt();

        if (childAge >= 6 && childAge <= 7) {
            System.out.println("Poussin");
        } else if (childAge >= 8 && childAge <= 9) {
            System.out.println("Pupille");
        } else if (childAge >= 10 && childAge <= 11) {
            System.out.println("Minime");
        } else if (childAge >= 12) {
            System.out.println("Cadet");
        }

        // Exercice Numéro 12 :
        // Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
        //Il lira au clavier l’heure et les minutes, et il affichera l’heure qu’il sera une minute plus tard. Par exemple, si l'utilisateur tape 21 puis 32, l'algorithme doit répondre :
        //"Dans une minute, il sera 21 heure(s) 33".
        //NB : on suppose que l'utilisateur entre une heure valide. Pas besoin donc de la vérifier.
        Scanner hour = new Scanner(System.in);
        System.out.println("Donne moi l'heure ? ");
        int hourTime = hour.nextInt();

        Scanner minute = new Scanner(System.in);
        System.out.println("Donne moi les minutes ? ");
        int minuteTime = minute.nextInt();
        int nextMinutes = minuteTime+1;
        System.out.println("Dans une minute, il sera "+hourTime + " heure(s) " + nextMinutes);

        // Exercice Numéro 13 :
        // De même que le précédent, cet algorithme doit demander une heure et en afficher une autre. Mais cette fois, il doit gérer également les secondes, et afficher l'heure qu'il sera une seconde plus tard.
        //Par exemple, si l'utilisateur tape 21, puis 32, puis 8, l'algorithme doit répondre : "Dans une seconde, il sera 21 heure(s), 32 minute(s) et 9 seconde(s)".
        //NB : là encore, on suppose que l'utilisateur entre une heure valide.

        Scanner hourD = new Scanner(System.in);
        System.out.println("Donne moi l'heure ? ");
        int hourTimeD = hourD.nextInt();

        Scanner minuteD = new Scanner(System.in);
        System.out.println("Donne moi les minutes ? ");
        int minuteTimeD = minuteD.nextInt();

        Scanner secondes = new Scanner(System.in);
        System.out.println("Donne moi les secondes ? ");
        int secondTimeD = secondes.nextInt();

        int nextSeconds = secondTimeD+1;
        System.out.println("Dans une seconde, il sera " + hourTimeD + " heure(s), " + minuteTimeD +" minute(s) et " + nextSeconds + " seconde(s)");

        // Exercice Numéro 14 :
        // Un magasin de reprographie facture 0,10 E les dix premières photocopies, 0,09 E les vingt suivantes et 0,08 E au-delà. Ecrivez un algorithme qui demande à l’utilisateur le nombre de photocopies effectuées et qui affiche la facture correspondante.

        Scanner nbrCopie = new Scanner(System.in);
        System.out.println("Indiquez le nombre de copie : ");

        int userNbrCopie = nbrCopie.nextInt();

        if (userNbrCopie == 10 ) {
            System.out.println("Le nombre de copie est " + userNbrCopie + " et votre facture est de " + (userNbrCopie * 0.10) + "$");
        } else if (userNbrCopie == 20) {
            System.out.println("Le nombre de copie est " + userNbrCopie + " et votre facture est de " + (userNbrCopie * 0.09) + "$");
        } else if (userNbrCopie > 20) {
            System.out.println("Le nombre de copie est " + userNbrCopie + " et votre facture est de " + (userNbrCopie * 0.08) + "$");
        }

        // Exercice Numéro 15 :
        // Les habitants de Zorglub paient l’impôt selon les règles suivantes : - les hommes de plus de 20 ans paient l’impôt
        //- les femmes paient l’impôt si elles ont entre 18 et 35 ans
        //- les autres ne paient pas d’impôt
        //Le programme demandera donc l’âge et le sexe du Zorglubien, et se prononcera donc ensuite sur le fait que l’habitant est imposable.

        Scanner sexe = new Scanner(System.in);
        System.out.println("Quel est votre sexe ?");
        String userSexe = sexe.next();

        Scanner pAge = new Scanner(System.in);
        System.out.println("Quel est votre âge ?");
        int userAge = pAge.nextInt();

        if (userSexe.equals("homme") && userAge >= 20) {
            System.out.println("Vous payez les impôts à partir de 20 ans");
        } else if (userSexe.equals("femme") && (userAge >= 18 && userAge <= 35 )) {
            System.out.println("Vous payez les impôts entre 18 et 35 ans");
        } else {
            System.out.println("Vous ne payez pas d'impots");
        }


        // Exercice Numéro 16 :
        // On désire écrire un algorithme qui permet d’afficher le jour correspondant à un chiffre allant de1à7,entréauclavier.

        Scanner j = new Scanner(System.in);
        System.out.println("Entrez un chiffre correspondant au jour de la semaine : ");
        int weekDay = j.nextInt();

        switch(weekDay) {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
            default:
                System.out.println("je ne connais pas, désolé !");
        }

        // Exercice Numéro 17
        // Ecrire un algorithme qui permet de saisir deux nombres entiers x ,y et les afficher à l’écran dans l’ordre croissant.

        Scanner nbr1 = new Scanner(System.in);
        System.out.println("Entrez le nombre x : ");
        int nbrX = nbr1.nextInt();

        Scanner nbr2 = new Scanner(System.in);
        System.out.println("Entrez le nombre y : ");
        int nbrY = nbr1.nextInt();

        List<Integer> nbrList = new ArrayList<>();
        nbrList.add(nbrX);
        nbrList.add(nbrY);
        Collections.sort(nbrList);
        System.out.print("Les nombres dans l'ordre croissant :");
        for (int n : nbrList) {
            System.out.print(" " + n);
        }

    }
}