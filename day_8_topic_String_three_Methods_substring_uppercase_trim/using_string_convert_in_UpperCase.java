//The java string toUpperCase() method returns the string in uppercase letter.
//test 1:input sandeep output SANDEEP
//test 2 : input SANdeep output SANDEEP 
//test 3 : input SAN deep output - SAN DEEP
//here user input to above condition output are same like UppperCase.
package com.company;
import java.util.Scanner;
public class using_string_convert_in_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= sc.nextLine();
        System.out.println(name.toUpperCase());
        if(name==name.toUpperCase()) {
            System.out.println(" Your word is already in Lowercase");
        }
    }
}
