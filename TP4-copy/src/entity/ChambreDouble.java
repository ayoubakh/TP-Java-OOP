package entity;

public class ChambreDouble extends ChambreSimple{
	
	public int numLit;

	public ChambreDouble(int numChambre, boolean balcon, boolean tv, int numLit) {
		super(numChambre, balcon, tv);
		this.numLit = numLit;
	}

	@Override
	public String toString() {
		return "Chambre Double - " + super.toString() + ", nombre de lits: " + numLit;
	}
	
	

}
