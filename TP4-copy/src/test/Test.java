package test;

import java.util.Scanner;

import entity.Reservation;

public class Test {

	// Tableau statique pour stocker les réservations
	public static Reservation[] tblResa = new Reservation[100];

	public static void main(String[] args) {

		// TODO: Créer la première réservation en appelant la méthode creerReservation
		Reservation.creerReservation();

		// TODO: Créer la deuxième réservation en appelant la méthode creerReservation
		Reservation.creerReservation();

		// TODO: Afficher la liste des réservations avant le tri
		System.out.println("---------------------------------");
		System.out.println("Affichage des réservations");
		afficherReservations();

	
		// TODO: Rechercher une réservation en appelant la méthode de recherche par son
		// ID et afficher le résultat
		System.out.println("---------------------------------");
		System.out.println("Recherche d'une reservation par id");
		Scanner scN =  new Scanner(System.in);
		System.out.println("Entrer l'id de reservation a rechercher");
		int id = scN.nextInt();
		int position = Reservation.rechercherReservationParID(id);
		if (position == -1) {
			System.out.println("La reservation "+ id + " n'existe pas");
		} else {
			System.out.println("La reservation existe dans la position "+ position);
		}
		
		// TODO: Appeler la méthode de tri des réservations
		Reservation.TrierReservations();
	    // TODO: Afficher la liste des réservations après le tri
		System.out.println("----------------------------");
		System.out.println("Affichage des réservations apres le tri");
		afficherReservations();
		
		
	}
	
	public static void afficherReservations() {
		for (int i = 0; i < tblResa.length; i++) {
			if (tblResa[i] != null) {
				System.out.println(tblResa[i]);
			}
		}
	}
	

}
