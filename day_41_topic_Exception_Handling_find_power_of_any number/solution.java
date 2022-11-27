/* 
Topic:- Exception Handling
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
Here's a list of different approaches to handle exceptions in Java.
1) try...catch block
2) finally block
3) throw and throws keyword
Today we will discuss try...catch block.
1. Java try...catch block
The try-catch block is used to handle exceptions in Java.
Syntax:-
try {
  // code
}
catch(Exception e) {
  // code
}
Here, we have placed the code that might generate an exception inside the try block. Every try block is followed by a catch block.
When an exception occurs, it is caught by the catch block. The catch block cannot be used without the try block.

Program: - Exception handling using try...catch.find power of any number
Sample input:5to the power 2.
sample output: - 25

Explanation: -In this Program, we are trying to find the power of any number.

*/

package com.company;

import java.util.*;
import java.util.Scanner;

class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
