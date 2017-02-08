package chronometre;

public class Compteur {
	private int valeur;

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public Compteur() {
		valeur=0;
	}
	public void increment() {
		value++;
	}

	public void decrement() {
		value--;
	}
}
