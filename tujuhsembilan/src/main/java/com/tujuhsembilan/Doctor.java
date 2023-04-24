package com.tujuhsembilan;

public class Doctor extends Person{
    String specialist;
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
    void surgery(){
        System.out.println("I can surgery operation Patients");
    }
    void greeting(){
        System.out.println("Hello, my name is "+ name+"." );
        System.out.println("I come from " + address + ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}
