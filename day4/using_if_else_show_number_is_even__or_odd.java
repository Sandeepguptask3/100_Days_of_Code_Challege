//take random number it show your number is even od odd .
package com.company;
import java.util.Scanner;
public class using_if_else_show_number_is_even__or_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number =");
        int x = s.nextInt();
       // int number=13;
        //Check if the number is divisible by 2 or not
        if(x%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
