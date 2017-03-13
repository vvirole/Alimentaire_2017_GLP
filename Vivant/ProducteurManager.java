package Vivant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import Temps.CompteurB;


public class ProducteurManager {
	public static HashMap <String, CompteurB >  HashProducteur  = new HashMap<String, CompteurB> ( 40 ) ;
	private String NomBiome;
	public ProducteurManager(String nomBiome) {
		super();
		NomBiome = nomBiome;
	}
	public void creatHashProd() throws IOException{
	BufferedReader fichier = new BufferedReader(new FileReader("ListeConsommateur"+NomBiome+".txt"));
		while(fichier.readLine()!= null){
			HashProducteur.put(fichier.readLine(), new CompteurB(600, 0));
		}
	fichier.close();
	}
}

