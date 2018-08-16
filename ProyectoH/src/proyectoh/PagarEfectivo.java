/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tomastissera
 */
public class PagarEfectivo {
JLabel montoapagarl = new JLabel("El monto a pagar es :");

    public PagarEfectivo() {
        JFrame jfPagar = new JFrame("");
        jfPagar.setDefaultCloseOperation(3);
        jfPagar.setLayout(null);
        jfPagar.setSize(500, 411);
        jfPagar.setResizable(false);
        jfPagar.setVisible(true);
        
        
        montoapagarl.setBounds(100, 30, 150, 30);
        jfPagar.add(montoapagarl);

    }
}
