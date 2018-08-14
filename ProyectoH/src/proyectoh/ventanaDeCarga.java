/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    JTextArea nombret = new JTextArea("");
    JTextArea apellidot = new JTextArea("");
    JTextArea nacionalidadt = new JTextArea("");
    JTextArea dnit = new JTextArea("");
    JTextArea diadeIngresot = new JTextArea("");
    JLabel nombrel = new JLabel("Nombre: ");
    JLabel apellidol = new JLabel("Apellido: ");
    JLabel nacionalidadl = new JLabel("Nacionalidad :");
    JLabel dnil = new JLabel("DNI :");
    JLabel diadeIngresol = new JLabel("Dia De Ingreso :");
    JButton btGuardar = new JButton("Guardar");
    final JFileChooser fc = new JFileChooser();
    final JFileChooser SaveAs = new JFileChooser();

    public ventanaDeCarga() {
        JFrame CargaDeDatos = new JFrame("Ingresa los Datos ");
        CargaDeDatos.setDefaultCloseOperation(3);
        CargaDeDatos.setLayout(null);
        CargaDeDatos.setSize(500, 411);
        CargaDeDatos.setResizable(false);
        CargaDeDatos.setVisible(true);

        CargaDeDatos.add(btGuardar);
        btGuardar.setBounds(100, 250, 325, 30);
        btGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                saveWin();
                nombret.getText();

            }

        });
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
        CargaDeDatos.add(diadeIngresot);
        diadeIngresot.setBounds(100, 200, 325, 30);
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
            outFile.write("Nombre : " + nombret.getText());
            outFile.write(" Apellido : " + apellidot.getText());
            outFile.write(" Nacionalidad : " + nacionalidadt.getText());
            outFile.write(" DNI : " + dnit.getText());
            outFile.write(" Dia de Ingreso :" + diadeIngresot.getText());
        } catch (IOException ex) {
            ex.printStackTrace();
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
