package GUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Carte.Grille;

class IHM extends JFrame{

	JFrame fenetre = new JFrame();
	JPanel fond = new JPanel(new BorderLayout());
	JTabbedPane tabPane = new JTabbedPane();
	JLabel map = new JLabel();
	Grille grille = new Grille(null);
	 
	private static final long serialVersionUID = 1L;

	public IHM(){

//fenetre principale :
		
		fenetre.setTitle("ALIMENTAIRE" );
		fenetre.setSize(1000, 800);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		/*Button entree = new Button("Entrez");
	    Checkbox bout1 = new Checkbox("Marié");
	    Checkbox bout2 = new Checkbox("Célibataire");
	    fenetre.add(entree);
	    fenetre.add(bout1);
	    fenetre.add(bout2);*/
// les menus :
	    MenuBar mbar = new MenuBar( );
	    Menu meprinc1 = new Menu("Fichier");
	    Menu meprinc2 = new Menu("Edition");
	    MenuItem item1 = new MenuItem("Nouveau");
	    MenuItem item2 = new MenuItem("Sauvegarder");
	    fenetre.setMenuBar(mbar);
	    meprinc1.add(item1);
	    meprinc1.add(item2);
	    mbar.add(meprinc1);
	    mbar.add(meprinc2);
		    
//fenetre map :
		fond.setBackground(Color.WHITE);
        fenetre.setContentPane(fond);
        fenetre.setVisible(true);
	}
}

/*
 * private void jbInit() throws Exception {
this.setSize(new Dimension(405, 202));
jPanel1 = new JPanel();
jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
  jPanel2= new JPanel();
jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
jPanel1.add(jPanel2);
//les 3 pannels de gauche
jPanel3= new JPanel();
jPanel4= new JPanel();
jPanel5= new JPanel();
jPanel2.add(jPanel3);   
jPanel2.add(jPanel4);
jPanel2.add(jPanel5);
this.getContentPane().add(jPanel1, BorderLayout.CENTER);

setTitle( "Tabbed Pane Application" );
setSize( 300, 200 );
setBackground(Color.gray);

// Create the tab pages
createPage1();
createPage2();
createPage3();

// Create a tabbed pane
tabbedPane = new JTabbedPane();
tabbedPane.addTab( "Page 1", jPanelA );
tabbedPane.addTab( "Page 2", jPanelB );
tabbedPane.addTab( "Page 3", jPanelC );
jPanel1.add(tabbedPane); 
this.setVisible(true);


 */

