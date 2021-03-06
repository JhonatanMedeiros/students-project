package br.com.jhonatanmedeiros.students.view;

import br.com.jhonatanmedeiros.students.model.StudentModel;
import br.com.jhonatanmedeiros.students.service.StudentService;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class FormListStudent extends JFrame {

    private static List<StudentModel> studentList = new ArrayList<>();
    private final JScrollPane scrollPanel = new JScrollPane();
    private final JTable listStudentsTable = new JTable();
    private final JButton btnCreateSutend = new JButton();
    private final JButton btnEditStudent = new JButton();
    private final JButton btnCloseWindow = new JButton();
    private final JButton btnRemoveStudent = new JButton();
    private final JButton btnSearch = new JButton();
    private final JTextField inputTextSearch = new JTextField();
    private final JLabel labelTitle = new JLabel();

    public StudentService studentService;

    public FormListStudent(StudentService studentService) {
        this.studentService = studentService;
        this.setTitle("Lista de Alunos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void createComponents() {
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                // formWindowOpened(evt);
            }
        });

        listStudentsTable.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Matricula",
                    "Nome",
                    "RG",
                    "CPF",
                    "Curso",
                    "Data da Matrícula",
                    "Observações",
                    "Sexo"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        listStudentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                ListaAlunosMouseClicked(evt);
            }
        });
        scrollPanel.setViewportView(listStudentsTable);

        btnCreateSutend.setFont(new java.awt.Font("Candara", 0, 16));
        btnCreateSutend.setText("Cadastrar");
        btnCreateSutend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFormUser(evt);
            }
        });

        btnEditStudent.setFont(new java.awt.Font("Candara", 0, 16));
        btnEditStudent.setText("Alterar");
        btnEditStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        btnRemoveStudent.setFont(new java.awt.Font("Candara", 0, 16));
        btnRemoveStudent.setText("Remover");
        btnRemoveStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        inputTextSearch.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        inputTextSearch.setText("");
        inputTextSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            }
        });
        inputTextSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        inputTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
            }
        });

        btnSearch.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.addActionListener((java.awt.event.ActionEvent evt) -> {
            // jButton6ActionPerformed(evt);
        });

        labelTitle.setFont(new java.awt.Font("Candara", 0, 33)); // NOI18N
        labelTitle.setText("Lista de Alunos");

        // Button "Close Window"
        btnCloseWindow.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        btnCloseWindow.setText("Voltar");
        btnCloseWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelTitle)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(275, 275, 275)
                                                                        .addComponent(btnCreateSutend, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(inputTextSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnEditStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(4, 4, 4)
                                                        .addComponent(btnCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelTitle)
                        .addGap(18, 18, 18)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSearch)
                                .addComponent(inputTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCloseWindow)
                                .addComponent(btnRemoveStudent)
                                .addComponent(btnEditStudent)
                                .addComponent(btnCreateSutend))
                        .addContainerGap())
        );

        pack();
        this.loadStudents();

    }

    private void openFormUser(ActionEvent evt) {
        FormUserFrame a = new FormUserFrame(this);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        a.setResizable(false);
    }

    public void loadStudents() {
        System.out.println("loadStudents");

        FormListStudent.studentList = studentService.getAll();

        DefaultTableModel tabela = (DefaultTableModel) listStudentsTable.getModel();

        tabela.setNumRows(0);

        for (StudentModel s : FormListStudent.studentList) {

            Object[] obj = new Object[]{
                s.getNumberContract(),
                s.getName(),
                s.getRg(),
                s.getCpf(),
                s.getCourse(),
                s.getRegisterDate(),
                s.getObservation(),
                s.getGener()
            };
            tabela.addRow(obj);

        }
    }

}
