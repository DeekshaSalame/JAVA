import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stack;

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push method to add elements to the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        } else {
            System.out.println("Stack Overflow! Cannot push " + value);
        }
    }

    // Pop method to remove elements from the stack
    public int pop() {
        if (top >= 0) {
            int poppedValue = stack[top--];
            return poppedValue;
        } else {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
    }

    // Peek method to view the top element
    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Display all elements in the stack
    public void display() {
        if (top >= 0) {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

public class Ques25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a stack of size 5
        Stack stack = new Stack(5);

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Stack is Empty");
            System.out.println("6. Check if Stack is Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println(popped + " popped from stack.");
                    }
                    break;
                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1) {
                        System.out.println("Top element is: " + topValue);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 6:
                    if (stack.isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
