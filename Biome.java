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
	private ConsommateurManageur ConsommateurBiome;
	private DecomposeurManageur DecomposeurBiome;
	private ProducteurManageur ProducteurBiome;
	public Biome(String nom, Temps horloge, RessourceProd ressourceProducteur,
			RessourceDecomp ressourceDecompose, String environnement,
			CarnivoreP carnivorePrimaire, CarnivoreS carnivoreSecondaire,
			Herbivore herbi, Decomposeur degradeur, Producteur vegetation,
			ConsommateurManageur consommateurBiome,
			DecomposeurManageur decomposeurBiome,
			ProducteurManageur producteurBiome) {
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
	public ConsommateurManageur getConsommateurBiome() {
		return ConsommateurBiome;
	}
	public void setConsommateurBiome(ConsommateurManageur consommateurBiome) {
		ConsommateurBiome = consommateurBiome;
	}
	public DecomposeurManageur getDecomposeurBiome() {
		return DecomposeurBiome;
	}
	public void setDecomposeurBiome(DecomposeurManageur decomposeurBiome) {
		DecomposeurBiome = decomposeurBiome;
	}
	public ProducteurManageur getProducteurBiome() {
		return ProducteurBiome;
	}
	public void setProducteurBiome(ProducteurManageur producteurBiome) {
		ProducteurBiome = producteurBiome;
	}
	
	
	

}
