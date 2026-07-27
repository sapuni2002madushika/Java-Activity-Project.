package datastructures;

import model.Activity;

public class ActivityStack {

    private static final int MAX = 100;

    private Activity[] stack;
    private int top;

    public ActivityStack() {
        stack = new Activity[MAX];
        top = -1;
    }

    public void push(Activity activity) {

        if (top == MAX - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        stack[++top] = activity;

        System.out.println("Activity Recorded.");
    }

    public void pop() {

        if (top == -1) {
            System.out.println("No Activity to Undo.");
            return;
        }

        System.out.println("Undo : " + stack[top]);

        top--;
    }

    public void peek() {

        if (top == -1) {
            System.out.println("Stack Empty.");
            return;
        }

        System.out.println("Last Activity : " + stack[top]);
    }

    public void display() {

        if (top == -1) {
            System.out.println("No Activities.");
            return;
        }

        System.out.println("\nActivity History");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
