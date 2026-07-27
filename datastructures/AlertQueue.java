package datastructures;

import model.Alert;

public class AlertQueue {

    private static final int MAX = 100;

    private Alert[] queue;

    private int front;
    private int rear;

    public AlertQueue() {

        queue = new Alert[MAX];

        front = 0;
        rear = -1;
    }

    public void enqueue(Alert alert) {

        if (rear == MAX - 1) {
            System.out.println("Queue Full.");
            return;
        }

        queue[++rear] = alert;

        System.out.println("Alert Added.");
    }

    public void dequeue() {

        if (front > rear) {

            System.out.println("No Alerts.");

            return;
        }

        System.out.println("Processing : " + queue[front]);

        front++;
    }

    public void display() {

        if (front > rear) {

            System.out.println("Queue Empty.");

            return;
        }

        System.out.println("\nPending Alerts");

        for (int i = front; i <= rear; i++) {

            System.out.println(queue[i]);

        }

    }
}
