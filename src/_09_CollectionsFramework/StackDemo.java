package _09_CollectionsFramework;

import java.util.Stack;

public class StackDemo {
    void main(){
        Stack<Integer> stack = new Stack<>();
//        Add the Elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

//       Remove the Elements
        stack.pop();
        System.out.println(stack);

//      Return the Top Values
        System.out.println(stack.peek());

//        Using Enhance for Loop
        System.out.println("Using Enhance For Loop");
        for(Integer i : stack){
            System.out.println(i);
        }
    }
}
