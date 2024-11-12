package test;

import entity.*; // importer toutes les classes dans le package entity

public class Test {
	public static void main(String[] args) {

		// Création de développeurs
		Developpeur dev1 = new Developpeur(1, "Ahmed");
		Developpeur dev2 = new Developpeur(2, "Ayoub");

		// Initialisation du tableau des développeurs pour le premier projet
		Developpeur[] tblDev1 = new Developpeur[4];
		tblDev1[0] = dev1;
		tblDev1[1] = dev2;

		// Création d'un projet de développement logiciel avec des développeurs
		ProjetDevLogiciel projetDev1 = new ProjetDevLogiciel("Application Web", 1000000, "Java", tblDev1);

		// Création d'un autre projet de développement logiciel sans développeurs
		Developpeur[] tblDev2 = new Developpeur[4]; // Tableau vide
		ProjetDevLogiciel projetDev2 = new ProjetDevLogiciel("Application Mobile", 200000, "Flutter", tblDev2);

		// Création d'un tableau de projets pour tester les méthodes
		ProjetDevLogiciel[] tProjDev = new ProjetDevLogiciel[20];
		tProjDev[0] = projetDev1;
		tProjDev[1] = projetDev2;

		// Affichage des projets avant suppression
		System.out.println("==== Projets avant suppression des projets sans développeurs ====");
		for (int i = 0; i < tProjDev.length; i++) {
			if (tProjDev[i] != null) {
				System.out.println(tProjDev[i]);
			}
		}
		System.out.println("=================================================================\n");

		// Tri des projets par budget
		ProjetDevLogiciel[] tProjDevTrie = projetDev1.trierProjets(tProjDev);

		// Affichage des projets triés
		System.out.println("\n==== Projets triés par budget ====");
		for (int i = 0; i < tProjDevTrie.length; i++) {
			if (tProjDevTrie[i] != null) {
				System.out.println(tProjDevTrie[i]);
			}
		}
		System.out.println("==================================\n");

		// Suppression des projets sans développeurs
		ProjetDevLogiciel[] projetsApresSuppression = projetDev1.suppProjetVide(tProjDev);

		// Affichage des projets après suppression
		System.out.println("==== Projets après suppression des projets sans développeurs ====");
		for (int i = 0; i < projetsApresSuppression.length; i++) {
			if (projetsApresSuppression[i] != null) {
				System.out.println(projetsApresSuppression[i]);
			}
		}
		System.out.println("=================================================================\n");
	}
}
