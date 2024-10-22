package entity;

public class ChambreSimple {
	public int numChambre;
	public boolean balcon;
	public boolean tv;
	
	public ChambreSimple(int numChambre, boolean balcon, boolean tv) {
		this.numChambre = numChambre;
		this.balcon = balcon;
		this.tv = tv;
	}

	@Override
	public String toString() {
		return "ChambreSimple [numChambre=" + numChambre + ", balcon=" + balcon + ", tv=" + tv + "]";
	}
	
	
	
}
