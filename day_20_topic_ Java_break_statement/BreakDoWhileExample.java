/*Java Break Statement

When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.

The Java break statement is used to break loop or switch

statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.We can use Java break statement in all types of loops such as for loop

,while loop and do-while loop.

Syntex  :
for while loop:-
while(TestExpression){
//code
if(condition to break){
break;
}
//codes
}

for do while loop:-
do{
//codes
if(condition to break){
break;
}
//codes
}
while(TestExpression);



for For loop:-
for(init;TestExpression;update){
//code
if(condition to break){
break;
}
//codes
}

*/

package com.company;

public class BreakDoWhileExample {
    public static void main(String[] args) {
        //declaring variable
        int i=1;
        //do-while loop
        do{
            if(i==5){
                //using break statement
                i++;
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}

/*

output:
1
2
3
4
