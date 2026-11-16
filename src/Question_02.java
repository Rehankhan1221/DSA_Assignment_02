
public class Question_02 {

    int arr[];
    int top;
    int size;


    Question_02(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }
    public void push(int data) {

        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }

        top++;
        arr[top] = data;

        System.out.println("Push(" + data + ")");
        display();
    }
    public void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }

        System.out.println("Pop(): " + arr[top] + " removed");

        top--;
        display();
    }
    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack (Bottom to Top): ");

        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Question_02 s = new Question_02(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();

        s.push(40);

        s.pop();

        System.out.println("\nFinal Stack:");
        s.display();

        System.out.println("Top Element: " + s.arr[s.top]);
    }
}
