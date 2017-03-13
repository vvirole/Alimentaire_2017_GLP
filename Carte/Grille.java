package Carte;
import Carte.Case;

public class Grille {
	private Case[][] Tab ;

	public Case[][] getTab() {
		return Tab;
	}

	public void setTab(Case[][] tab) {
		Tab = tab;
	}

	public Grille(Case[][] tab) {
		super();
		setTab(tab);
	}

	
}
/*int tableauEntier[] = new int[6];

//Ou encore

int[] tableauEntier2 = new int[6];*/