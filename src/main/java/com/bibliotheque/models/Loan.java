package main.java.com.bibliotheque.models;

import java.time.LocalDate;

public class Loan {
    
    private int id;
    private String number_Of_Loan;
    private Student student;
    private Book book;
    private LocalDate loan_Date;
    private LocalDate expected_Return_Date;
    private LocalDate actual_Return_Date;
    private String status;

    public Loan(){
    }

    public Loan(int id, String number_Of_Loan, Student student, Book book, LocalDate loan_Date, LocalDate expected_Return_Date, LocalDate actual_Return_Date, String status){
        this.id = id;
        this.number_Of_Loan = number_Of_Loan;
        this.student = student;
        this.book = book;
        this.loan_Date = loan_Date;
        this.expected_Return_Date = expected_Return_Date;
        this.actual_Return_Date = actual_Return_Date;
        this.status = status;
    }

    // Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber_Of_Loan() {
        return number_Of_Loan;
    }

    public void setNumber_Of_Loan(String number_Of_Loan) {
        this.number_Of_Loan = number_Of_Loan;
    }
    
    public Student getStudent() {
         return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoan_Date() {
        return loan_Date;
    }

    public void setLoan_Date(LocalDate loan_Date) {
        this.loan_Date = loan_Date;
    }

    public LocalDate getExpected_Return_Date() {
        return expected_Return_Date;
    }

    public void setExpected_Return_Date(LocalDate expected_Return_Date) {
        this.expected_Return_Date = expected_Return_Date;
    }

    public LocalDate getActual_Return_Date() {
        return actual_Return_Date;
    }

    public void setActual_Return_Date(LocalDate actual_Return_Date) {
        this.actual_Return_Date = actual_Return_Date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
