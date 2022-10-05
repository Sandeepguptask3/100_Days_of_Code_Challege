/* problem: Show the length of String.
  
 Sample input :- sand eep
 Sample output :- 8
Testcase :- If we take space in name 
Output :- 
  space is counted in your String length                       */
package com.company;
import java.util.Scanner;
public class length_String_Check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= sc.nextLine();
        System.out.println(+name.length());
    }
}
/*RESULT
Input: Enter your name
Output: 8
Explanation: Here space be counted in your string.*/
