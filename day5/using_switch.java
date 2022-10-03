package com.company;
import java.util.Scanner;
public class using_switch {
    public static void main(String[] args) {
        int a = 10 , b = 20 , c ;
        System.out.println("enter user choice :");
        Scanner r = new Scanner(System.in);
        c =r.nextInt();
        switch(c)
        {
            case 1:
            System.out.println(" sum " +(a+b));
            break;
            case 2:
            System.out.println(" sub " + ( a-b ));
            break;
            case 3:
            System.out.println(" multi " + ( a * b ));
            break;
            case 4:
            System.out.println(" div " + ( a / b ));
            break;
            default:
            System.out.println(" invalid choice ....");

        }
        System.out.println("out of switch.....");
    }
}
