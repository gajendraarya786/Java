package com.apnacollege;
//import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        //nextLine take the whole string input
        String name = sc.nextLine();
        System.out.println("Your name is :" + name);

        System.out.println("Input your age:");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
        //Comparison operators
        //a==b
        //a!=b
        //a<b
        //a>b
        //a >=b

        //logical and: &&
        //logical or: ||
        int a = 60;
        int b = 40;
            if (a < 50 || b < 50) {
                System.out.println("Both less than 50");
            }

            //Conditional Statements Switch
                int day = 2;
            switch (day){
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                default:
                    System.out.println("Wed-Sun");
            }
            }
            }




