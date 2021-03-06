package br.com.jhonatanmedeiros.students.model;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class StudentModel {
    
    private String name; // required
    private String numberContract; // required and uniq
    private String birthday; // required
    private String rg; // required
    private String cpf; // required and uniq
    private String course; // required
    private String registerDate;
    private String observation;
    private String gener; // required
    private String picture;

    public StudentModel(String name, String numberContract, String birthday, String rg, String cpf, String course, String gener) {
        this.name = name;
        this.numberContract = numberContract;
        this.birthday = birthday;
        this.rg = rg;
        this.cpf = cpf;
        this.course = course;
        this.gener = gener;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
}
