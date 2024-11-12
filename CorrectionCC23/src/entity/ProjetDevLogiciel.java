package entity;

import java.util.Arrays;

public class ProjetDevLogiciel extends Projet {
    private String langageProg;
    public Developpeur[] tblDev;

    public ProjetDevLogiciel(String nom, double budget, String langageProg, Developpeur[] tblDev) {
        super(nom, budget);
        this.langageProg = langageProg;
        this.tblDev = tblDev;
    }

    public String getLangageProg() {
        return langageProg;
    }

    public void setLangageProg(String langageProg) {
        this.langageProg = langageProg;
    }

    @Override
    public String toString() {
        return super.toString() + ", langageProg=" + langageProg + ", développeurs=" + Arrays.toString(tblDev);
    }

    public ProjetDevLogiciel[] trierProjets(ProjetDevLogiciel[] tProjDev) {
        for (int i = 0; i < tProjDev.length - 1; i++) {
            for (int j = i + 1; j < tProjDev.length; j++) {
                if (tProjDev[i] != null && tProjDev[j] != null && tProjDev[i].budget > tProjDev[j].budget) {
                    ProjetDevLogiciel temp = tProjDev[i];
                    tProjDev[i] = tProjDev[j];
                    tProjDev[j] = temp;
                }
            }
        }
        return tProjDev;
    }

    public int countDev() {
        int count = 0;
        for (int i = 0; i < tblDev.length; i++) {
            if (tblDev[i] != null) count++;
        }
        return count;
    }

    public ProjetDevLogiciel[] suppProjetVide(ProjetDevLogiciel[] tProjDev) {
		for (int i = 0; i < tProjDev.length; i++) {
			if (tProjDev[i] != null) {
				int nombreDevs = tProjDev[i].countDev();
				if (nombreDevs==0) {
					tProjDev[i] = null;
				}
			}
		}
		return tProjDev;
	}

   
}
