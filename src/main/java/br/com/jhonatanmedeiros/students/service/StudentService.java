package br.com.jhonatanmedeiros.students.service;

import br.com.jhonatanmedeiros.students.model.StudentModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class StudentService {
    
    private final List<StudentModel> studentList = new ArrayList<>();

    public StudentService() {
        this.initializeList();
    }
    
    
    public void create(StudentModel student){
        this.studentList.add(student);
    }
    
    public void update(StudentModel user){
        
    }
    
    public List<StudentModel> getAll(){
        return this.studentList;
    }
    
    public void delete(StudentModel user){
        
    }
    
    private void initializeList() {
        StudentModel student1 = new StudentModel("Jhonatan Hardt de Medeiros", "2020001", "09/05/1998", "39.424.282-8", "596.931.260-68", "Sistemas de Informação", "M");
        StudentModel student2 = new StudentModel("Eduardo Luís Silva", "2020002", "23/05/1945", "15.032.541-1", "036.597.665-26", "Engenheiro Cvil", "M");
        StudentModel student3 = new StudentModel("Lorena Rita Sabrina Gonçalves", "2020003", "16/05/1979", "22.362.745-8", "030.151.862-99", "Direito", "F");
        
        this.studentList.add(student1);
        this.studentList.add(student2);
        this.studentList.add(student3);
    }
    
    
}
