package edu.lawrence.quiz_server;


public class Student {
    private int id;
    private String Name;

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public Student(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }
}
