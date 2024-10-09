package tp2;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur de saisir une date au format jj/mm/yyyy
        System.out.println("Veuillez saisir une date au format (jj/mm/yyyy) : ");
        String datei = sc.nextLine();

        // Extraction des parties de la date
        String jj = datei.substring(0, 2); // Jour
        String mm = datei.substring(3, 5); // Mois
        String yyyy = datei.substring(6, 10); // Année

        // Convertir les parties jour et mois en entiers avec parseInt
        int jour = Integer.parseInt(jj);
        int mois = Integer.parseInt(mm);
        int annee = Integer.parseInt(yyyy);

        // Variable pour stocker le mois en texte
        String moisTexte = "";

        // Switch case pour convertir le mois en format texte
        switch (mois) {
            case 1:
                moisTexte = "Janvier";
                break;
            case 2:
                moisTexte = "Février";
                break;
            case 3:
                moisTexte = "Mars";
                break;
            case 4:
                moisTexte = "Avril";
                break;
            case 5:
                moisTexte = "Mai";
                break;
            case 6:
                moisTexte = "Juin";
                break;
            case 7:
                moisTexte = "Juillet";
                break;
            case 8:
                moisTexte = "Août";
                break;
            case 9:
                moisTexte = "Septembre";
                break;
            case 10:
                moisTexte = "Octobre";
                break;
            case 11:
                moisTexte = "Novembre";
                break;
            case 12:
                moisTexte = "Décembre";
                break;
            default:
                System.out.println("Format de la date incompréhensible");
                return; // On sort du programme si le mois est incorrect
        }

        // Afficher la date au format jj mois yyyy
        System.out.println(jour + " " + moisTexte + " " + annee);

        // Fermeture du scanner
        sc.close();
    }
}


//  Scanner sc = new Scanner(System.in); : Création d’un objet Scanner pour
// lire les entrées de l’utilisateur.
// • String datei = sc.nextLine(); : Lecture de la date saisie par l’utilisateur sous
// forme de chaîne de caractères.
// • substring : Extraction des parties jour, mois et année de la chaîne de caractères.
// • Integer.parseInt() : Conversion des sous-chaînes en entiers pour le jour et le
// mois.
// • switch (mois) : Utilisation de switch pour convertir le mois numérique en son
// équivalent textuel.
// • System.out.println(...) : Affichage de la date formatée.
// • sc.close(); : Fermeture de l’objet Scanner
