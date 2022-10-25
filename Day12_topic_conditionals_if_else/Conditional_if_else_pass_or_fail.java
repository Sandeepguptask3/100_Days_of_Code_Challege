/* Topic : Conditional 
Conditional operators check the condition and decides the desired result on the basis of both conditions
Problem :- Write a program to find out whether a student is pass or fail; if it requires total 40% and atleast 33% in each subject to pass.
Assume 3 subjects and take marks as an input from the user.
  
Sample input :- 40
                50
                50
Sample output:-
           Your overall percentage is 56.0
           You are passed
Testcase :-If user take marks as an input less than 33 in any one subject.
Output: You are failed
Code:- */
  
package company.com;

import java.util.Scanner;

public class Conditional_if_else_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in physics");
        int m1=sc.nextInt();
        System.out.println("Enter marks in chemistry");
        int m2= sc.nextInt();
        System.out.println("Enter marks in math");
        int m3=sc.nextInt();
        double avg=(m1+m2+m3)/3;
        System.out.println("Your overall percentage is " +avg);
        if(avg>=40 && m1>=33 &&m2>=33 &&m3>=33) {
            System.out.println("You are passed");
        }
            else{
            System.out.println("You are failed");
        }
    }
}
