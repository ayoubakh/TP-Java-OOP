package tp2;

import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        // Générer un nombre aléatoire entre 0 et 100
        int nbrAleatoire = (int)(Math.random() * 100);
        int nbrTentative = 3;
        
        // Boucle pour les tentatives
        while (nbrTentative > 0) {
            System.out.println("Il vous reste " + nbrTentative + " tentative(s).");
            System.out.print("Veuillez saisir un nombre : ");
            int nbrS = sc.nextInt();
            
            if (nbrS == nbrAleatoire) {
                System.out.println("Félicitations ! Le nombre recherché était " + nbrAleatoire);
                break;
            } else if (nbrS > nbrAleatoire) {
                System.out.println("Le nombre recherché est plus petit que " + nbrS);
            } else {
                System.out.println("Le nombre recherché est plus grand que " + nbrS);
            }
 	
            nbrTentative--;	
            
            // Vérification après la dernière tentative
            if (nbrTentative == 0) {
                System.out.println("Désolé, vous avez épuisé toutes vos tentatives.");
                System.out.println("Le nombre recherché était : " + nbrAleatoire);
            }
        }
        
        sc.close();
    }
}
