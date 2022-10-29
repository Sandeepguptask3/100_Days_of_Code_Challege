/*The Java switch statement executes one statement from multiple conditions. It is like if-else-ifladder statement. 



Syntax:

switch(expression){    

case value1:    

 //code to be executed;    

 break;  //optional  

case value2:    

 //code to be executed;    

 break;  //optional  

......    

    

default:     

  code to be executed if all cases are not matched;  

}   

*/
package com.company;
import java.util.Scanner;
public class check_age_life {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("Your age is become an adult!");
                break;
                case 23:
                System.out.println("You are going to join job!");
                break;
                case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life !");
        }
    }
}


/* input: 23 
   output :You are going to join job!
   
   note input not match its give 
   output :Enjoy your life !
   
  */
