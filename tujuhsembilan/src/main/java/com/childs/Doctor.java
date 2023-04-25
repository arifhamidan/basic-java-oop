package com.childs;

import com.parents.Person;

public class Doctor extends Person {
    private String specialist;
    public Doctor(String specialist) {
        this.specialist = specialist;
    }
    public Doctor(){
        //todo auto-generated constructor
    }
    public Doctor(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }
    public void surgery(){
        System.out.println("I can surgery operation Patients");
    }
    public void greeting(){
        System.out.println("Hello, my name is "+ getName() +"." );
        System.out.println("I come from " + getAddress() + ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }

    //setter dan getter
    public String getSpecialist(){
        return this.specialist;
    }

    public void setSpecialist(String specialist){
        this.specialist = specialist;
    }
}

