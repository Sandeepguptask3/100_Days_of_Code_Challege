/*
Topic:- Sorting an array
The sorting is a way to arrange elements of a list or array in a certain order. The order may be in ascending or descending order. 

problem:-Sort an Array in Alphabetical Order

Algorithm:-
1) Start
2) Declare an Array
3) Initialize the Array
4) Use two for loops to sort the array in alphabetical order.
5) Use the first for loop to hold the elements.
6) Use the second for loop to compare with the remaining elements.
7) Use the compareTo() to compare.
8) Swap the array elements.
9) Print the updated array.
10) Stop
sample input:-
Enter the number of elements 
5
Enter the String 
Apple
orange 
banana
papaya
carrot

sample output:-
Apple, banana, carrot, orange , papaya // sort in ascending form

Testcase:- In this program if we take  datatype String from user in lowercase or uppercase.

output:-  Apple, banana, carrot, orange , papaya //same output


*/
package company.com;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting_Array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n;   //Declare the array size
        System.out.println("Enter the number of elements ");
        n=sc.nextInt();    //Initialize the array size

        String fruits[]=new String[n];   //Declare the array
        System.out.println("Enter the String ");
        Scanner sc1=new Scanner(System.in);
        for(int i=0; i<n ;i++)     //Initialize the array
        {
            fruits[i]=sc1.nextLine();
        }

        //logic for sorting
        for(int i = 0; i<n; i++)   //Holds each element
        {
            for (int j = i+1; j<n; j++)  //Check for remaining elements
            {
                //compares each elements of the array to all the remaining elements
                if(fruits[i].compareTo(fruits[j])>0)
                {
                    //swapping array elements
                    String temp = fruits[i];
                    fruits[i] = fruits[j];
                    fruits[j] = temp;
                }
            }
        }
        //prints the sorted array in alphabetical order
        System.out.println(Arrays.toString(fruits));
    }
}
