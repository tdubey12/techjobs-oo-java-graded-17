package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    //Id class property
    private int id;
    // value class property
    private String value;
    // NextId is used to generate  unique Id,with every constructor call it is incremented to make it unique
    private static int nextId = 1;

    //default constructor with empty parameters
    public JobField(){
        id = nextId;
        nextId++;
    }
    // constructor with parameter value
    public JobField(String value){
        // called default constructor to initialize id
        this();
        this.value= value;
    }
        //toString method  returns job field's value class property
    @Override
    public String toString() {
        return "JobField{" +
                "value='" + value + '\'' +
                '}';
    }

    // equals method checks equality of id class property with given object's id and return true when id matches
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //returns the value class property if it is not empty else data not available
    public String getValue() {
        if (value!=null && !value.isEmpty()) {

            return value;
        } else{
            return "Data Not Available";
        }
    }
    // sets the value class property from the given value parameters
    public void setValue(String value) {
        this.value = value;
    }
    // returns the id class property
    public int getId() {
        return id;
    }
}
