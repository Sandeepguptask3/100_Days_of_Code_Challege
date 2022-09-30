package com.company;
import java.util.Scanner;
public class String_age_and_hight_compair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Hieght & AGE Of First Student:");
        int h=sc.nextInt();
        int age= sc.nextInt();
        System.out.println("Enter Your Hieght & AGE Of 2nd Student:");
        int h2=sc.nextInt();
        int age2= sc.nextInt();
        if (h>h2 && age>age2){
            System.out.println("The First student is Taller and Older than 2nd Student");
        }
        else {
            System.out.println("The 2nd Student is taller and smaller than the First Student");
        }
    }
}
