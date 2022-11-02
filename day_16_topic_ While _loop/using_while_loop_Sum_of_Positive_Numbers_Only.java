/*Topic : While Loop

The Java
while loopis used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.

Syntax:
while (condition){    
//code to be executed   
Increment / decrement statement  
}   
problem: java program find the Sum of Positive Numbers Only
simple input :5+10+5-5
simple output: 20
test case: In this program negative number not included.

*/
package com.company;
import java.util.Scanner;

public class using_while_loop_Sum_of_Positive_Numbers_Only {
    public static void main(String[] args) {
        int sum = 0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // take integer input from the user
        System.out.println("Enter a number");
        int number = input.nextInt();

        // while loop continues
        // until entered number is positive
        while (number >= 0) {
            // add only positive numbers
            sum += number;

            System.out.println("Enter a number");
            number = input.nextInt();
        }

        System.out.println("Sum = " + sum);
        input.close();
    }
}
