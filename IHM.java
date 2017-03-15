package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import Vivant.ConsommateurTab;

class IHM extends JFrame implements ActionListener{

//Declaration :
	JFrame fenetre = new JFrame();
	Map map = new Map();
	JPanel carte = new JPanel();
	JPanel fond = new JPanel();
	JLabel infoNom4 = new JLabel("Recherche Consommateur : ");
	JLabel infoNom5 = new JLabel("Recherche Producteur : ");
	JLabel infoNom6 = new JLabel("Recherche Degradeur : ");
	JTextField nom4 = new JTextField();
	JTextField nom5 = new JTextField();
	JTextField nom6 = new JTextField();
	JButton rechNom4 = new JButton("Recherche");
	JButton rechNom5 = new JButton("Recherche");
	JButton rechNom6 = new JButton("Recherche");
	JLabel resultNom4 = new JLabel("lion");
	JLabel resultNom5 = new JLabel();
	JLabel resultNom6 = new JLabel();
	JPanel jPanel4 = new JPanel();
	JPanel jPanel5 = new JPanel();
	JPanel jPanel6 = new JPanel();
	JTabbedPane parameters = new JTabbedPane();
	JTabbedPane numbers = new JTabbedPane();
	
	private static final long serialVersionUID = 1L;

	public IHM() throws Exception{
// parametre text :
		nom4.setColumns(10);
		nom5.setColumns(10);
		nom6.setColumns(10);
		
		
		
//fenetre principale :
		
		fenetre.setTitle("ALIMENTAIRE" );
		fenetre.setExtendedState(Frame.MAXIMIZED_BOTH);
		setUndecorated(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setContentPane(fond);
		fond.setBackground(Color.WHITE);
		
// les menus :
	   
		MenuBar menubar = new MenuBar( );
	    Menu fichier = new Menu("Fichier");
	    Menu edition = new Menu("Edition");
	    MenuItem nouveau = new MenuItem("Nouveau");
	    MenuItem sauvegarder = new MenuItem("Sauvegarder");
	    fenetre.setMenuBar(menubar);
	    fichier.add(nouveau);
	    fichier.add(sauvegarder);
	    menubar.add(fichier);
	    menubar.add(edition);

//fenetre map :
	    
	    fenetre.setLayout(null);
	    carte.add(map);
        fenetre.add(carte);
        
//Panel de legendes :
      
       
        
//onglet parametre :      
       //tabbedPane.addTab("Tab 1", icon, panel1,
    //"Does nothing");
        parameters.addTab("Paramètre Consommateur", null);
        parameters.addTab("Paramètre Producteur", null);
        parameters.addTab("Paramètre Degradeur", null);
        
        numbers.addTab("Information Consommateur", null, jPanel4);
        numbers.addTab("Information Producteur", null, jPanel5);
        numbers.addTab("Information Degradeur", null, jPanel6);
        
        fenetre.add(numbers);
        fenetre.add(parameters);
        
        jPanel4.add(infoNom4);
        jPanel5.add(infoNom5);
        jPanel6.add(infoNom6);
        jPanel4.add(nom4);
        jPanel5.add(nom5);
        jPanel6.add(nom6);
        jPanel4.add(rechNom4);
        jPanel5.add(rechNom5);
        jPanel6.add(rechNom6);
        jPanel4.add(resultNom4);
        
//parametre taille/position fenetre :
        
       carte.setBounds(45, 10, 650, 650);
       parameters.setBounds(750, 10, 580, 340);
       numbers.setBounds(750,360, 580, 340);
        
   
        fenetre.setVisible(true);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(ConsommateurTab.estCarnivoreP(nom4.getText(), null)==true){
			
		//	ConsommateurTab.getCarnivorePInfo(nom4.getText());
			//jPanel4.system.out.println("lion");
		}
		else if(ConsommateurTab.estCarnivoreS(nom4.getText(), null)==true){
			
			ConsommateurTab.getCarnivoreSInfo(nom4.getText());
		}
		else if(ConsommateurTab.estHerbivore(nom4.getText(), null)==true){
			
			ConsommateurTab.getHerbivoreInfo(nom4.getText());
		}
		else{
			System.out.println("error !");
		}
		
	}
	
}
	
	/*private void jbInit() throws Exception {
    	this.setSize(new Dimension(405, 202));
    	JPanel jPanel1 = new JPanel();
    	jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
    	  JPanel jPanel2 = new JPanel();
    	jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));
    	jPanel1.add(jPanel2);
    	//les 3 pannels de gauche
    	JPanel jPanel3 = new JPanel();
    	JPanel jPanel4 = new JPanel();
    	JPanel jPanel5 = new JPanel();
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
    	JTabbedPane tabbedPane = new JTabbedPane();
    	Component jPanelA = null;
		tabbedPane.addTab( "Page 1", jPanelA );
    	Component jPanelB = null;
		tabbedPane.addTab( "Page 2", jPanelB );
    	Component jPanelC = null;
		tabbedPane.addTab( "Page 3", jPanelC );
    	jPanel1.add(tabbedPane); 
    	this.setVisible(true);

    
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
/*Button entree = new Button("Entrez");
Checkbox bout1 = new Checkbox("Marié");
Checkbox bout2 = new Checkbox("Célibataire");
fenetre.add(entree);
fenetre.add(bout1);
fenetre.add(bout2);*/
