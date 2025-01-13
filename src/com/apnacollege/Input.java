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



    }
}
