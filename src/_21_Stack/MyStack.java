import java.util.Scanner;

// Array Implementation
class MyStack {

    int stack[];
    int top;
    int size;

    public MyStack(int stackSize) {
        stack = new int[stackSize];
        size = stackSize;
        top = -1;
    }

    public void push(int element) {
        if (top >= size - 1) {
            System.out.println("Stack is Full");
            return;
        }
        top++;
        stack[top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int val = stack[top];
        top--;
        return val;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i != top) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = sc.nextInt();

        MyStack myStack = new MyStack(n);

        System.out.println("Is Empty: " + myStack.isEmpty());

        myStack.push(9);
        myStack.printStack();

        myStack.push(11);
        myStack.printStack();

        myStack.push(13);
        myStack.printStack();

        myStack.push(15);
        myStack.printStack();

        myStack.pop();
        myStack.printStack();

        System.out.println("Size: " + myStack.size());
        System.out.println("Is Empty: " + myStack.isEmpty());

        myStack.pop();
        myStack.printStack();

        System.out.println("Peek: " + myStack.peek());

        sc.close();
    }
}