//The trim() method in Java String is a built-in function that
// eliminates leading and trailing spaces. The Unicode value of space character
// is ‘\u0020’. The trim() method in java checks this Unicode value before and after the string,
// if it exists then removes the spaces and returns the omitted string. The trim() method also helps in
// trimming the characters in Java.
// user can input with any space this program showes no space.
//input "        i am sandeep kumar      "
//output i am sandeep kumar
package com.company;
import java.util.Scanner;
public class using_String_Trim {
    public static void main(String[] args) {
        String str1 = "   i am sandeep kumar     ";

        System.out.println(str1.trim());

    }
}
