package com.tujuhsembilan;

public class Programmer extends Person{
    String technology;

//    public Programmer(String technology) {
//        this.technology = technology;
//    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    Programmer(){
        super();
    }
    void hacking(){
        System.out.println("I can hacking a website");
    }

    void coding(){
        System.out.println("I can create a application using technology : "+ technology + ".");
    }

    void greeting(){
        //override
        super.greeting();//memanggil method greeting dari parent atau person class
        //penggunaan kw super harus di line pertama baris code baik dari statement, method/function scope
        System.out.println("My job is a "+ technology + " Programmer");
    }
}
