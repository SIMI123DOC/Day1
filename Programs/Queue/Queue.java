package Programs.Queue;

public class Queue {

    int size = 5;
    int arr[] = new int[size];

    int front = -1;
    int rear = -1;

    //  Insert element
    void enqueue(int data) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;

        System.out.println(data + " inserted");
    }

    // Delete element
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(arr[front] + " deleted");

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    // View first element
    void peek() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front element: " + arr[front]);
    }

    // DISPLAY
    void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.enqueue(60);  // Overflow

        q.peek();

        q.dequeue();
        q.dequeue();

        q.display();

        q.peek();

        q.dequeue();
        q.dequeue();
        q.dequeue();

        q.dequeue();    // Underflow

        q.display();
    }
}