/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author halo_
 */
public class Fractal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // FractalDeComplejo fractal = new Julia(); //modelo;
                      
                JFrame ventana = new JFrame();//vista
                ventana.setVisible(true);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setSize(800, 600);
                ventana.setLocation(100, 100);
                ventana.setLayout(new BorderLayout());
                Panel p=new Panel();
                ventana.getContentPane().add(p,BorderLayout.CENTER);
              
                
               
    }
    
}
