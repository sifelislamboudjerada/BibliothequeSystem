package main.java.com.bibliotheque.models;

import java.time.LocalDate;

public class Book {

    private int id;
    private String srial_Number;
    private String title;
    private String name_Of_Author;
    private int number_Copies_Availble;
    private LocalDate date_added;

   public Book(){}

   public Book (int id, String srial_Number, String title,String name_Of_Author, int number_Copies_Availble, LocalDate date_added){
        this.id = id;
        this.srial_Number = srial_Number;
        this.number_Copies_Availble = number_Copies_Availble;
        this.title = title;
        this.name_Of_Author = name_Of_Author;
        this.date_added = date_added;
    }
// Setters and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrial_Number() {
        return srial_Number;
    }

    public void setSrial_Number(String srial_Number) {
        this.srial_Number = srial_Number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName_Of_Author() {
        return name_Of_Author;
    }

    public void setName_Of_Author(String name_Of_Author) {
        this.name_Of_Author = name_Of_Author;
    }

    public int getNumber_Copies_Availble() {
        return number_Copies_Availble;
    }

    public void setNumber_Copies_Availble(int number_Copies_Availble) {
        this.number_Copies_Availble = number_Copies_Availble;
    }

    public LocalDate getDate_added() {
        return date_added;
    }

    public void setDate_added(LocalDate date_added) {
        this.date_added = date_added;
    }
}