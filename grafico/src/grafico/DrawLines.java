/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class DrawLines extends JPanel{
    
    
    @Override
    public void paintComponent( Graphics g ){
     int x1 = Integer.parseInt(JOptionPane.showInputDialog("X1 lixo?"));
     int y1 = Integer.parseInt(JOptionPane.showInputDialog("y1 lixo?"));
     int x2 = Integer.parseInt(JOptionPane.showInputDialog("X2 lixo?"));
     int y2 = Integer.parseInt(JOptionPane.showInputDialog("Y2 lixo?"));
        super.paintComponent( g );
        
    g.drawLine( 10, 10, 10, 200 );
    g.drawLine(10,200,200,200);
    g.drawLine(x1 + 10,200 - y1,x2 + 10,200 - y2);
    
    }
}
 
