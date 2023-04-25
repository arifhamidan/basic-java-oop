package com.tujuhsembilan;

import com.childs.Doctor;
import com.childs.Programmer;
import com.childs.Teacher;
import com.parents.Person;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //implementasi polymorpism
        // membuat obj programmer dan disimpan pada type data person
        Person person1 = new Programmer("Rina","Banung",".Net Core");
        Person person2 = new Teacher("Juna","Purwokerto","Matematika");
        Person person3 = new Doctor("Eko","Surakarta","Pedistrician");

        person1.greeting();

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
       // System.out.println(((Programmer)person1).technology);//recasting
    }
//    static void sayHello(Person person) {
//        String message;
//        if(person instanceof Programmer) {
//            Programmer programmer = (Programmer) person;
//            message = "Hello, " + programmer.name + ". Seorang Programmer " + programmer.technology + ".";
//        } else if(person instanceof Teacher) {
//            Teacher teacher = (Teacher) person;
//            message = "Hello, " + teacher.name + ". Seorang guru " + teacher.subject + ".";
//        } else if(person instanceof Doctor) {
//            Doctor doctor = (Doctor) person;
//            message = "Hello, " + doctor.name + ". Seorang doctor " + doctor.specialist + ".";
//        } else {
//            message = "Hello " + person.name + ".";
//        }
//        System.out.println(message);
//    }
static void sayHello(Person person) {
    String message;
    if(person instanceof Programmer) {
        Programmer programmer = (Programmer) person;
        message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
    } else if(person instanceof Teacher) {
        Teacher teacher = (Teacher) person;
        message = "Hello, " + teacher.getName() + ". Seorang guru " + teacher.getSubject() + ".";
    } else if(person instanceof Doctor) {
        Doctor doctor = (Doctor) person;
        message = "Hello, " + doctor.getName() + ". Seorang doctor " + doctor.getSpecialist() + ".";
    } else {
        message = "Hello " + person.getName() + ".";
    }
    System.out.println(message);
}


//       Person person1 = new Person();
//       person1.name = "Boris";
//       person1.address = "Banung";
//
//       Teacher teacher = new Teacher();
//       teacher.name = "Hedi";
//       teacher.address = "Sukabumi";
//       teacher.subject = "Angkat Baja";
//
//       Doctor doctor = new Doctor();
//       doctor.name = "Dadang";
//       doctor.address ="Bogor";
//       doctor.specialist = "Kutu Air";
//
//       Programmer programmer = new Programmer();
//       programmer.name = "Jems";
//       programmer.address = "Kidul";
//       programmer.technology = "Jawa Language";
//
//       person1.greeting();
//        System.out.println();
//
//        teacher.greeting();
//        System.out.println();
//
//        doctor.greeting();
//        System.out.println();
//
//        programmer.greeting();
//        System.out.println();
}