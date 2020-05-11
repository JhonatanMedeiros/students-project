package br.com.jhonatanmedeiros.students.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public final class LoginFrame extends JFrame {

    public LoginFrame() {
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(400, 220));
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public void createComponents()  {
        
        // Credentials Panel
        JPanel credentialsPanel = new WhitePanel(new MigLayout("filly"));
        
        // Input Username
        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameField = new JTextField(15);
        credentialsPanel.add(usernameLabel, "wrap");
        credentialsPanel.add(usernameField, "wrap");

        // Input Password
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(15);
        credentialsPanel.add(passwordLabel, "wrap");
        credentialsPanel.add(passwordField, "wrap");

        // Button Submit
        JButton loginButton = new JButton("Submit");
        loginButton.addActionListener((e) -> {
            AppFrame appFrame = new AppFrame();
            this.dispose();
        });
        credentialsPanel.add(loginButton, "wrap");

        this.add(credentialsPanel);
    }

}
