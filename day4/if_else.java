//Take values of length and breadth of a rectangle from user and check if it is square or not.

package com.company;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter length =");
            int x = s.nextInt();
            System.out.println("Enter breadth =");
            int y = s.nextInt();
            if(x==y){
                //length and breadth are same then it print square Othewise it print rectangle
                System.out.println("Square");
            }
            else{
                System.out.println("Rectangle");
            }
        }
    }

