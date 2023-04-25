package com.tujuhsembilan;

public class Categories {
    //menggunakan access modifier private pada field atau attribute
    private int id;
    private String name;
    private boolean expensive;


    public Categories(int id, String name, boolean expensive){
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories(){
        super();
    }

    //contoh getter dan setter tipe data boolean
    //getter
    public boolean isExpensive(){
        return this.expensive ;
    }
    //setter data boolean
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }

    //tipe data object
    //getter
    public String getName(){
        return this.name;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }

    //tipe data primitif (integer)
    //getter
    public int getId(){
        return this.id ;
    }

    public void setId(){
        this.id=id;
    }

    //setter
    public static void main(String[] args) {

    }
}
