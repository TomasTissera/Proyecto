/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tomastissera
 */
public class ventanaDeCarga extends JFrame {
    JTextField dias = new JTextField("Ingrese los dias q se opedara ");
    JLabel diasl = new JLabel("Dias q se ospedara");
    JTextArea nombret = new JTextArea("");
    JTextArea apellidot = new JTextArea("");
    JTextArea nacionalidadt = new JTextArea("");
    JTextArea dnit = new JTextArea("");
    JDateChooser CalendarioIngreso = new JDateChooser();
    JDateChooser CalendarioSalida = new JDateChooser();
    JLabel nombrel = new JLabel("Nombre: ");
    JLabel apellidol = new JLabel("Apellido: ");
    JLabel nacionalidadl = new JLabel("Nacionalidad :");
    JLabel dnil = new JLabel("DNI :");
    JLabel diadeIngresol = new JLabel("Dia De Ingreso :");
    JLabel diadeSalidal = new JLabel("Dia de Salida");
    JButton btGuardar = new JButton("Guardar");
    JButton btPagar = new JButton("Pagar");
    final JFileChooser fc = new JFileChooser();
    final JFileChooser SaveAs = new JFileChooser();
    boolean primero = true;
   
    public ventanaDeCarga() {
        
        JFrame CargaDeDatos = new JFrame("Ingresa los Datos ");
        CargaDeDatos.setDefaultCloseOperation(3);
        CargaDeDatos.setLayout(null);
        CargaDeDatos.setSize(500, 411);
        CargaDeDatos.setResizable(false);
        CargaDeDatos.setVisible(true);
        CargaDeDatos.add(dias);
        dias.setBounds(100, 270, 325, 30);
        dias.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (primero) {
                    dias.setText("");
                    primero = false;
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

           
            
        });
        CargaDeDatos.add(btPagar);
        btPagar.setBounds(100,300, 325, 30);
        btPagar.addActionListener((ActionEvent e) -> {
            VentanaPagar VentanaPagar = new VentanaPagar();
            CargaDeDatos.dispose();
        });
        CargaDeDatos.add(btGuardar);
        btGuardar.setBounds(100, 350, 325, 30);
        btGuardar.addActionListener((ActionEvent ae) -> {
            saveWin();
            CargaDeDatos.dispose();
            
            nombret.getText();
        });
        CargaDeDatos.add(CalendarioSalida);
        CalendarioSalida.setBounds(100, 240,325, 30);
        CargaDeDatos.add(diadeSalidal);
        diadeSalidal.setBounds(10, 240, 100, 30);
        CargaDeDatos.add(nombret);
        nombret.setBounds(100, 30, 325, 30);
        CargaDeDatos.add(nombrel);
        nombrel.setBounds(10, 30, 100, 30);
        CargaDeDatos.add(apellidot);
        apellidot.setBounds(100, 70, 325, 30);
        CargaDeDatos.add(apellidol);
        apellidol.setBounds(10, 70, 100, 30);
        CargaDeDatos.add(nacionalidadt);
        nacionalidadt.setBounds(100, 120, 325, 30);
        CargaDeDatos.add(nacionalidadl);
        nacionalidadl.setBounds(10, 120, 100, 30);
        CargaDeDatos.add(dnit);
        dnit.setBounds(100, 160, 325, 30);
        CargaDeDatos.add(dnil);
        dnil.setBounds(10, 160, 100, 30);
        CargaDeDatos.add(CalendarioIngreso);
        CalendarioIngreso.setBounds(100, 200, 325, 30);
        CargaDeDatos.add(diadeIngresol);
        diadeIngresol.setBounds(10, 200, 100, 30);

    }
    
        
    
    public void saveWin() {
        SaveAs.setApproveButtonText("Save");
        int actionDialog = SaveAs.showOpenDialog(this);
        File fileName = new File(SaveAs.getSelectedFile() + "");
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter(fileName));
            Persona p = new Persona(
                    nombret.getText(), 
                    apellidot.getText(),
                    dnit.getText(),
                    nacionalidadt.getText(),
                    CalendarioIngreso.getDate().toString(),
                    CalendarioSalida.getDate().toString(),
                    dias.getText()            );

           
            
            outFile.write(p.toString());
        } catch (IOException ex) {
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException e) {
                }
            }
        }
    }
}

