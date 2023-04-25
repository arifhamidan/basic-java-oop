package com.childs;

import com.parents.Product;

public class Item extends Product {
    private int price;

    public Item(){
        //todo auto generated constructor stub
    }

    public Item(String name, int price){
        super();
        this.price = price;
    }

    //implementasi method abstract supaya menjadi bentuk konkrit dan jelas
    //dengan cara override pada method tsb
    //kemudian menambahkan body statement/isi printInformation tsb,
    //
    public void  printInformation(){
        System.out.println("Product Name : "+ getName());
        System.out.println("Product Price : "+ getPrice());
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
