import java.util.*;

public class Exam1 {

    public static void main(String[] args) {
        sommeHarmonique(5);
        parfait(15);
        afficheEntiers(36);
        char[] tab1 = {'a','b','c','d'};
        int[] tab2 = {2,2,3,4};
        genererMot(tab1, tab2);

        Integer[] tabDiff1 = {6,20,12,1000,8}, tabDiff2 = {2,8,6,7,12};
        difference(tabDiff1,tabDiff2);
    }

    // Exercie Numéro 1 :

    public static void sommeHarmonique(Integer n) {
        double harmonique = 0;
        for (int i = 1; i <= n; i++) {
            harmonique += (double) 1 / i;
        }
        System.out.println(harmonique);
    }

    // Exercie Numéro 2 :

    public static void parfait(int n) {
        boolean t = false;
        for (int i = 1; i <= n; i++) {
            t = i + i == n;
            if (t) {
                System.out.println(t);
                return;
            }
        }
        System.out.println(t);
    }
     // Exercice Numéro 3 :

    public static void afficheEntiers(Integer n) {
        for (int i = 1; i <= n; i++) {
            if ( i % 5 == 0 && i % 7 == 0) {
                System.out.print("M" + 57 + " ");
            } else if ( i % 5 == 0 ) {
                System.out.print("M" + 5 + " ");
            } else if (i % 7 == 0) {
                System.out.print("M" + 7 + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    // Exercice Numéro 4 :
    public static void genererMot(char[] tab1, int[] tab2) {
        //System.out.println(tab1);
        //System.out.println(Arrays.toString(tab2));
        for (int i = 0; i < tab2.length; i++) {
            //System.out.println(tab2[i]);
            for (int j = 0; j < tab2[i]; j++) {
                System.out.print(tab1[i]);
            }
        }
    }

    // Exercice Numéro 5 :
    public static void difference(Integer[] tab1, Integer[] tab2) {
        List<Integer> newTab = new ArrayList<>();
        for (int i = 0; i < tab1.length; i++) {
            newTab.add(tab2[i]);
            newTab.add(tab1[i]);
        }
        // System.out.println(Arrays.toString(tab1));
        // System.out.println(Arrays.toString(tab2));
        List<Integer> nonDup = new ArrayList<>();
        for (Integer s : newTab) {
            if (Collections.frequency(newTab, s) == 1) {
                nonDup.add(s);
            }
        }
        System.out.println(nonDup);

    }

}
