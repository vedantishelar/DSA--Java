// Stack using array

import java.util.*;

class StackArray {
    int[] arr;
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println("Pushed: " + value);
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int n = in.nextInt();

        StackArray stack = new StackArray(n);

        while (true) {
            System.out.println("\n1.Push  2.Pop  3.Peek  4.Display  5.Exit");
            System.out.print("Enter choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int x = in.nextInt();
                    stack.push(x);
                    break;

                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    break;

                case 3:
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println("Top element: " + top);
                    }
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
