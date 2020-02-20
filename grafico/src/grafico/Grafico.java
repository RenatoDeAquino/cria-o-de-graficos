
package grafico;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Grafico {

    public static void main(String[] args) {
       DrawLines panel = new DrawLines();

       JFrame frame= new JFrame("Casseb");

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize( 400, 400 );
        frame.setVisible( true );
        frame.setLocation( 400 / 2, 400 / 2 );
        frame.add( panel );
        
        
    }

}
