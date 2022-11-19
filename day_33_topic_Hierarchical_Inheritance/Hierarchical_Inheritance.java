/* Topic: - Hierarchical Inheritance
When more than one classes inherit a same class then this is called hierarchical inheritance.
Syntax of Hierarchical Inheritance in Java:
class Subclassname1 extends Superclassname
{
// variables and methods
}
class Subclassname2 extends Superclassname
{
// variables and methods
}
Example of Hierarchical Inheritance
We are writing the program where class B, C and D extends class A.
when a class has more than one child classes (sub classes) or in other words more than one child classes have
the same parent class then this type of inheritance is known as hierarchical inheritance.
Program: -Java program to illustrate the concept of Hierarchical  inheritance.
Sample output: - method of Class A
                 method of Class A
                 method of Class A
                 
Code:- */

class A
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class C extends A
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
 public class Hierarchical_Inheritance {
  public static void main(String [] args){
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     //All classes can access the method of class A
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
  }
}
