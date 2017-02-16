public class CarnivoreS extends Consommateur{
	private String AlimentP;
	private String AlimentS;
	public CarnivoreS(String nom, int nourrire, int evoluer, int reproduire, int survie, String environnement, String etat, String AlimentP, String AlimentS ) {
		super( nom,  nourrire,  evoluer,  reproduire,  survie,  environnement,  etat);
		this.AlimentP=AlimentP;
		this.AlimentS=AlimentS;
	}
	public String getAlimentP() {
		return AlimentP;
	}
	public void setAlimentP(String alimentP) {
		AlimentP = alimentP;
	}
	public String getAlimentS() {
		return AlimentS;
	}
	public void setAlimentS(String alimentS) {
		AlimentS = alimentS;
	}

}
