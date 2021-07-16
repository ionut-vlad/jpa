package com.math;

public class Student {

    private String name;
    private String surname;
    private float averageScore;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public float getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
    public Student(String name, String surname, float averageScore) {
        super();
        this.name = name;
        this.surname = surname;
        this.averageScore = averageScore;
    }


}
