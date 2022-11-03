/*
Topic:- do-while loops

do-while loop is similar to while loop, however there is a difference between them: In while loop, 
condition is evaluated before the execution of loop’s body but in do-while loop condition is evaluated
after the execution of loop’s body.

syntax :-

do{    
//code to be executed / loop body  
//update statement   
}while (condition);    


Question :-Write a java program to find HCF of Two given user number .


Input : first number (dividend)= 20
        second number(divisor)= 5
output : HCF: 5

*/

package com.company;
import java.util.Scanner;
public class Find_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int dividend, divisor;
            int remainder, hcf = 0;
            System.out.println("Enter the Your first number ");
            dividend = sc.nextInt();
            System.out.println("Enter the Your second number ");
            divisor = sc.nextInt();
            do
            {
                remainder = dividend % divisor;
                if(remainder == 0)
                {
                    hcf = divisor;
                }
                else
                {
                    dividend = divisor;
                    divisor = remainder;
                }
            }while(remainder != 0);
            System.out.println("HCF: " + hcf);
    }
}
