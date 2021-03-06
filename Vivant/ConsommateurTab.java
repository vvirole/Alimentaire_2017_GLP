package Vivant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ConsommateurTab {
	private static CarnivoreP [] CatalogueCarnivoreP;
	private static CarnivoreS [] CatalogueCarnivoreS;
	private static Herbivore [] CatalogueHerbivore;

	public ConsommateurTab() {
		super();

	}
	public void CreatCatalogue() throws NumberFormatException, IOException{
		BufferedReader fichierCP = new BufferedReader(new FileReader("CatalogueCarnivoreP.txt"));
		for(int i=0; i<35; i++){
			CatalogueCarnivoreP[i]= new CarnivoreP(fichierCP.readLine(),Integer.parseInt(fichierCP.readLine()),Integer.parseInt(fichierCP.readLine()),Integer.parseInt(fichierCP.readLine()),Integer.parseInt(fichierCP.readLine()),fichierCP.readLine(),fichierCP.readLine(),fichierCP.readLine(),fichierCP.readLine());
		}
		fichierCP.close();	

		BufferedReader fichierCS = new BufferedReader(new FileReader("CatalogueCarnivoreS.txt"));
		for(int i=0; i<35; i++){
			CatalogueCarnivoreS[i]= new CarnivoreS(fichierCS.readLine(),Integer.parseInt(fichierCS.readLine()),Integer.parseInt(fichierCS.readLine()),Integer.parseInt(fichierCS.readLine()),Integer.parseInt(fichierCS.readLine()),fichierCS.readLine(),fichierCS.readLine(),fichierCS.readLine(),fichierCS.readLine());
		}
		fichierCS.close();	

		BufferedReader fichierH = new BufferedReader(new FileReader("CatalogueHerbivore.txt"));
		for(int i=0; i<35; i++){
			CatalogueHerbivore[i]= new Herbivore(fichierH.readLine(),Integer.parseInt(fichierH.readLine()),Integer.parseInt(fichierH.readLine()),Integer.parseInt(fichierH.readLine()),Integer.parseInt(fichierH.readLine()),fichierH.readLine(),fichierH.readLine(),fichierH.readLine(),fichierH.readLine());
		}
		fichierH.close();
	}
	public static CarnivoreP getCarnivorePInfo(String Nom){  // coder la gestion des erreurs
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueCarnivoreP[i].Nom.equals(Nom)){
				j=i;
			}

		}
		return CatalogueCarnivoreP[j];
	}
	
	public static CarnivoreS getCarnivoreSInfo(String Nom){  // coder la gestion des erreurs
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueCarnivoreS[i].Nom.equals(Nom)){
				j=i;
			}

		}
		return CatalogueCarnivoreS[j];
	}
	public static Herbivore getHerbivoreInfo(String Nom){  // coder la gestion des erreurs
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueHerbivore[i].Nom.equals(Nom)){
				j=i;
			}

		}
		return CatalogueHerbivore[j];
	}

	public static boolean estHerbivore(String NomHerbi, String NomEnvir){
		boolean bool;
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueHerbivore[i].Nom.equals(NomHerbi)){
				j=i;
			}

		}
			if(j!=-1){
				bool = true;
			}
			else{
				bool = false;
			}
		return bool;
		

}
	public static boolean estCarnivoreP(String NomCarniP, String NomEnvir){
		boolean bool;
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueCarnivoreP[i].Nom.equals(NomCarniP)){
				j=i;
			}

		}
			if(j!=-1){
				bool = true;
			}
			else{
				bool = false;
			}
		return bool;
		

}
	public static boolean estCarnivoreS(String NomCarniS, String NomEnvir){
		boolean bool;
		int j=-1;
		for (int i=0; i<35 ; i++){
			if(CatalogueCarnivoreS[i].Nom.equals(NomCarniS)){
				j=i;
			}

		}
			if(j!=-1){
				bool = true;
			}
			else{
				bool = false;
			}
		return bool;
		

}
}

