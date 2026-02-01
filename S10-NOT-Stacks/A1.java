import java.util.*;

class Stack {
    int arr[];
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int num) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = num;
        System.out.println("Pushed " + num);
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
}

public class A1 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int select; 
        Stack s = new Stack(5);

        while (true) { 
            System.out.println("1.Push 2.Pop 3.Peek 4.Exit"); 
            select = in.nextInt();

            if (select == 4) {
                break; 
            }

            switch (select) {
                case 1:
                    System.out.println("Enter the element to be pushed:");
                    int num = in.nextInt();
                    s.push(num);
                    break;

                case 2:
                    int popped = s.pop();      
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    break;

                case 3:
                    System.out.println("Peek element: " + s.peek());
                    break;

                default:
                    System.out.println("Invalid Choice!!!");
            }
        }
    }
}
