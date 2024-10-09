package tp3;

public class ResultatModule {
	// les attributs
	private int id;
	private double noteCC;
	private double noteTP;
	private double noteExamen;
	
	private static int compteur=0;
	
	// le constructeur 
	public ResultatModule(double noteCC, double noteTP, double noteExamen) {
		this.noteCC = noteCC;
		this.noteTP = noteTP;
		this.noteExamen = noteExamen;
		compteur++;
		this.id = compteur;
	}
	
	// Les accesseurs: Getters and setter
	// Getter: pour lire l'attribut
	// setter: pour modifier l'attribut
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getNoteCC() {
		return this.noteCC;
	}
	
	public void setNoteCC(double noteCC) {
		this.noteCC = noteCC;
	}
	
	public double getNoteTP() {
		return this.noteCC;
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
	
	
	// Affichage
	public String toString() {
		return "[ResulatModule: NoteCC: "+ this.noteCC
				+ " NoteTP: "+ this.noteTP
				+ " NoteExamen: "+ this.noteExamen
				+ "]"
				;
	}
	
	
	 public double calcMoyenne() {
		return 0.3*this.noteCC + 0.2*this.noteTP + 0.5* this.noteExamen;
	}
	
	 
	 public Boolean valideModule() {
		 return calcMoyenne() >= 10;
	 }
	 
	 public String valideModuleString() {
		 if (this.valideModule() == true) {
			 return "Le module est validé";
		 }else {
			 return "Le module n'est pas validé";
		 }
		 
		 
	 }
	 
	 
	 
	

	

}
