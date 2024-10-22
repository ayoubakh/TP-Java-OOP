package tp3;

public class ResultatModule {
    // Les attributs
    private int id;
    private double noteCC;
    private double noteTP;
    private double noteExamen;
    
    private static int compteur = 0;
    
    // Le constructeur
    public ResultatModule(double noteCC, double noteTP, double noteExamen) {
        this.noteCC = noteCC;
        this.noteTP = noteTP;
        this.noteExamen = noteExamen;
        compteur++;
        this.id = compteur;
    }
    
    // Les accesseurs: Getters et Setters
    
    public int getId() {
        return this.id;
    }

   // L'id est automatiquement incrémenté, donc nous ne voulons pas le modifier.
   // Par conséquent, il n'est pas nécessaire d'avoir un setter pour l'id (setId)..
    
    public double getNoteCC() {
        return this.noteCC;
    }
    
    public void setNoteCC(double noteCC) {
    	this.noteCC = noteCC;
    }
    
    public double getNoteTP() {
        return this.noteTP;
    }
    
    public void setNoteTP(double noteTP) {
    	this.noteTP = noteTP;
    }
    
    public double getNoteExamen() {
        return this.noteExamen;
    }
    
    public void setNoteExamen(double noteExamen) {
            this.noteExamen = noteExamen;
    }
    
    // Méthode pour calculer la moyenne
    public double calcMoyenne() {
        return 0.3 * this.noteCC + 0.2 * this.noteTP + 0.5 * this.noteExamen;
    }
    
    // Vérification de la validation du module
    public boolean valideModule() {
        return calcMoyenne() >= 10;
    }
    

	@Override
	public String toString() {
		return "ResultatModule ["
				+ "id=" + id 
				+ ", noteCC=" + noteCC
				+ ", noteTP=" + noteTP +
				", noteExamen=" + noteExamen
				+ "]";
	}
    

}
