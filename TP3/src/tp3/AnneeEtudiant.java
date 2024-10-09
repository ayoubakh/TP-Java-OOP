package tp3;

public class AnneeEtudiant {
	
	private int idEtudiant;
	private int nombreModules;
	private ResultatModule[] resModules =  new ResultatModule[20] ;
	
	public AnneeEtudiant(int idEtudiant, int nombreModules, ResultatModule[] resModules) {
		this.idEtudiant = idEtudiant;
		this.nombreModules = nombreModules;
		this.resModules = resModules;
	}

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
		this.resModules = resModules;
	}
	
	public double moyenneAnnee() {
		double somme = 0;
		//int cmpt = 0;
		for (int i =0; i< this.resModules.length; i++) {
			if (resModules[i]!=null) {
				somme+= resModules[i].calcMoyenne();
				//cmpt++;
			}
			
		}
		return somme/this.nombreModules;
	}
	
	
	public int nombreValides() {
		int nombreModuleValides = 0;
		for (int i =0; i< this.resModules.length; i++) {
			if (resModules[i]!=null) {
				if (resModules[i].valideModule()) {
					nombreModuleValides++;}
				}
			}
		return nombreModuleValides;
	}
	
	
	public void modulesEtuidant() {
		for(int i=0; i<resModules.length; i++) {
			if (resModules[i]!=null)
			System.out.println(resModules[i].toString());
		}
	}
	
	
	
	

}
