package br.com.jhonatanmedeiros.students.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class AppFrame extends JFrame {

    public AppFrame() {
        this.setTitle("Test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(550, 700));
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void createComponents() {
         // Panel
        JPanel panel = new WhitePanel(new MigLayout("filly"));
        
        // Create User Button
        JButton createUserBtn = new JButton("Create User");
        createUserBtn.addActionListener((e) -> {
            // ListFrame listFrame = new ListFrame();
            // LoginFrame.this.dispose();
        });
        panel.add(createUserBtn, "wrap");
        
        
        // List Users Button
        JButton listUsersBtn = new JButton("List Users");
        listUsersBtn.addActionListener((e) -> {
             ListFrame listFrame = new ListFrame();
             this.dispose();
        });
        panel.add(listUsersBtn, "wrap");

        this.add(panel);
    }

}
