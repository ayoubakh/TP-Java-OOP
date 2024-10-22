package entity;

import java.util.Date;
import java.util.Scanner;

public class Reservation {
    public int idReservation;
    public Date dateDebut;
    public int nombreNuits;
    public ChambreSimple chambre;
    public String nomClient;

    // Constructeur
    public Reservation(int idReservation, Date dateDebut, int nombreNuits, ChambreSimple chambre, String nomClient) {
        this.idReservation = idReservation;
        this.dateDebut = dateDebut;
        this.nombreNuits = nombreNuits;
        this.chambre = chambre;
        this.nomClient = nomClient;
    }

    // Redéfinition de la méthode toString pour afficher les détails de la réservation
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
        // TODO <<<<<<===================
        
        // Step 3 - Enregistrer la réservation dans la table des réservations
        // TODO <<<<<<===================
        
        // Step 4 - Retourner le résultat de l'enregistrement (true/false)
        return saved;
    }

    // Méthode pour rechercher une réservation par son ID (à compléter)
    public static int rechercherReservationParID(int idResa) {
        int position = -1;
        // TODO : Compléter cette méthode pour rechercher une réservation par ID
        return position;
    }

    // Méthode pour trier les réservations (à compléter)
    public static void TrierReservation() {
        // TODO : Compléter cette méthode pour trier les réservations
    }
}
