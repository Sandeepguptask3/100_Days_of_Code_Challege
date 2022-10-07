/* Topic :- String (string method)
7) String.endWith();

Program:- 
Here String_name = "Sandeep" check using String.endWith(),it return boolean true or false.
  
sample input:-
         ("eep")
         ("h")
sample output:-
        true
        false
code:-
  */
package company.com;

public class String_end_with {
        public static void main(String[] args) {
            String name = "Sandeep";

            System.out.println(name.endsWith("eep"));
            //true

            System.out.println(name.endsWith("d"));
            //false

        }
    }
