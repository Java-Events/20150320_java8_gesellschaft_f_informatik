package org.rapidpm.course.java8.gi.m001_corejava.demo.v001;

/**
 * Created by sven on 20.03.15.
 */
public class Auto {

    static {
        System.out.println("static 001");
    }
    static {
        System.out.println("static 001");
    }

    {
        System.out.println("non static 001");
    }
    {
        System.out.println("non static 002");
    }

    public Auto() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {

        Auto auto = new Auto();


    }

}
