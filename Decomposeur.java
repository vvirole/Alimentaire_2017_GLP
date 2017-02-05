
public class Decomposeur {
	private Temps Decompose;
	private boolean Decomposer;
	private String Nom;
	public Decomposeur(Temps decompose, boolean decomposer, String nom) {
		super();
		Decompose = decompose;
		Decomposer = decomposer;
		Nom = nom;
	}
	public Temps getDecompose() {
		return Decompose;
	}
	public void setDecompose(Temps decompose) {
		Decompose = decompose;
	}
	public boolean isDecomposer() {
		return Decomposer;
	}
	public void setDecomposer(boolean decomposer) {
		Decomposer = decomposer;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
}
