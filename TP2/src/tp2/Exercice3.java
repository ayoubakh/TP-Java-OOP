package tp2;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialisation du tableau
        System.out.println("Veuillez saisir la taille du tableau");
        int taille = sc.nextInt();
        int tbl[] = new int[taille];  
        
        System.out.println("Dimension du tableau : " + tbl.length);

        // Remplissage du tableau
        for (int i = 0; i < tbl.length; i++) {
            System.out.println("Veuillez saisir la valeur " + (i + 1) + " : ");
            tbl[i] = sc.nextInt();
        }

        // Affichage du tableau
        System.out.println("======= Affichage du tableau =======");
        for (int i = 0; i < tbl.length; i++) {
            System.out.println("tbl[" + i + "] = " + tbl[i]);
        }

        // Calcul de la somme
        double somme = 0;
        for (int i = 0; i < tbl.length; i++) {
            somme += tbl[i];
        }
        System.out.println("La somme = " + somme);

        // Exercice 2 : Calcul du min, max et moyenne
        System.out.println("****************************");
        int min = tbl[0]; // Initialisation du min au premier élément
        int max = tbl[0]; // Initialisation du max au premier élément
        double moyenne = 0;

        // Calcul des valeurs min, max, et la moyenne
        for (int i = 1; i < tbl.length; i++) {
            // Traitement du max
            if (max < tbl[i]) {
                max = tbl[i];
            }
            // Traitement du min
            if (min > tbl[i]) {
                min = tbl[i];
            }
        }
        // Calcul de la moyenne
        moyenne = somme / tbl.length;

        // Affichage des résultats
        System.out.println("La moyenne = " + moyenne);
        System.out.println("Le min = " + min);
        System.out.println("Le max = " + max);

        sc.close(); // Fermeture du scanner 
    }
}



