package main.java.com.bibliotheque.models;

public class Student {
    private int id;
    private String number_Of_Student;
    private String first_name;
    private String last_Name;

    public Student(){
    }

    public Student(int id, String number_Of_Student, String first_Name, String last_Name){
        this.id = id;
        this.number_Of_Student = number_Of_Student;
        this.first_name = first_Name;
        this.last_Name = last_Name;
    }
// Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNumber_Of_Student() {
    return number_Of_Student;
    }

    public void setNumber_Of_Student(String number_Of_Student) {
         this.number_Of_Student = number_Of_Student;
    }

    public String getFirst_name() {
        return first_name;
    }
    
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

}
