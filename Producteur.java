
public class Producteur {
	private Temps Produire;
	private Temps ConsommeProd;
	private String Nom;
	public Producteur(Temps produire, Temps consommeProd, String nom) {
		super();
		Produire = produire;
		ConsommeProd = consommeProd;
		Nom = nom;
	}
	public Temps getProduire() {
		return Produire;
	}
	public void setProduire(Temps produire) {
		Produire = produire;
	}
	public Temps getConsommeProd() {
		return ConsommeProd;
	}
	public void setConsommeProd(Temps consommeProd) {
		ConsommeProd = consommeProd;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}

}
