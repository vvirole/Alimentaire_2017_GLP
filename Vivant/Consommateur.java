package Vivant;

public abstract class Consommateur {
	protected String Nom;
	protected int Nourrire;
	protected int Evoluer;
	protected int Reproduire;
	protected int Survie;
	protected String Environnement;
	protected String Etat;
	public Consommateur(String nom, int nourrire, int evoluer, int reproduire, int survie, String environnement, String etat) {
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
	public int getNourrire() {
		return Nourrire;
	}
	public void setNourrire(int nourrire) {
		Nourrire = nourrire;
	}
	public int getEvoluer() {
		return Evoluer;
	}
	public void setEvoluer(int evoluer) {
		Evoluer = evoluer;
	}
	public int getReproduire() {
		return Reproduire;
	}
	public void setReproduire(int reproduire) {
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

