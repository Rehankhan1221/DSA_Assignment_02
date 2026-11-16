
public class Question_03{

    int arr[];
    int front;
    int rear;
    int size;


    Question_03(int size) {
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

        System.out.println(data + " inserted into Queue.");
    }
    public void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow!");
            return;
        }

        System.out.println(arr[front] + " removed from Queue.");

        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }
    public void showFront() {

        if (front == -1) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Front Element: " + arr[front]);
    }
    public void display() {

        if (front == -1) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Queue Elements:");

        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {

        Question_03 q = new Question_03(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.showFront();

        q.dequeue();

        q.display();
    }
}
