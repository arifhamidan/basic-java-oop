package com.tujuhsembilan;

import com.childs.Circle;
import com.childs.Item;
import com.childs.Triangle;
import com.parents.Product;
import com.parents.Shape;

public class MainApp {
    public static void main(String[] args) {
        //Product product1 = new Product();//tidak dapat langsung diinstansiasi menjadi object karena class Product adalah abstract.
        Product product2 = new Item();//dapat membuat obj product dari instansiasi child class item;


        Shape lingkaran = new Circle("Biru", 20);
        Shape segitiga = new Triangle(10,15,"Merah");

        System.out.println("Luas lingkaran berwarna " + lingkaran.getColor() + " adalah "+ lingkaran.getArea());
        System.out.println("Luas segitiga berwarna " + segitiga.getColor() + " adalah "+ segitiga.getArea());
    }
}
