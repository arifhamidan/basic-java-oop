package com.childs;

import com.parents.Person;

public class Teacher extends Person {
   private String subject;

    public Teacher(String subject) {
        //this.subject = subject;
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void teaching(){
        System.out.println("I can teach" + subject +", so anyone who want to learn can talk to me.");
    }
    public void greeting(){
        super.greeting();//memanggil method greeting dari parent atau person class
        //penggunaan kw super harus di line pertama baris code baik dari statement, method/function scope
        System.out.println("I, come from " + getAddress() +".");
        System.out.println("My job is a teacher "+ subject + " teacher.");
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }
}
