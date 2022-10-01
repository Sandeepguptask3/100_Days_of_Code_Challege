package com.company;
import java.util.Scanner;
public class using_for_loop_print_any_table {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter table No.= ");
//reading a number whose table is to be print
            int num=sc.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false
            for(int i=1; i <= 10; i++)
            {
//prints table of the entered number
                System.out.println(num+" * "+i+" = "+num*i);
            }
        }

    }

