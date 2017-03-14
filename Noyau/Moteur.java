package Noyau;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Carte.Biome;
import Temps.Temps;
import Vivant.CarnivoreP;
import Vivant.CarnivoreS;
import Vivant.ConsommateurManager;
import Vivant.ConsommateurTab;
import Vivant.DecomposeurManager;
import Vivant.Herbivore;
import Vivant.ProducteurManager;


public class Moteur {
	static ConsommateurTab Catalogue;
	public static void main(String[] args) throws NumberFormatException, IOException {
		Catalogue = new ConsommateurTab();
		Catalogue.CreatCatalogue();
		initBiome("Savane");

	}
	public void Incremente(Biome BiomeIncremente){		
	}
	
	public void Decremente(Biome BiomeDecrement) throws IOException{
		DecrementeCarnivoreS(BiomeDecrement);
		DecrementeProducteur(BiomeDecrement);
		DecrementeHerbivore(BiomeDecrement);
		
	}
	
	public void DecrementeCarnivoreS(Biome BiomeDecrement) throws IOException{
		BufferedReader Decrementeur = new BufferedReader(new FileReader("ListeConsommateur"+BiomeDecrement.getEnvironnement()+".txt"));
		String recupDecrementer;
		CarnivoreP MangeurdeCarni;
		while((recupDecrementer= Decrementeur.readLine())!=null){;
			if(ConsommateurTab.estCarnivoreP(recupDecrementer,BiomeDecrement.getEnvironnement())==true){
				MangeurdeCarni=ConsommateurTab.getCarnivorePInfo(recupDecrementer);
				for(int i=1 ; i<=(MangeurdeCarni.getNourrire())*(ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getNom()).getValeur()); i+=5 ){
					if(ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getNom()).getValeur()*2<ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getAlimentP()).getValeur()){
						ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getAlimentP()).decrement();
					}
					else if(ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getNom()).getValeur()*2<ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getAlimentS()).getValeur()){
						ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getAlimentS()).decrement();
					}
					else{
						ConsommateurManager.HashConsommateur.get(MangeurdeCarni.getNom()).decrement();
						i+=5;
					}
				}
			}
		}
		Decrementeur.close();
	}
		
	
	public void DecrementeProducteur(Biome BiomeDecrement) throws IOException{
		BufferedReader Decrementeur = new BufferedReader(new FileReader("ListeConsommateur"+BiomeDecrement.getEnvironnement()+".txt"));
		String recupDecrementer;
		Herbivore MangeurdeProd;
		while((recupDecrementer= Decrementeur.readLine())!=null){;
			if(ConsommateurTab.estHerbivore(recupDecrementer,BiomeDecrement.getEnvironnement())==true){
				MangeurdeProd=ConsommateurTab.getHerbivoreInfo(recupDecrementer);
				for(int i=1 ; i<=(MangeurdeProd.getNourrire())*ConsommateurManager.HashConsommateur.get(MangeurdeProd.getNom()).getValeur(); i++ ){
					if(ConsommateurManager.HashConsommateur.get(MangeurdeProd.getNom()).getValeur()<ProducteurManager.HashProducteur.get(MangeurdeProd.getAlimentP()).getValeur()){
						ProducteurManager.HashProducteur.get(MangeurdeProd.getAlimentP()).decrement();
					}
					else if(ConsommateurManager.HashConsommateur.get(MangeurdeProd.getNom()).getValeur()<ProducteurManager.HashProducteur.get(MangeurdeProd.getAlimentS()).getValeur()){
						ProducteurManager.HashProducteur.get(MangeurdeProd.getAlimentS()).decrement();
					}
					else{
						ConsommateurManager.HashConsommateur.get(MangeurdeProd.getNom()).decrement();
						i+=5;
					}
				}
			}
		}
		Decrementeur.close();
	}
	
	public void DecrementeHerbivore(Biome BiomeDecrement) throws IOException{
		BufferedReader Decrementeur = new BufferedReader(new FileReader("ListeConsommateur"+BiomeDecrement.getEnvironnement()+".txt"));
		String recupDecrementer;
		CarnivoreS MangeurdeHerbi;
		while((recupDecrementer= Decrementeur.readLine())!=null){;
			if(ConsommateurTab.estCarnivoreS(recupDecrementer,BiomeDecrement.getEnvironnement())==true){
				MangeurdeHerbi=ConsommateurTab.getCarnivoreSInfo(recupDecrementer);
				for(int i=1 ; i<=(MangeurdeHerbi.getNourrire())*ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.getNom()).getValeur(); i++ ){
					if(ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.getNom()).getValeur()<ProducteurManager.HashProducteur.get(MangeurdeHerbi.getAlimentP()).getValeur()){
						ProducteurManager.HashProducteur.get(MangeurdeHerbi.getAlimentP()).decrement();
					}
					else if(ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.getNom()).getValeur()<ProducteurManager.HashProducteur.get(MangeurdeHerbi.getAlimentS()).getValeur()){
						ProducteurManager.HashProducteur.get(MangeurdeHerbi.getAlimentS()).decrement();
					}
					else{
						ConsommateurManager.HashConsommateur.get(MangeurdeHerbi.getNom()).decrement();
						i+=5;
					}
				}
			}
		}
		Decrementeur.close();
	}
		
	
	public static Carte.Biome initBiome (String NomEnvir) throws IOException{
		Carte.Biome Biomeinit = new Carte.Biome (NomEnvir, new Temps(0), NomEnvir, new ConsommateurManager (NomEnvir), new DecomposeurManager(NomEnvir), new ProducteurManager(NomEnvir));
		Biomeinit.ConsommateurBiome.creatHashConso();
		Biomeinit.ProducteurBiome.creatHashProd();
		return Biomeinit;
	}
	}
