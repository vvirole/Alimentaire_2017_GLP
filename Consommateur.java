
public abstract class Consommateur {
	protected String Nom;
	protected Temps Nourrire;
	protected Temps Evoluer;
	protected Temps Reproduire;
	protected int Survie;
	protected String Environnement;
	protected String Etat;
	public Consommateur(String nom, Temps nourrire, Temps evoluer, Temps reproduire, int survie, String environnement, String etat) {
		super();
		Nom = nom;
		Nourrire = nourrire;
		Evoluer = evoluer;
		Reproduire = reproduire;
		Survie = survie;
		Environnement = environnement;
		Etat = etat;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Temps getNourrire() {
		return Nourrire;
	}
	public void setNourrire(Temps nourrire) {
		Nourrire = nourrire;
	}
	public Temps getEvoluer() {
		return Evoluer;
	}
	public void setEvoluer(Temps evoluer) {
		Evoluer = evoluer;
	}
	public Temps getReproduire() {
		return Reproduire;
	}
	public void setReproduire(Temps reproduire) {
		Reproduire = reproduire;
	}
	public int getSurvie() {
		return Survie;
	}
	public void setSurvie(int survie) {
		Survie = survie;
	}
	public String getEnvironnement() {
		return Environnement;
	}
	public void setEnvironnement(String environnement) {
		Environnement = environnement;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}

}
