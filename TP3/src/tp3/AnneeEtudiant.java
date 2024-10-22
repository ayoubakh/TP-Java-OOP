package tp3;

public class AnneeEtudiant {
	
	// Attributs
	private int idEtudiant;  
	private int nombreModules;  
	private ResultatModule[] resModules;  

	// Constructeur
	public AnneeEtudiant(int idEtudiant, int nombreModules, ResultatModule[] resModules) {
		this.idEtudiant = idEtudiant;
		this.nombreModules = nombreModules;
		this.resModules = resModules;
	}

	// Getters et Setters
	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public int getNombreModules() {
		return nombreModules;
	}

	public void setNombreModules(int nombreModules) {
		this.nombreModules = nombreModules;
	}

	public ResultatModule[] getResModules() {
		return resModules;
	}

	public void setResModules(ResultatModule[] resModules) {
		// Vérification si le tableau de modules est non nul avant de l'assigner
		if (resModules != null) {
			this.resModules = resModules;
		} else {
			System.out.println("Erreur : Le tableau des résultats ne peut pas être nul.");
		}
	}

	// Méthode pour calculer la moyenne annuelle de l'étudiant
	public double moyenneAnnee() {
		double somme = 0;
		int compteur = 0;
		
		// Calcul de la somme des moyennes de chaque module
		for (int i = 0; i < this.resModules.length; i++) {
			if (resModules[i] != null) { 
				somme += resModules[i].calcMoyenne();
				compteur++;
			}
		}
		return  somme / compteur ;
	}

	// Méthode pour compter le nombre de modules validés (moyenne >= 10)
	public int nombreValides() {
		int nombreModuleValides = 0;
		
		// Parcours des modules pour vérifier ceux qui sont validés
		for (int i = 0; i < this.resModules.length; i++) {
			if (resModules[i] != null && resModules[i].valideModule()) {
				nombreModuleValides++;
			}
		}
		return nombreModuleValides;
	}
}
