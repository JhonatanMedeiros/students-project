package br.com.jhonatanmedeiros.students.view;

import br.com.jhonatanmedeiros.students.model.UserModel;
import br.com.jhonatanmedeiros.students.service.UserService;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class ListFrame extends JFrame {

    private JTextField searchField = new JTextField(25);
    private List<UserModel> listUsers = new ArrayList<>();

    public ListFrame() {
        this.setTitle("List Users");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(550, 700));
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void createComponents() {

        this.setLayout(new MigLayout("fillx"));

        // JPanel searchPanel = new WhitePanel(new MigLayout("fillx"));
        // searchField.addActionListener((e) -> {
        // String searchText = ((JTextField) e.getSource()).getText();
        // paintTab(searchText, 0);
        // });
        // searchPanel.add(searchField, "align center");
        // this.add(searchPanel, "align center, wrap");
        
        this.createTable();
    }

    private void createTable() {
        String[] header = {"Aluno", "Matricula", "Data de Nascimento", "CPF", "Curso"};

        DefaultTableModel tableModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(tableModel);

        this.listUsers.removeAll(listUsers);
        this.listUsers = UserService.getAll();

        for (int i = 0; i < listUsers.size(); i++) {
            UserModel user = listUsers.get(i);

            Object[] data = {
                user.getName(),
                user.getNumberContract(),
                user.getBirthday(),
                user.getCpf(),
                user.getCourse()
            };
            tableModel.addRow(data);
        }

        JScrollPane allListScroller = new JScrollPane(table,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        allListScroller.getVerticalScrollBar().setUnitIncrement(20);
        allListScroller.setBackground(Color.WHITE);

        this.add(allListScroller, "align center, growy, wrap");
    }
}
