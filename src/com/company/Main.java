package com.company;

public class Main {

    public static void main(String[] args) {
        Iphone objectA = new Iphone("X","White",2018);
        SE objectB = new SE("version 8","black",2019);
        SE objectC = new SE("ios","blue",2017);


        System.out.println(objectA.getColor());

        objectA.makeZvon(1, "efe");
        objectB.makeZvon(2,"eyy");
        objectC.makeZvon(3,"hello");

    }
}
