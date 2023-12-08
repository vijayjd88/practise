package org.jpmc.training.to;

public class StudentTO {
    private String id;
    private String name;
    private int age;

    public StudentTO() {
    }

    public StudentTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id.hashCode()+name.hashCode(); //hashcode is only for String Type
                                                // If Integer , we compare with the values
    }

    @Override
    public boolean equals(Object xxx) {
        if(xxx instanceof StudentTO){
            StudentTO ob1=(StudentTO) xxx;
            if(this.hashCode()==ob1.hashCode() && (this.age==ob1.age)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "StudentTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
