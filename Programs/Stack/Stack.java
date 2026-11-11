package Programs.Stack;

public class Stack {

    int size = 5;
    int arr[] = new int[size];

    int top = -1;

    // Insert element
    void push(int data) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = data;

        System.out.println(data + " inserted");
    }

    // Delete element
    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println(arr[top] + " deleted");

        top--;
    }

    //  View top element
    void peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    // DISPLAY
    void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();

        s.push(60);  // Overflow

        s.peek();

        s.pop();
        s.pop();

        s.display();

        s.peek();

        s.pop();
        s.pop();
        s.pop();

        s.pop();     // Underflow

        s.display();
    }
}