package entity;

public class SuiteRoyale  extends ChambreSimple{
	public String nomSuite;

	public SuiteRoyale(int numChambre, boolean balcon,boolean tv, String nomSuite) {
		super(numChambre, balcon, tv);
		this.nomSuite = nomSuite;
	}

	@Override
	public String toString() {
		return "SuiteRoyale - " +super.toString() + ",  de la suite: "+nomSuite ;
	}
	
	

}
