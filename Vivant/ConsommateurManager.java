package Vivant;
import Temps.CompteurB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ConsommateurManager {
	public static HashMap <String, CompteurB >  HashConsommateur  = new HashMap<String, CompteurB> ( 40 ) ;
	private String NomBiome;
	public ConsommateurManager(String nomBiome) {
		super();
		NomBiome = nomBiome;
	}
	public void creatHashConso() throws IOException{
	BufferedReader fichier = new BufferedReader(new FileReader("ListeConsommateur"+NomBiome+".txt"));
		while(fichier.readLine()!= null){
			HashConsommateur.put(fichier.readLine(), new CompteurB(600, 0));
		}
	fichier.close();
	}
}

