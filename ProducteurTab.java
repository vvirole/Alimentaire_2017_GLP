import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ProducteurTab {
	private Producteur [] CatalogueProducteur;

	public ProducteurTab() {
		super();

	}
	public void CreatCatalogue() throws NumberFormatException, IOException{
		BufferedReader fichierP = new BufferedReader(new FileReader("CatalogueCarnivoreP.txt"));
		for(int i=0; i<35; i++){
			CatalogueProducteur[i]= new Producteur(Integer.parseInt(fichierP.readLine()), Integer.parseInt(fichierP.readLine()), fichierP.readLine());
		}
		fichierP.close();	
	}

	public Producteur getProducteurInfo(String Nom){  // coder la gestion des erreurs
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueProducteur[i].getNom().equals(Nom)){
				j=i;
			}

		}
		return CatalogueProducteur[j];
	}
	

}
