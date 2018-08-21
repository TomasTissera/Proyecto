/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tomastissera
 */
public class VentanaPagar extends Persona   {
    JLabel menj = new JLabel("Si vuelve atras se borrara la informacion ingresada");
    JButton btok = new JButton("OK");
    JLabel lbpagar = new JLabel("Con que desea pagar ?");
    JButton btefectivo = new JButton("Efectivo");
    JButton bttarjeta = new JButton("Tarjeta");
    JButton btatras = new JButton("<--Atras");
    JFrame CargaDeDatos = new JFrame("");
    
    /**public void dias()throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 
		int dias=(int) ((CalendarioIngreso.getDate().toString()-CalendarioSalida.getDate().toString())/86400000);
	}
**/
    
   
    public VentanaPagar() {
        
        JLabel diasl = new JLabel("Usted paso "+ dias + " en el hotel ");
        

        CargaDeDatos.setDefaultCloseOperation(3);
        CargaDeDatos.setLayout(null);
        CargaDeDatos.setSize(500, 411);
        CargaDeDatos.setResizable(false);
        CargaDeDatos.setVisible(true);
        
        CargaDeDatos.add(diasl);
        diasl.setBounds(150, 40, 200, 30);
        CargaDeDatos.add(lbpagar);
        lbpagar.setBounds(150, 30, 325, 30);
        CargaDeDatos.add(bttarjeta);
        bttarjeta.setBounds(100, 300, 325, 100);
        
        CargaDeDatos.add(btefectivo);
        btefectivo.setBounds(100, 150, 325, 100);
        btefectivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PagarEfectivo pf = new PagarEfectivo();
            }

        });
        bttarjeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PagarTarjeta pt = new PagarTarjeta();

            }

        });
        CargaDeDatos.add(btatras);
        btatras.setBounds(10, 300, 100, 30);
        btatras.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                MensajeAtras();
            }
        });
    }
    public void MensajeAtras(){
        JFrame MensajeAtras = new JFrame("¡Atencion!");
       // MensajeAtras.setDefaultCloseOperation(3);
        MensajeAtras.setLayout(null);
        MensajeAtras.setSize(460, 160);
        MensajeAtras.setResizable(false);
        MensajeAtras.setVisible(true);
        MensajeAtras.add(menj);
        menj.setBounds(50,60,350, 10);
        MensajeAtras.add(btok);
        btok.setBounds(180, 80, 90, 40);
        btok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaDeCarga vc = new ventanaDeCarga();
                MensajeAtras.dispose();
                CargaDeDatos.dispose();
            }
        });
    }
}
