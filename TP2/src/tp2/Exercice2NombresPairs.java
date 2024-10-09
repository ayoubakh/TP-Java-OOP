package tp2;

import java.util.Scanner;

public class Exercice2NombresPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur d'entrer une limite pour la somme des nombres pairs
        System.out.println("Veuillez entrer une limite pour la somme des nombres pairs : ");
        int limite = scanner.nextInt();
        
        // Solution avec for pour calculer la somme des nombres pairs
        int somme = 0;
        for (int j = 2; j < limite; j += 2) {
            somme += j;
        }
        System.out.println("La somme des nombres pairs inférieurs à " + limite + " (avec for) est : " + somme);
        
        // Solution avec while pour calculer la somme des nombres pairs
        somme = 0;
        int j = 2;
        while (j < limite) {
            somme += j;
            j += 2;
        }
        System.out.println("La somme des nombres pairs inférieurs à " + limite + " (avec while) est : " + somme);
        
        // Solution avec do-while pour calculer la somme des nombres pairs
        somme = 0;
        j = 2;
        do {
            somme += j;
            j += 2;
        } while (j < limite);
        System.out.println("La somme des nombres pairs inférieurs à " + limite + " (avec do-while) est : " + somme);
        
        scanner.close();
    }
}

