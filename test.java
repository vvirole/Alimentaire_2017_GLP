import java.io.IOException;


public class test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ConsommateurTab Catalogue = new ConsommateurTab();
		Catalogue.CreatCatalogue();
		Biome biometest = new Biome("Jungle", new Temps(0) , "Jungle",
			Catalogue.getCarnivorePInfo("Tigre"),Catalogue.getCarnivoreSInfo("Boa"),
			Catalogue.getHerbivoreInfo("Babouin"),new Decomposeur (new Temps(0), false, null),new Producteur (new Temps(0), new Temps(0) , null),
			new ConsommateurManageur("Jungle") ,
			new DecomposeurManageur ("Jungle"),
			new ProducteurManageur ("Jungle"));
		
	}

}
