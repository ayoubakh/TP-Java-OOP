package entity;

public class ProjetMarketing extends Projet{
	 public String publicCible;
	    public Developpeur responsable;

	    public ProjetMarketing(String nom, double budget, String publicCible, Developpeur responsable) {
	        super(nom, budget);
	        this.publicCible = publicCible;
	        this.responsable = responsable;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", publicCible=" + publicCible + ", responsable=" + responsable;
	    }
}
