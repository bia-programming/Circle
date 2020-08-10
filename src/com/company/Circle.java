package com.company;

public class Circle {
    private double radious=1;
    private String color="black";

    public Circle(){

    }

    public Circle(int radious){
        if(radious>=0 && radious<=10){
            this.radious=radious;
        }
    }

    public Circle(String color){
        if(color!="white" && color!="White"){
            this.color=color;
        }
    }

    public Circle(int radious, String culoare){
        if(radious>=0 && radious<=10){
            this.radious=radious;
        }
        if(color!="white" && color!="White"){
            this.color=culoare;
        }
    }

    void afisare(){
        System.out.println("Cerc: \nRadious: " +radious +" \nColor: "+color);
    }

    public double getRadious(){
        return radious;
    }

    public String getColor(){
        return color;
    }

    public void setRadious(double raza){
        if(raza>=0 && raza<=10){
            radious=raza;
        }
    }

    public void setColor(String color) {
        if(color!="white" && color!="White"){
            this.color=color;
        }
    }
}
