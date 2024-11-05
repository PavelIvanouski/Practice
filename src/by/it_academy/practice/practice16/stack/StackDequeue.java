package by.it_academy.practice.practice16.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDequeue {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");
        System.out.println("Stack: " + stack);

        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);
//
        String poppedElement1 = stack.pop();
        System.out.println("Popped element1: " + poppedElement1);

        String poppedElement2 = stack.pop();
        System.out.println("Popped element2: " + poppedElement2);
//
        System.out.println("Stack after pops: " + stack);
//
        boolean isEmpty = stack.isEmpty();
        System.out.println("Empty stack: " + isEmpty);


    }


}
