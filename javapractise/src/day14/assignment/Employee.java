package day14.assignment;

import java.time.LocalDate;

public class Employee {


    public static final int MAX_LEAVES = 25;
    String name;
    Integer lve_availed;
    Integer lve_request;
    String lve_status;

    public Employee() {

    }

    public Employee(String name, Integer lve_availed, Integer lve_request) {
        this.name = name;
        this.lve_availed = lve_availed;
        this.lve_request = lve_request;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Integer getLve_availed() {
        return lve_availed;
    }

    public void setLve_availed(Integer lve_availed) {
        this.lve_availed = lve_availed;
    }

    public Integer getLve_request() {
        return lve_request;
    }

    public void setLve_request(Integer lve_request) {

        this.lve_request = lve_request;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lve availed='" + lve_availed + '\'' +
                ", lve requested=" + lve_request +
                '}';

    }
}


