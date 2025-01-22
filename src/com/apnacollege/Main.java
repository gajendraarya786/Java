package com.apnacollege;

//To use Arrays.sort method we have to include the package java.util.Arrrays
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        // our first program
        System.out.println("Hello Java");
        System.out.println("I m Gajendra");

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

        //substring
        System.out.println(nameX.substring(0,3));

        // arrays
        int[] marks = new int[3];
        marks[0] = 85;
        marks[1]= 97;
        marks[2]= 72;
        System.out.println(marks[1]);

        //length
        System.out.println( marks.length);

        //value of 0th index before sorting
        System.out.println(marks[0]);
        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //initializing a new array
        int[] marks2 = {97,85,71};

        //initializing marks of 2 students using 2-D array
        int[][] finalMarks = {{97,98,89}, {71,88,94}};

        //To print marks of 1st student in 1st subject
        System.out.println(finalMarks[0][0]);
        //similarily
        System.out.println(finalMarks[1][0]);

        //casting
        double price = 100.00;
        double finalPrice = 100.00 + 18;
        System.out.println(finalPrice);

        int p = 100;
        int fp = p + (int) 18.18;
        // when double is casted in int type the  all the decimals are removed
        System.out.println(fp);

        //constants
        int age2 = 30;
        age2 = 31;
        age2 = 32;

        //we assign the keyword final to the variable to make it constant
       final float PI = 3.14F;


       //Operators
        float a = 1;
        float b = 2;
        float c = 3;
        float div = a/b;
        float modulo = 1%2;
        System.out.println(div);
        System.out.println(modulo);

        int number = 1;
        number++; //unary operator
        System.out.println(number);

        // Maths class
        //5,6
        // to find which is greater among both of them we use a class Math.max(a,b)
        System.out.println(Math.max(5,6));

        //Random function which returns a random value between the range 0.0 to 1.0
        System.out.println(Math.floor((Math.random() * 5) +1));

        // How to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age");
        int age3 = sc.nextInt();
//        System.out.println(age3);
        if(age3 >= 18) {
            System.out.println("Adult");
        }
            else{
                System.out.println("Not adult");
            }
        }
    }
