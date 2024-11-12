package entity;

public class Projet {
    public int id;
    public String nom;
    public double budget;
    
    public static int compteur = 1;

    public Projet(String nom, double budget) {
        this.id = compteur++;
        this.nom = nom;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Projet [id=" + id + ", nom=" + nom + ", budget=" + budget + "]";
    }
}
