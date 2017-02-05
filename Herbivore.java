
public class Herbivore {
	private RessourceProd AlimentP;
	private RessourceProd AlimentS;
	public Herbivore(String nom, Temps nourrire, Temps evoluer, Temps reproduire, int survie, String environnement, String etat, RessourceProd AlimentP ,  RessourceProd AlimentS){
		super.Consommateur(String nom, Temps nourrire, Temps evoluer, Temps reproduire, int survie, String environnement, String etat);
		this.AlimentP=AlimentP;
		this.AlimentS=AlimentS;
	}
	public RessourceProd getAlimentP() {
		return AlimentP;
	}
	public void setAlimentP(RessourceProd alimentP) {
		AlimentP = alimentP;
	}
	public RessourceProd getAlimentS() {
		return AlimentS;
	}
	public void setAlimentS(RessourceProd alimentS) {
		AlimentS = alimentS;
	}

}
