package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle c = new Circle(9,"red");
	    c.afisare();

        System.out.println(c.getRadious());
        System.out.println(c.getColor());

        c.setRadious(5);
        double raza=c.getRadious();
        System.out.println("Radious: "+raza);

        c.setColor("green");
        String culoare=c.getColor();
        System.out.println("Color: "+culoare);
    }
}
