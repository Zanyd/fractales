/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal3;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author halo_
 */
public class Panel extends JPanel{

    public Panel() {
    }
     public void paint(Graphics g) {
               Julia j = new Julia();
                j.dibujar(g, this.getWidth(), this.getHeight());
     
     }
    
}
