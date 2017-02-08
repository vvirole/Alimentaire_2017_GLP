
public class CarnivoreP extends Consommateur{
	private Herbivore AlimentP;
	private Herbivore AlimentS;
	public CarnivoreP(String nom, int nourrire, int evoluer, int reproduire, int survie, String environnement, String etat, Herbivore AlimentP, Herbivore AlimentS ) {
		super( nom,  nourrire,  evoluer,  reproduire,  survie,  environnement,  etat);
		this.AlimentP=AlimentP;
		this.AlimentS=AlimentS;
 }
	public Herbivore getAlimentP() {
		return AlimentP;
	}
	public void setAlimentP(Herbivore alimentP) {
		AlimentP = alimentP;
	}
	public Herbivore getAlimentS() {
		return AlimentS;
	}
	public void setAlimentS(Herbivore alimentS) {
		AlimentS = alimentS;
	}
	
}
