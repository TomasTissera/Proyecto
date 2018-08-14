/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ubuntu
 */
public class Loginp {

    JLabel mal = new JLabel("");
    JPasswordField password = new JPasswordField("Password");
    JTextField user = new JTextField("User");
    boolean primero = true;
    boolean primero2 = true;

    public Loginp() {

        JFrame lgn = new JFrame("Ingresa tu usuario y contraseña");
        JButton btentrar = new JButton("Entrar");
        lgn.setLayout(null);
        lgn.setSize(400, 150);
        lgn.setResizable(false);
        lgn.setVisible(true);
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

        lgn.add(jpassword);
        lgn.setSize(500, 200);
        lgn.setVisible(true);

        jpassword.setEchoChar('#');
        System.out.println(jpassword.getEchoChar());

        mal.setBounds(10, 10, 300, 30);
        user.setBounds(50, 30, 300, 30);
        password.setBounds(50, 70, 300, 30);
        btentrar.setBounds(250, 110, 100, 30);
        btentrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if ((user.getText().equals("trabajador")) && (password.getText().equals("hotel"))) {
                    ventanaDeCarga ventanaDeCarga = new ventanaDeCarga();
                    lgn.dispose();

                } else {
                    mal.setText("MAL");
                }
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
        user.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (primero2) {
                    user.setText("");
                    primero2 = false;
                }

            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (user.getText().equals("")) {
                    primero2 = true;
                    user.setText("User");
                }
            }
        });
        lgn.add(ver);
        lgn.add(mal);
        lgn.add(user);
        lgn.add(password);
        lgn.add(btentrar);
        lgn.setDefaultCloseOperation(3);
        lgn.setVisible(true);

    }

}
