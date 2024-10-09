package tp2;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Afficher un menu pour choisir le type d'exercice
		System.out.println("Choisissez l'exercice :");
		System.out.println("1 - Somme de deux nombres");
		System.out.println("2 - Division de deux nombres");
		System.out.println("3 - Calcul du périmètre d'un cercle");

		int choix = sc.nextInt(); // Lecture du choix de l'utilisateur

		switch (choix) {
			case 1:
				// Exercice 1 : Somme de deux nombres
				System.out.println("Saisir le premier nombre");
				int a = sc.nextInt();

				System.out.println("Saisir le deuxième nombre");
				int b = sc.nextInt();

				int somme = a + b;
				System.out.println("La somme de " + a + " et " + b + " est : " + somme);
				break;

			case 2:
				// Exercice 2 : Division de deux nombres
				System.out.println("Saisir le premier nombre");
				int x = sc.nextInt();

				System.out.println("Saisir le deuxième nombre (différent de zéro)");
				int y = sc.nextInt();

				// Vérifier que le deuxième nombre n'est pas zéro
				if (y != 0) {
					float res = (float) x / y;
					System.out.println("Le résultat de la division de " + x + " par " + y + " est : " + res);
				} else {
					System.out.println("Erreur : Le deuxième nombre ne peut pas être zéro.");
				}
				break;

			case 3:
				// Exercice 3 : Calcul du périmètre d'un cercle
				System.out.println("Entrer le rayon r :");
				double r = sc.nextDouble();
				final double PI = 3.14; // final double PI = Math.PI;

				double perimetre = 2 * PI * r;

				System.out.println("Le périmètre du cercle de rayon " + r + " est : " + perimetre);
				break;

			default:
				System.out.println("Erreur : Choix non valide. Veuillez entrer 1, 2, ou 3.");
		}

		// Fermer le scanner
		sc.close();

	}

}


// Scanner sc = new Scanner(System.in); : Création d’un objet Scanner pour lire les entrées de l’utilisateur.
// • System.out.println(...) : Affichage.
// • int choix = sc.nextInt(); : Lecture du choix de l’utilisateur.
// • switch (choix) : Structure conditionnelle pour exécuter l’opération choisie.
// • case 1 : Calcul de la somme de deux nombres.
// • case 2 : Division de deux nombres avec vérification que le diviseur n’est pas zéro.
// • case 3 : Calcul du périmètre d’un cercle en utilisant la formule P = 2πr.
// • default : Gestion des choix non valides.
// • sc.close(); : Fermeture de l’objet Scanner pour libérer les ressources.
