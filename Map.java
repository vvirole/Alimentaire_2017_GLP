package GUI;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Map extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public static final Color SAVANE = new Color(255,200,80);
	public static final Color MOUNTAINS = new Color(128,128,128);
	public static final Color JUNGLE = new Color(0,180,0);
	public static final Color AQUATIC = new Color(0,50,255);
	public static final Color COLD = new Color(200,255,255);

    public static final Color[] TERRAIN = {
        
    	SAVANE,
        MOUNTAINS,
        JUNGLE,
        AQUATIC,
        COLD
    };

    public static final int nbLig = 8;
    public static final int nbCol = 8;
    int maxOccTERRAIN=0;
    int randomTerrainIndex;
    Color randomColor ;
    int useTERRAIN = 0;
    public static final int preferedSizePixelMap = 80;

    // In reality you will probably want a class here to represent a map tile,
    // which will include things like dimensions, color, properties in the
    // game world.  Keeping simple just to illustrate.
    private final Color[][] terrainGrid;

    public Map(){
    	// Double type Terrain
        this.terrainGrid = new Color[nbLig][nbCol];
        Random r = new Random();
        randomTerrainIndex = r.nextInt(TERRAIN.length);
        for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
            	if(maxOccTERRAIN < 34){
		                
		                useTERRAIN = randomTerrainIndex;
		                randomColor = TERRAIN[useTERRAIN];
		              
	                	maxOccTERRAIN = maxOccTERRAIN + 1;
	                	this.terrainGrid[i][j] = randomColor;
                	}
                	else{
                		maxOccTERRAIN = 0;
                		randomTerrainIndex = r.nextInt(TERRAIN.length);
                		if(maxOccTERRAIN < 34){
	                		
                			useTERRAIN = randomTerrainIndex;
    		                randomColor = TERRAIN[useTERRAIN];
    		              
    	                	maxOccTERRAIN = maxOccTERRAIN + 1;
    	                	this.terrainGrid[i][j] = randomColor;
                		}
                	}
                
              
            }
        }
        
        // Random terrain
        
        /*for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
            	
                int randomTerrainIndex = r.nextInt(TERRAIN.length);
                Color randomColor = TERRAIN[randomTerrainIndex];
                this.terrainGrid[i][j] = randomColor;
            }
        }*/
        
        int preferredWidth = nbCol * preferedSizePixelMap;
        int preferredHeight = nbLig * preferedSizePixelMap;
        setPreferredSize(new Dimension(preferredWidth, preferredHeight));
    }

    public void paintComponent(Graphics g) {
        // Important to call super class method
        super.paintComponent(g);
        // Clear the board
        g.clearRect(0, 0, getWidth(), getHeight());
        // Draw the grid
        int rectWidth = getWidth() / nbCol;
        int rectHeight = getHeight() / nbLig;
        
        for (int i = 0; i < nbLig; i++) {
            for (int j = 0; j < nbCol; j++) {
                // Upper left corner of this terrain rect
                int x = i * rectWidth;
                int y = j * rectHeight;
                Color terrainColor = terrainGrid[i][j];
               
                this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                g.setColor(terrainColor);
                g.fillRect(x, y, rectWidth, rectHeight);
                
            }
        }
    }
    

}



/*package GUI;

import java.awt.Component;
import java.awt.Graphics;

public class  ImagePanel {
	
	//Attributs :
	private int nbLig = 10;
	private int nbCol = 10;
	private char [][] grille;
	
	public  ImagePanel(){
		 
			
		grille = new char[nbLig][nbCol];
		
		for(int i=0; i<nbLig; i++){
			for(int j=0; j<nbCol; j++){
				
				grille [i][j] = '0';
			}
		}
	}
	
	public void paint(Graphics graphics){
		
		
	}
}*/