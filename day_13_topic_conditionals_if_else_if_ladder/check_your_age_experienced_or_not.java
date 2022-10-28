/* in this program using if else if ladder check age wise who is experienced person or not 

check condition 
age>56
semi experienced
age>36
semi semi Experienced 
age<36
You are not Experienced
*/



package com.company;
import java.util.Scanner;
public class check_your_age_experienced_or_not {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age -");
        Scanner sc = new Scanner(System.in);
        age =sc.nextInt();
        if (age>56){
            System.out.println("You are semi Experienced !");
        }
        else if(age>36){
            System.out.println("You are semi semi Experienced !");
        }
        else{
            System.out.println("You are not Experienced !");
        }
        if (age>2){
            System.out.println("You are not a baby !");
        }

    }
}
