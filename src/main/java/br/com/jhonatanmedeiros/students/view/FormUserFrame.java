package br.com.jhonatanmedeiros.students.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class FormUserFrame extends JFrame {

    public FormUserFrame() {
        this.setTitle("Criar Usuário");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 500));
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void createComponents() {

        // Form Panel
        JPanel formPanel = new WhitePanel();
        formPanel.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder()));
        GridLayout gridLayout = new GridLayout(0,2);
        gridLayout.setHgap(50);
        gridLayout.setVgap(50);
        formPanel.setLayout(gridLayout);
        
       
        GridBagLayout panelGridBagLayout = new GridBagLayout();
        panelGridBagLayout.columnWidths = new int[]{86, 86, 0};
        panelGridBagLayout.rowHeights = new int[]{20, 20, 20, 20, 20, 0};
        panelGridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        panelGridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0,
            Double.MIN_VALUE};
        

        // Form Left
        JPanel formLeftPanel = new WhitePanel();
        formLeftPanel.setLayout(panelGridBagLayout);
        addLabelAndTextField("Matricula:", 0, formLeftPanel);
        addLabelAndTextField("Aluno:", 1, formLeftPanel);
        addLabelAndTextField("Data de Nascimento:", 2, formLeftPanel);
        addLabelAndTextField("RG:", 3, formLeftPanel);
        addLabelAndTextField("CPF:", 4, formLeftPanel);
        
        
        // Form Right
        JPanel formRightPanel = new WhitePanel();
        formRightPanel.setLayout(panelGridBagLayout);
        addLabelAndTextField("Curso:", 0, formRightPanel);
        addLabelAndTextField("Data da Matricula:", 1, formRightPanel);
        addLabelAndTextField("Data de Validade:", 2, formRightPanel);
        
        
        formPanel.add(formLeftPanel);
        formPanel.add(formRightPanel);
        

        this.add(formPanel);

    }

    private void addLabelAndTextField(String labelText, int yPos,
            Container containingPanel) {

        JLabel label = new JLabel(labelText);
        GridBagConstraints gridBagConstraintForLabel = new GridBagConstraints();
        gridBagConstraintForLabel.fill = GridBagConstraints.BOTH;
        gridBagConstraintForLabel.insets = new Insets(0, 0, 5, 5);
        gridBagConstraintForLabel.gridx = 0;
        gridBagConstraintForLabel.gridy = yPos;
        containingPanel.add(label, gridBagConstraintForLabel);

        JTextField textField = new JTextField();
        GridBagConstraints gridBagConstraintForTextField = new GridBagConstraints();
        gridBagConstraintForTextField.fill = GridBagConstraints.BOTH;
        gridBagConstraintForTextField.insets = new Insets(0, 0, 5, 0);
        gridBagConstraintForTextField.gridx = 1;
        gridBagConstraintForTextField.gridy = yPos;
        containingPanel.add(textField, gridBagConstraintForTextField);
        textField.setColumns(10);
    }

}
