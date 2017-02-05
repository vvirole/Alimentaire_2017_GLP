public class CarnivoreS extends Consommateur{
	private CarnivoreP AlimentP;
	private CarnivoreP AlimentS;
	public CarnivoreS(String nom, Temps nourrire, Temps evoluer, Temps reproduire, int survie, String environnement, String etat, CarnivoreP AlimentP, CarnivoreP AlimentS ) {
		super( nom,  nourrire,  evoluer,  reproduire,  survie,  environnement,  etat);
		this.AlimentP=AlimentP;
		this.AlimentS=AlimentS;
	}
	public CarnivoreP getAlimentP() {
		return AlimentP;
	}
	public void setAlimentP(CarnivoreP alimentP) {
		AlimentP = alimentP;
	}
	public CarnivoreP getAlimentS() {
		return AlimentS;
	}
	public void setAlimentS(CarnivoreP alimentS) {
		AlimentS = alimentS;
	}

}
