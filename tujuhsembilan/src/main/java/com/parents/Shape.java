package com.parents;
//
public abstract class Shape {
    private String color;
    public Shape(){
        //TODO Auto-generated constructor stub
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String Color){
        this.color = color;
    }

    //abstract method getArea
    public abstract double getArea();
}
