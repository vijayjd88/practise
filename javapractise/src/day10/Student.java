package day10;

import java.time.LocalDate;

public class Student {
    private String fname;
    private String city;
    private LocalDate dob;

    public Student() {
    }

    public Student(String fname, String city, LocalDate dob) {
        this.fname = fname;
        this.city = city;
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", city='" + city + '\'' +
                ", dob=" + dob +
                '}';
    }
}
