package tp2;

import java.util.Scanner;

public class Exercice2Diviseurs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Demander à l'utilisateur d'entrer un nombre pour les diviseurs
		System.out.println("Veuillez entrer un nombre pour trouver ses diviseurs : ");
		int nombre = scanner.nextInt();

		// Solution avec for 
		System.out.println("Diviseurs de " + nombre + " (avec for) :");
		for (int i = 1; i <= nombre; i++) {
			if (nombre % i == 0) {
				System.out.println(i);
			}
		}

		// Solution avec while 
		System.out.println("Diviseurs de " + nombre + " (avec while) :");
		int i = 1;
		while (i <= nombre) {
			if (nombre % i == 0) {
				System.out.println(i);
			}
			i++;
		}

		// Solution avec do-while 
		System.out.println("Diviseurs de " + nombre + " (avec do-while) :");
		i = 1;
		do {
			if (nombre % i == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= nombre);

		scanner.close();
	}
}
