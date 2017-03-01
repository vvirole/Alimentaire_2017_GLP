
public class Producteur {
	private int Produire;
	private int ConsommeProd;
	private String Nom;
	public Producteur(int produire, int consommeProd, String nom) {
		super();
		Produire = produire;
		ConsommeProd = consommeProd;
		Nom = nom;
	}
	public int getProduire() {
		return Produire;
	}
	public void setProduire(int produire) {
		Produire = produire;
	}
	public int getConsommeProd() {
		return ConsommeProd;
	}
	public void setConsommeProd(int consommeProd) {
		ConsommeProd = consommeProd;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}

}
