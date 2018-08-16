/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author ubuntu
 */
public class Loginp {

    JLabel mal = new JLabel("Ingrese La Contraseña");
    JPasswordField password = new JPasswordField("Password");
    
    boolean primero = true;
    boolean primero2 = true;

    public Loginp() {

        JFrame lgn = new JFrame("Ingresa la contraseña");
        JButton btentrar = new JButton("Entrar");
        lgn.setLayout(null);
        
        lgn.setResizable(false);
        
        JCheckBox ver = new JCheckBox("Mostrar contraseña");
        ver.setBounds(50, 110, 150, 30);
        ver.setMnemonic('M');
        ver.addActionListener((e) -> {
            if (ver.isSelected()) {
                password.setEchoChar((char) 0);
            } else {
                password.setEchoChar('*');
            }
            password.requestFocus();
        });
        password.setEchoChar('*');

        lgn.add(new JLabel("Password"));
        JPasswordField jpassword = new JPasswordField();

        
        

        jpassword.setEchoChar('#');
        System.out.println(jpassword.getEchoChar());

        
        mal.setBounds(50, 30, 300, 30);
        password.setBounds(50, 70, 300, 30);
        btentrar.setBounds(250, 110, 100, 30);
        btentrar.addActionListener((ActionEvent ae) -> {
            if ((password.getText().equals("a"))) {
                ventanaDeCarga ventanaDeCarga = new ventanaDeCarga();
                lgn.dispose();
                
            } else {
                mal.setText("MAL, vuelva a intentarlo");
                password.setText("");
            }
        });
        password.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent fe) {
                if (primero) {
                    password.setText("");
                    primero = false;
                }
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (password.getText().equals("")) {
                    primero = true;
                    password.setText("Password");
                }
            }

        });
        

        lgn.add(ver);
        lgn.add(mal);
        ;
        lgn.add(password);
        lgn.add(btentrar);
        lgn.setDefaultCloseOperation(3);
        lgn.setVisible(true);
        lgn.add(jpassword);
        lgn.setSize(500, 200);

    }

}
