package ex2.test;

import ex2.entity.Etudiant;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        // Créer les etudiants
        Etudiant ali = new Etudiant(1, "Ali", "Alawi", "CYB");
        Etudiant mehdi = new Etudiant(2, "Mehdi", "Mehdaoui", "IA");
        Etudiant  durant = new Etudiant(3, "Durant", "Durant", "SE");

        // Créer une liste «Etudiant »
        LinkedList<Etudiant> etds = new LinkedList<Etudiant>();

        // Insérer les trois étudiants suivants : « ali », « Mehdi », « durant »
        etds.add(ali);
        etds.add(mehdi);
        etds.add(durant);

        // Afficher la taille et le contenu de la liste
        System.out.println("La taille de la liste: "+ etds.size());
        System.out.println("\nAffichage de la liste");
        for (Etudiant et : etds) {
            System.out.println(et);
        }

        // Supprimer l’objet « ali»
        etds.remove(ali);
        System.out.println("\nAffichage de la liste apres la suppression de Ali");
        for (Etudiant et : etds) {
            System.out.println(et);
        }

        // Supprimer tous les éléments
        etds.clear();
        System.out.println("\nAffichage de la liste apres la suppression de touts les elements");
        for (Etudiant et : etds) {
            System.out.println(et);
        }

    }
}
