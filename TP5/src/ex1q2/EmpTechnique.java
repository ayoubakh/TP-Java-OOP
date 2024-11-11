package ex1q2;

public class EmpTechnique  extends AbsCotisation{
    public String nom;
    public double solde;

    public final double TAUX = 0.06;

    public EmpTechnique(String nom, double solde) {
        this.nom = nom;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "EmpTechnique{" +
                "nom='" + nom + '\'' +
                ", solde=" + solde +
                '}';
    }

    @Override
    public double calculerCotisation(){
        return this.solde * TAUX;
    }
}
