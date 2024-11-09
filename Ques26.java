import java.util.Scanner;

class Queue {
    private int maxSize;
    private int front, rear;
    private int[] queue;

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }

    // Enqueue method to add an element to the queue
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
        } else {
            if (front == -1) {  // If the queue is empty
                front = 0;
            }
            queue[++rear] = value;
            System.out.println(value + " enqueued to queue.");
        }
    }

    // Dequeue method to remove an element from the queue
    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! No elements to dequeue.");
            return -1;
        } else {
            int dequeuedValue = queue[front++];
            if (front > rear) {  // Reset the queue when it becomes empty
                front = rear = -1;
            }
            return dequeuedValue;
        }
    }

    // Peek method to view the front element of the queue
    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queue[front];
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // Display all elements in the queue
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}

public class Ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a queue with a size of 5
        Queue queue = new Queue(5);

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if Queue is Empty");
            System.out.println("6. Check if Queue is Full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter the value to enqueue: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println(dequeued + " dequeued from queue.");
                    }
                    break;
                case 3:
                    int frontValue = queue.peek();
                    if (frontValue != -1) {
                        System.out.println("Front element is: " + frontValue);
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 6:
                    if (queue.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
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
