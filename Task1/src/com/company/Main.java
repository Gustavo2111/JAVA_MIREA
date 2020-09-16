package com.company;


public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Dostoevskiy", 176);
        Book b2 = new Book("Gogol", 532);
        Book b3 = new Book("Blok", 8756);
        Book b4 = new Book("Pushkin");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());

        Dog d1 = new Dog("Sam", 17);
        Dog d2 = new Dog("Gera", 1);
        Dog d3 = new Dog("Chester", 3);
        Dog d4 = new Dog("Richi");

        System.out.println(d1.toString());
        System.out.println(d2.humanAge());
        d3.setAge(200);
        System.out.println(d3.humanAge());
        System.out.println(d4.toString());

        Ball a1 = new Ball("Orange", 12);
        Ball a2 = new Ball("Yellow", 9);
        Ball a3 = new Ball("Green", 1);
        Ball a4 = new Ball("Purple");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
