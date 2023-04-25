package com.parents;

public class Person {
   private String name;
    private String address;
    //constructor default tanpa parameter
    public Person(){
        super();
    }
    //
    public Person(String name, String address){
        super();
        this.name = name;
        this.address = address;
    }

    //setter dan getter
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    //getter dan setter address
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void greeting(){
        System.out.println("Hello my name is " + name +".");
        System.out.println("I, come from "+ address+ ".");

    }

}
