package entity;

import java.util.Date;
import java.util.Scanner;

import test.Test;

public class Reservation {
	public int idReservation;
	public Date dateDebut;
	public int nombreNuits;
	public ChambreSimple chambre;
	public String nomClient;

	public static int compteur = 0;

	static Reservation[] tblResa = Test.tblResa;

	// Constructeur
	public Reservation(Date dateDebut, int nombreNuits, ChambreSimple chambre, String nomClient) {
		this.idReservation = ++compteur;
		this.dateDebut = dateDebut;
		this.nombreNuits = nombreNuits;
		this.chambre = chambre;
		this.nomClient = nomClient;
	}

	// Redéfinition de la méthode toString pour afficher les détails de la
	// réservation
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateDebut=" + dateDebut + ", nombreNuits="
				+ nombreNuits + ", chambre=" + chambre + ", nomClient=" + nomClient + "]";
	}

	// Méthode pour créer une réservation (à compléter)
	public static boolean creerReservation() {
		Scanner scN = new Scanner(System.in); // Scanner pour les nombres
		Scanner scS = new Scanner(System.in); // Scanner pour les chaînes de caractères
		boolean saved = false; // Résultat de l'enregistrement de la réservation, initialisé à false

		// Step 1 - Choix du type de chambre par l'utilisateur
		System.out.println("Veuillez choisir le type de chambre à réserver :");
		System.out.println("1 ==> Chambre Simple");
		System.out.println("2 ==> Chambre Double");
		System.out.println("3 ==> Suite Royale");
		int choix = scN.nextInt();

		ChambreSimple chambreReserve = null;

		// Infos des chambres en dur pour simplifier
		// Pas de contrainte sur le nombre de chambres disponibles
		switch (choix) {
		case 1: {
			// Pour simplifier, les chambres simples ont la même configuration
			chambreReserve = new ChambreSimple(1, true, false);
			break;
		}
		case 2: {
			chambreReserve = new ChambreDouble(1, true, true, 2);
			break;
		}
		case 3: {
			chambreReserve = new SuiteRoyale(1, true, true, "Belle suite");
			break;
		}
		default:
			System.out.println("Veuillez choisir 1, 2 ou 3 !");
		}

		// Step 2 - Créer l'objet de la réservation
		System.out.println("Entrer le nom du client");
		String nomClient = scS.next();

		System.out.println("Entrer le nombre des nuits");
		int nombreNuits = scN.nextInt();

		Reservation res = new Reservation(new Date(), nombreNuits, chambreReserve, nomClient);

		// Step 3 - Enregistrer la réservation dans la table des réservations
		// TODO <<<<<<===================

		for (int i = 0; i < tblResa.length; i++) {
			if (tblResa[i] == null) {
				tblResa[i] = res;
				saved = true;
				break;
			}

		}

		// Step 4 - Retourner le résultat de l'enregistrement (true/false)
		return saved;
	}

	// Méthode pour rechercher une réservation par son ID (à compléter)
	public static int rechercherReservationParID(int idResa) {
		int position = -1;
		for (int i = 0; i < tblResa.length; i++) {
			if (tblResa[i] != null && tblResa[i].idReservation == idResa) {
				position = i;
				break;
			}

		}
		return position;
	}

	// Méthode pour trier les réservations (à compléter)
	public static void TrierReservations() {
		Reservation temp = null;
		for (int i = 0; i < tblResa.length; i++) {
			for (int j = i + 1; j < tblResa.length; j++) {
				if (tblResa[i] != null && tblResa[j] != null) {
					if(tblResa[i].nombreNuits > tblResa[j].nombreNuits) {
						temp = tblResa[i];
						tblResa[i] = tblResa[j];
						tblResa[j] = temp;
					}
				}
			}
		}

	}
}
