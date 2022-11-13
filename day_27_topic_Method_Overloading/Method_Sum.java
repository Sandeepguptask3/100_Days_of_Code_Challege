/*Topic:- Method Overloading
Method Overloading allows different methods to have the same name,
but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both. 
Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java.
In Method overloading compared to parent argument, child argument will get the highest priority. 
Program:- Java program to demonstrate working of method overloading in Java.
sample input:-100, 200
              100, 200, 300
              10.56, 24.5
  
sample output: -
              300
              600
              35.06
  
Explanation and Code:-*/

  
  package company.com;

  public class Method_Sum {
    
        // Java program to demonstrate working of method
        // overloading in Java
    
        public int sum(int x, int y) {                             // Overloaded sum(). This sum takes two int parameters
            return (x + y);
        }
        
       // Overloaded sum(). This sum takes three int parameters
        
         public int sum(int x, int y, int z)
        {
            return (x + y + z);
        }
    
        // Overloaded sum(). This sum takes two double
         public double sum(double x, double y)                    // parameters
        {
            return (x + y);
        }
    
        // Driver code
    
         public static void main(String args[])
        {
            Method_Sum s = new Method_Sum();
            System.out.println(s.sum(100, 200));
            System.out.println(s.sum(100, 200, 300));
            System.out.println(s.sum(10.56, 24.5));
        }
    }
