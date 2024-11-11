package ex1q1;

public class EmpAdministratif  implements Cotisation{
    public String nom;
    public double solde;

    public final double TAUX = 0.07;

    public EmpAdministratif(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "EmpAdministratif{" +
                "nom='" + nom + '\'' +
                ", solde=" + solde +
                '}';
    }

    @Override
    public double calculerCotisation(){
        return this.solde * TAUX;
    }
}
