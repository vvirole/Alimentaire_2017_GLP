package Carte;

import java.util.HashMap;

import Temps.CompteurB;
import Temps.Temps;
import Vivant.CarnivoreP;
import Vivant.CarnivoreS;
import Vivant.ConsommateurManager;
import Vivant.Decomposeur;
import Vivant.DecomposeurManager;
import Vivant.Herbivore;
import Vivant.Producteur;
import Vivant.ProducteurManager;


public class Biome {
	private String Nom;
	private Temps Horloge;
	private static HashMap <String, CompteurB >  ressourceProducteur  = new HashMap<String, CompteurB> ( 300 ) ;
	private static HashMap <String, CompteurB > ressourceDecompose  = new HashMap<String, CompteurB> ( 300 )  ;
	private String Environnement;
	public ConsommateurManager ConsommateurBiome;
	private DecomposeurManager DecomposeurBiome;
	public ProducteurManager ProducteurBiome;
	public Biome(String nom, Temps horloge, String environnement,
			ConsommateurManager consommateurBiome,
			DecomposeurManager decomposeurBiome,
			ProducteurManager producteurBiome) {
		super();
		Nom = nom;
		Horloge = horloge;
		Environnement = environnement;
		ConsommateurBiome = consommateurBiome;
		DecomposeurBiome = decomposeurBiome;
		ProducteurBiome = producteurBiome;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public Temps getHorloge() {
		return Horloge;
	}
	public void setHorloge(Temps horloge) {
		Horloge = horloge;
	}
	public String getEnvironnement() {
		return Environnement;
	}
	public void setEnvironnement(String environnement) {
		Environnement = environnement;
	}
	public void setConsommateurBiome(ConsommateurManager consommateurBiome) {
		ConsommateurBiome = consommateurBiome;
	}
	public DecomposeurManager getDecomposeurBiome() {
		return DecomposeurBiome;
	}
	public void setDecomposeurBiome(DecomposeurManager decomposeurBiome) {
		DecomposeurBiome = decomposeurBiome;
	}
	public ProducteurManager getProducteurBiome() {
		return ProducteurBiome;
	}
	public void setProducteurBiome(ProducteurManager producteurBiome) {
		ProducteurBiome = producteurBiome;
	}
	//public String toString(){
		//return 
	//}
	public static HashMap <String, CompteurB > getRessourceProducteur() {
		return ressourceProducteur;
	}
	public static void setRessourceProducteur(HashMap <String, CompteurB > ressourceProducteur) {
		Biome.ressourceProducteur = ressourceProducteur;
	}
	public static HashMap <String, CompteurB > getRessourceDecompose() {
		return ressourceDecompose;
	}
	public static void setRessourceDecompose(HashMap <String, CompteurB > ressourceDecompose) {
		Biome.ressourceDecompose = ressourceDecompose;
	}



}
