/* Topic : for loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
Syntax
       for (statement 1; statement 2; statement 3) {
              // code block to be executed
       }
Statement 1 is executed (one time) before the execution of the code block.
Statement 2 defines the condition for executing the code block.
Statement 3 is executed (every time) after the code block has been executed.
  
Problem :-Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
(Do not use java built method)
sample output :- Enter the base number = 20
                 Enter the power = 5
sample output :- 3200000
Testcase1 :- if user take 0 as base and any number in power.
output :- 0
Testcase2 :- if user take any number in base and 0 as a power.
output:- 1
  
Code :- */

package company.com;

import java.util.Scanner;

public class find_Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base;
        int power;
        int result=1;
        System.out.println("Enter the base number");
        base= sc.nextInt();
        System.out.println("Enter the power ");
        power= sc.nextInt();
        for(int i=1; i<=power; i++){
            result *=base;
        }
        System.out.println("Result :"+result);
    }
}
