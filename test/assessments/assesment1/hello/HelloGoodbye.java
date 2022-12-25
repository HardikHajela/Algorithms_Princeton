//package test.assessments.assesment1.hello;

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a= sc.next(), b= sc.next();

        System.out.println("Hello "+a+" and "+b+".");
        System.out.println("Goodbye "+b+" and "+a+".");
    }
}
