public class Biome {
	private String Nom;
	private Temps Horloge;
	private RessourceProd ressourceProducteur;
	private RessourceDecomp ressourceDecompose;
	private String Environnement;
	private CarnivoreP CarnivorePrimaire;
	private CarnivoreS CarnivoreSecondaire;
	private Herbivore Herbi;
	private Decomposeur Degradeur;
	private Producteur Vegetation;
	private Consommateur[] ConsommateurBiome;
	private Decomposeur[] DecomposeurBiome;
	private Producteur[] ProducteurBiome;
	
	
	public Biome(String nom, Temps horloge, RessourceProd ressourceProducteur,
			RessourceDecomp ressourceDecompose, String environnement, CarnivoreP carnivorePrimaire,
			CarnivoreS carnivoreSecondaire, Herbivore herbi, Decomposeur degradeur, Producteur vegetation,
			Consommateur[] consommateurBiome, Decomposeur[] decomposeurBiome, Producteur[] producteurBiome) {
		super();
		Nom = nom;
		Horloge = horloge;
		this.ressourceProducteur = ressourceProducteur;
		this.ressourceDecompose = ressourceDecompose;
		Environnement = environnement;
		CarnivorePrimaire = carnivorePrimaire;
		CarnivoreSecondaire = carnivoreSecondaire;
		Herbi = herbi;
		Degradeur = degradeur;
		Vegetation = vegetation;
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



	public RessourceProd getRessourceProducteur() {
		return ressourceProducteur;
	}



	public void setRessourceProducteur(RessourceProd ressourceProducteur) {
		this.ressourceProducteur = ressourceProducteur;
	}



	public RessourceDecomp getRessourceDecompose() {
		return ressourceDecompose;
	}



	public void setRessourceDecompose(RessourceDecomp ressourceDecompose) {
		this.ressourceDecompose = ressourceDecompose;
	}



	public String getEnvironnement() {
		return Environnement;
	}



	public void setEnvironnement(String environnement) {
		Environnement = environnement;
	}



	public CarnivoreP getCarnivorePrimaire() {
		return CarnivorePrimaire;
	}



	public void setCarnivorePrimaire(CarnivoreP carnivorePrimaire) {
		CarnivorePrimaire = carnivorePrimaire;
	}



	public CarnivoreS getCarnivoreSecondaire() {
		return CarnivoreSecondaire;
	}



	public void setCarnivoreSecondaire(CarnivoreS carnivoreSecondaire) {
		CarnivoreSecondaire = carnivoreSecondaire;
	}



	public Herbivore getHerbi() {
		return Herbi;
	}



	public void setHerbi(Herbivore herbi) {
		Herbi = herbi;
	}



	public Decomposeur getDegradeur() {
		return Degradeur;
	}



	public void setDegradeur(Decomposeur degradeur) {
		Degradeur = degradeur;
	}



	public Producteur getVegetation() {
		return Vegetation;
	}



	public void setVegetation(Producteur vegetation) {
		Vegetation = vegetation;
	}



	public Consommateur[] getConsommateurBiome() {
		return ConsommateurBiome;
	}



	public void setConsommateurBiome(Consommateur[] consommateurBiome) {
		ConsommateurBiome = consommateurBiome;
	}



	public Decomposeur[] getDecomposeurBiome() {
		return DecomposeurBiome;
	}



	public void setDecomposeurBiome(Decomposeur[] decomposeurBiome) {
		DecomposeurBiome = decomposeurBiome;
	}



	public Producteur[] getProducteurBiome() {
		return ProducteurBiome;
	}



	public void setProducteurBiome(Producteur[] producteurBiome) {
		ProducteurBiome = producteurBiome;
	}

}
