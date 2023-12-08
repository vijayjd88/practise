package org.example.to;

import java.time.LocalDate;

public class StudentTO {

    String sid;
    String fname;
    String lname;
    LocalDate dob;

    public StudentTO() {
    }

    public StudentTO(String sid, String fname, String lname, LocalDate dob) {
        this.sid = sid;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "StudentTO{" +
                "sid='" + sid + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
