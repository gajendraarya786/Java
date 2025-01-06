package com.apnacollege;
public class Main{
    public static void main(String[] args){
        // our first program
        System.out.println("Hello Java");
        System.out.println("");

        // variables
        String name = "Aman";
        String neighbour = "Jatin";
        System.out.println(name);
        System.out.println(neighbour);

        // Primitive datatypes
        byte age = 12;
        int phone = 123456789;
        long phone2 = 8573980119L;
        float pi = 3.14f;
        char letter = '@';
        boolean isAdult = false;

        // Non-primitive Datatypes

        String name2 = "Gajendra";
        System.out.println(name2.length());

        //Concatenate
        String firstName = "Krrishika ";
        String lastName = "Taneja";
        System.out.println(firstName.concat(lastName));

        //charAt
        System.out.println(firstName.charAt(2));

        //replace
        String nameX = "Gajendra";
        String nameY = nameX.replace('a', 'b');
        System.out.println(nameY);
    }
}