
public class Question_01 {

    int arr[];
    int top;
    int size;

    // Constructor
    Question_01(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push: Insert an element
    public void push(int data) {

        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        top++;
        arr[top] = data;

        System.out.println(data + " inserted into Stack.");
    }

    // Pop: Remove the top element
    public void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println(arr[top] + " removed from Stack.");

        top--;
    }

    // Peek: Display the top element
    public void peek() {

        if (top == -1) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println("Top Element: " + arr[top]);
    }

    // Display: Show all elements
    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Question_01 s = new Question_01(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();

        s.peek();

        s.pop();

        s.display();
    }
}
