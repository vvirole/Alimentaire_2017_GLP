import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class DecomposeurManageur {
	private static HashMap <String, CompteurB >  HashDecomposeur = new HashMap<String, CompteurB> ( 40 ) ;
	private String NomBiome;
	public DecomposeurManageur(String nomBiome) {
		super();
		NomBiome = nomBiome;
	}
	public void creatHashDecomp() throws IOException{
	BufferedReader fichier = new BufferedReader(new FileReader("ListeDecomposeur"+NomBiome+".txt"));
		while(fichier.readLine()!= null){
			HashDecomposeur.put(fichier.readLine(), new CompteurB(600, 0));
		}
	fichier.close();
	}
}

