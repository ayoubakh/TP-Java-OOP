package ex2.test;

import ex2.entity.Etudiant;

import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {

        // Créer les etudiants
        Etudiant ali = new Etudiant(3, "Ali", "Alawi", "CYB");
        Etudiant mehdi = new Etudiant(1, "Mehdi", "Mehdaoui", "IA");
        Etudiant  durant = new Etudiant(2, "Durant", "Durant", "SE");

        // Créer une liste «Etudiant »
        LinkedList<Etudiant> etds = new LinkedList<Etudiant>();
        etds.add(ali);
        etds.add(mehdi);
        etds.add(durant);

        // Recherche par code
        if(Etudiant.rechercheParCode(etds, 1)) {
            System.out.println("L etudiant existe " );
        }else {
            System.out.println("L etudiant  n exist pas");
        }

        // Affichage
        System.out.println("\nAffichage de la liste des etudiants" );
        Etudiant.affichage(etds);

        // Le tri
        LinkedList<Etudiant> listeEtdsTriee =  Etudiant.trierListe(etds);
        // Affichage
        System.out.println("\nAffichage de la liste des etudiants apres le tri" );
        Etudiant.affichage(listeEtdsTriee);



    }
}
