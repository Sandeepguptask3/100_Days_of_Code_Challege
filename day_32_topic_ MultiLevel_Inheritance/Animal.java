/* Topic: MultiLevel Inheritance
When multiple classes are involved and their parent-child relation is formed in a chained way then such formation is known as multi-level inheritance.
  
In multilevel inheritance, a parent a class has a maximum of one direct child class only.
  
In multi-level inheritance, the inheritance linkage is formed in a linear way and minimum 3 classes are involved.
  
Example:-class A
 
{
 
}
 
class B extends A
 
{
 
}
 
class C extends B
 
{
 
}
Suppose, we have a form as shown above (class A is the parent of class B and class B is the parent of class C), 
then features of A are available for B, and features of B (including that of A) are available for C. So, class C get features of both A and B.
In this case, class B is the parent to C and child to A. such classes are generally known as intermediate classes.
When an object of class C is created, constructors of all the three classes will be executed.
Even though the control goes to the constructor of C first, the actual sequence of execution will be the constructor of A first, 
the constructor of B next and constructor of C at last.
Program :-Java program to illustrate the concept of Multilevel inheritance.
Output:- weeping...
         barking...
         eating...

Code:- */
package com.company;

public class Animal {
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{
        void bark(){System.out.println("barking...");}
    }
    class BabyDog extends Dog{
        void weep(){System.out.println("weeping...");}
    }
    class TestInheritance2{
        public static void main(String args[]){
            BabyDog d=new BabyDog();
            d.weep();
            d.bark();
            d.eat();
        }
}

