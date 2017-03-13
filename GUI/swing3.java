package GUI;
import javax.swing.*;
import java.awt.event.*;

public class swing3 extends JFrame {

  public swing3() {

     super("titre de l'application");

      WindowListener l = new WindowAdapter() {
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      };

      addWindowListener(l);

      ImageIcon img = new ImageIcon("tips.gif");
      JButton bouton = new JButton("Mon bouton",img);

      JPanel panneau = new JPanel();
      panneau.add(bouton);
      setContentPane(panneau);
      setSize(200,100);
      setVisible(true);
   }

  public static void main(String [] args){
      JFrame frame = new swing3();
  }
}


/*package GUI;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class MyPanel extends JPanel {
   
	private static final long serialVersionUID = 1L;
	JButton button = new JButton("Button");
    JTabbedPane tabPane = new JTabbedPane();

    public MyPanel(){
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        tabPane.add("Panel 1", panel1);
        tabPane.add("Panel 2", panel2);
        tabPane.setBorder(new EmptyBorder(10, 10, 10, 10));

        setLayout(new BorderLayout());
        add(tabPane, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new MyPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationByPlatform(true);
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }
}
*/