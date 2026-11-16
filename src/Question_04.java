
public class Question_04 {

    int arr[];
    int front;
    int rear;
    int size;

    // Constructor
    Question_04(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = data;

        System.out.println("Enqueue(" + data + ")");
        display();
    }
    public void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }

        System.out.println("Dequeue(): " + arr[front] + " removed");

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }

        display();
    }
    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue (Front to Rear): ");

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Question_04 q = new Question_04(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();

        q.enqueue(40);

        q.dequeue();

        System.out.println("\nFinal Queue:");
        q.display();

        System.out.println("Front Element: " + q.arr[q.front]);
    }
}
