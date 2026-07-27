package ui;

import java.util.Scanner;

import datastructures.ActivityStack;
import datastructures.AlertQueue;
import model.Activity;
import model.Alert;

public class Member2Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ActivityStack stack = new ActivityStack();

        AlertQueue queue = new AlertQueue();

        int choice;

        do {

            System.out.println("\n====== ACTIVITY & ALERT MODULE ======");

            System.out.println("1. Record Activity");
            System.out.println("2. Undo Last Activity");
            System.out.println("3. View Activity History");
            System.out.println("4. Add Alert");
            System.out.println("5. Process Alert");
            System.out.println("6. View Pending Alerts");
            System.out.println("0. Exit");

            System.out.print("Choice : ");

            choice = input.nextInt();

            input.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter Activity : ");

                String activity = input.nextLine();

                stack.push(new Activity(activity));

                break;

            case 2:

                stack.pop();

                break;

            case 3:

                stack.display();

                break;

            case 4:

                System.out.print("Enter Alert : ");

                String alert = input.nextLine();

                queue.enqueue(new Alert(alert));

                break;

            case 5:

                queue.dequeue();

                break;

            case 6:

                queue.display();

                break;

            case 0:

                System.out.println("Program Ended.");

                break;

            default:

                System.out.println("Invalid Choice.");

            }

        } while (choice != 0);

        input.close();
    }
}
