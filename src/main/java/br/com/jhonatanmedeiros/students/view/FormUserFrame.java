package br.com.jhonatanmedeiros.students.view;

import br.com.jhonatanmedeiros.students.model.StudentModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class FormUserFrame extends JFrame {

    private final JLabel labelName = new JLabel();
    private final JTextField inputName = new JTextField();
    private final JLabel labelSex = new JLabel();
    private final JComboBox comboxGener = new JComboBox();
    private final JButton buttonSubmit = new JButton();
    private final JLabel labelId = new JLabel();
    private final JTextField inputId = new JTextField();
    private final JLabel labelStudentName = new JLabel();
    private final JButton buttonBack = new JButton();
    private final JLabel labelRegister = new JLabel();
    private final JTextField inputRegister = new JTextField();
    private final JLabel labelCourses = new JLabel();
    private final JScrollPane scrollPanel = new JScrollPane();
    private final JTable tableCourses = new JTable();
    private final JLabel jLabel7 = new JLabel();
    private final JComboBox comboboxCousers = new JComboBox<>();
    private final JButton labelAdd = new JButton();
    private final JButton labelRemove = new JButton();

    private StudentModel student;

    private final FormListStudent formListStudent;

    public FormUserFrame(FormListStudent formListStudent) {
        this.formListStudent = formListStudent;
        this.setTitle("Criar Usuário");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    public FormUserFrame(FormListStudent formListStudent, StudentModel student) {
        this.formListStudent = formListStudent;
        this.student = student;
        this.setTitle("Editar Usuário");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createComponents();
        this.setVisible(true);
        this.getContentPane().setBackground(Color.WHITE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private void createComponents() {

        getContentPane().setLayout(new AbsoluteLayout());

        labelName.setFont(new java.awt.Font("Candara", 1, 16));
        labelName.setText("Nome:");
        getContentPane().add(labelName, new AbsoluteConstraints(10, 230, -1, -1));

        inputName.setFont(new java.awt.Font("Candara", 0, 16));
        getContentPane().add(inputName, new AbsoluteConstraints(10, 250, 300, -1));

        labelSex.setFont(new java.awt.Font("Candara", 1, 16));
        labelSex.setText("Sexo");
        getContentPane().add(labelSex, new AbsoluteConstraints(10, 300, -1, -1));

        comboxGener.setFont(new java.awt.Font("Candara", 0, 16));
        comboxGener.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Masculino", "Feminino"}));
        comboxGener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                sexoActionPerformed(evt);
            }
        });
        getContentPane().add(comboxGener, new AbsoluteConstraints(10, 320, 257, -1));

        buttonSubmit.setFont(new java.awt.Font("Candara", 0, 16));
        buttonSubmit.setText("Salvar");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStudent(evt);
            }
        });
        getContentPane().add(buttonSubmit, new AbsoluteConstraints(471, 446, 107, -1));

        labelId.setFont(new java.awt.Font("Candara", 1, 16));
        labelId.setText("Id:");
        getContentPane().add(labelId, new AbsoluteConstraints(10, 100, 40, -1));

        inputId.setFont(new java.awt.Font("Candara", 0, 16));
        inputId.setEnabled(false);
        int index = formListStudent.studentService.getAll().size() + 1;
        inputId.setText(Integer.toString(index));
        getContentPane().add(inputId, new AbsoluteConstraints(10, 121, 300, -1));

        labelStudentName.setFont(new java.awt.Font("Candara", 0, 36));
        labelStudentName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelStudentName.setText("Aluno");
        getContentPane().add(labelStudentName, new AbsoluteConstraints(10, 10, 430, 34));

        buttonBack.setFont(new java.awt.Font("Candara", 0, 16));
        buttonBack.setText("Voltar");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(buttonBack, new AbsoluteConstraints(588, 446, 106, -1));

        labelRegister.setFont(new java.awt.Font("Candara", 1, 16));
        labelRegister.setText("Matricula:");
        getContentPane().add(labelRegister, new AbsoluteConstraints(10, 170, 80, -1));

        inputRegister.setFont(new java.awt.Font("Candara", 0, 16));
        inputRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        getContentPane().add(inputRegister, new AbsoluteConstraints(10, 190, 300, -1));

        labelCourses.setFont(new java.awt.Font("Tahoma", 1, 16));
        labelCourses.setText("Cursos");
        getContentPane().add(labelCourses, new AbsoluteConstraints(370, 100, -1, -1));

        tableCourses.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Nome", "Descrição"
                }
        ));
        scrollPanel.setViewportView(tableCourses);

        getContentPane().add(scrollPanel, new AbsoluteConstraints(370, 120, 350, 120));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel7.setText("Curso:");
        getContentPane().add(jLabel7, new AbsoluteConstraints(370, 250, -1, -1));

        comboboxCousers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // cursoComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboboxCousers, new AbsoluteConstraints(370, 270, 350, -1));

        labelAdd.setFont(new java.awt.Font("Candara", 0, 16));
        labelAdd.setText("Adicionar");
        labelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                adicionarAutorActionPerformed(evt);
            }
        });
        getContentPane().add(labelAdd, new AbsoluteConstraints(510, 300, -1, -1));

        labelRemove.setFont(new java.awt.Font("Candara", 0, 16));
        labelRemove.setText("Remover");
        labelRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                removerAutorActionPerformed(evt);
            }
        });
        getContentPane().add(labelRemove, new AbsoluteConstraints(620, 300, -1, -1));

        pack();

    }

    private void saveStudent(ActionEvent evt) {

        student = new StudentModel(
                this.inputName.getText(),
                this.inputRegister.getText(),
                "09/05/1998",
                "1111",
                "0000",
                "Sistemas de Informação",
                "M"
        );

        this.formListStudent.studentService.create(student);

//        ArrayList<Curso> cursos = new ArrayList<>();
//        for (int i = 0; i < tabelaCursos.getRowCount(); i++) {
//
//            Curso c = new Curso();
//            int id;
//
//            id = (int) tabelaCursos.getValueAt(i, 0);
//
//            c.setIdCurso(id);
//            cursos.add(c);
//
//        }
        //al.set(cursos); //Esperar commit do bean do Aluno para aceitar Cursos.
//        Principal.alunos.add(al);
//        if (al.getIdPessoa() == 0) {
//            try {
//                alunoDao.salvar(al);
//            } catch (Exception ex) {
//                Logger.getLogger(FrmAluno.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        } else {
//            //alunoDao.Alterar(al);
//        }
        formListStudent.loadStudents();
        this.dispose();

    }

}
