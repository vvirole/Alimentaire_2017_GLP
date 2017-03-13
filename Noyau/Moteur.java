package Noyau;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Carte.Biome;
import Temps.Temps;
import Vivant.ConsommateurManager;
import Vivant.ConsommateurTab;
import Vivant.DecomposeurManager;
import Vivant.ProducteurManager;


public class Moteur {
	static ConsommateurTab Catalogue;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Catalogue = new ConsommateurTab();
		Catalogue.CreatCatalogue();
		initBiome("Savane");

	}
	public void Incremente(String Nom){
		
		
	}
	
	public void DecrementeCarnivoreS(Biome BiomeDecrement) throws FileNotFoundException{
		BufferedReader Decrementeur = new BufferedReader(new FileReader("ListeConsommateur"+BiomeDecrement.getEnvironnement()+".txt"));
		String recupDecrementer;
		CarnivoreP MangeurdeCarni;
		while((recupDecrementer= Decrementeur.readLine())!=null){;
			if(ConsommateurTab.estCarnivoreP(recupDecrementer,BiomeDecrement.getEnvironnement())==true){
				MangeurdeCarni=ConsommateurTab.getCarnivoreP(recupDecrementeur);
				for(int i=1 ; i<=(MangeurdeCarni.Nourrire)*ConsommateurManager.HashConsommateur.get(MangeurdeCarni.Nom); i++ ){
					if(ConsommateurManager.HashConsommateur.get(MangeurdeCarni.Nom)<ConsommateurManager.HashConsommateur.get(MangeurdeCarni.AlimentP)){
						ConsommateurManager.HashConsommateur.get(MangeurdeCarni.AlimentP).decrement();
					}
					else if(ConsommateurManager.HashConsommateur.get(MangeurdeCarni.Nom)<ConsommateurManager.HashConsommateur.get(MangeurdeCarni.AlimentS)){
						ConsommateurManager.HashConsommateur.get(MangeurdeCarni.AlimentS).decrement();
					}
					else{
						ConsommateurManager.HashConsommateur.get(MangeurdeCarni.Nom).decrement();
						i+=5;
					}
				}
			}
		}
	}
		
	
	public void DecrementeProducteur(Biome BiomeDecrement) throws FileNotFoundException{
		BufferedReader Decrementeur = new BufferedReader(new FileReader("ListeConsommateur"+BiomeDecrement.getEnvironnement()+".txt"));
		String recupDecrementer;
		Herbivore MangeurdeProd;
		while((recupDecrementer= Decrementeur.readLine())!=null){;
			if(ConsommateurTab.estHerbivore(recupDecrementer,BiomeDecrement.getEnvironnement())==true){
				MangeurdeProd=ConsommateurTab.getHerbivore(recupDecrementeur);
				for(int i=1 ; i<=(MangeurdeProd.Nourrire)*ConsommateurManager.HashConsommateur.get(MangeurdeProd.Nom); i++ ){
					if(ConsommateurManager.HashConsommateur.get(MangeurdeProd.Nom)<ProducteurManager.HashProducteur.get(MangeurdeProd.AlimentP)){
						ProducteurManager.HashProducteur.get(MangeurdeProd.AlimentP).decrement();
					}
					else if(ConsommateurManager.HashConsommateur.get(MangeurdeProd.Nom)<ProducteurManager.HashProducteur.get(MangeurdeProd.AlimentS)){
						ProducteurManager.HashProducteur.get(MangeurdeProd.AlimentS).decrement();
					}
					else{
						ConsommateurManager.HashConsommateur.get(MangeurdeProd.Nom).decrement();
						i+=5;
					}
				}
			}
		}
	}
	
	public void DecrementeHerbivore(Biome BiomeDecrement) throws FileNotFoundException{
		BufferedReader Decrementeur = new BufferedReader(new FileReader("ListeConsommateur"+BiomeDecrement.getEnvironnement()+".txt"));
		String recupDecrementer;
		CarnivoreS MangeurdeHerbi;
		while((recupDecrementer= Decrementeur.readLine())!=null){;
			if(ConsommateurTab.estCarnivoreS(recupDecrementer,BiomeDecrement.getEnvironnement())==true){
				MangeurdeHerbi=ConsommateurTab.getCarnivoreS(recupDecrementeur);
				for(int i=1 ; i<=(MangeurdeHerbi.Nourrire)*ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.Nom); i++ ){
					if(ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.Nom)<ProducteurManager.HashConsommateur.get(MangeurdeHerbi.AlimentP)){
						ProducteurManager.HashConsommateur.get(MangeurdeHerbi.AlimentP).decrement();
					}
					else if(ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.Nom)<ProducteurManager.HashConsommateur.get(MangeurdeHerbi.AlimentS)){
						ProducteurManager.HashConsommateur.get(MangeurdeHerbi.AlimentS).decrement();
					}
					else{
						ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.Nom).decrement();
						i+=5;
					}
				}
			}
		}
	}
		
	
	public static Carte.Biome initBiome (String NomEnvir) throws IOException{
		Carte.Biome Biomeinit = new Carte.Biome (NomEnvir, new Temps(0), NomEnvir, new ConsommateurManager (NomEnvir), new DecomposeurManager(NomEnvir), new ProducteurManager(NomEnvir));
		Biomeinit.ConsommateurBiome.creatHashConso();
		Biomeinit.ProducteurBiome.creatHashProd();
		return Biomeinit;
	}
	}
