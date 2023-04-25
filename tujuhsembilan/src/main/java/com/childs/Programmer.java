package com.childs;

import com.parents.Person;

public class Programmer extends Person {
    private String technology;

//    public Programmer(String technology) {
//        this.technology = technology;
//    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public Programmer(){
        super();
    }
    public void hacking(){
        System.out.println("I can hacking a website");
    }

    public void coding(){
        System.out.println("I can create a application using technology : "+ technology + ".");
    }

    public void greeting(){
        //override
        super.greeting();//memanggil method greeting dari parent atau person class
        //penggunaan kw super harus di line pertama baris code baik dari statement, method/function scope
        System.out.println("My job is a "+ technology + " Programmer");
    }

    public String getTechnology(){
        return this.getTechnology();
    }

    public void setTechnology(String technology){
        this.technology = technology;
    }


}
