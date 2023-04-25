package com.tujuhsembilan;

import com.parents.Person;

public class AppMain {
    //sekarang di appmain tidak ada error
    public static void main(String[] args) {
        //pembuatan object
        Person person1 = new Person();
       // person1.name = "RUDI"; salah karena access modifier menggunakan
        person1.setName("Rudi");
        person1.setAddress("Badung");

       // System.out.println(person1.name);// salah karena field private
        System.out.println(person1.getName());//benar, cara memanggil atau menggunakan field name dari field private
        System.out.println(person1.getAddress());
    }
}
