import java.util.*;

class Stack 
{
    int size;
    int top;
    int stackArray[];

    Stack(int s) 
    {
        size = s;
        stackArray = new int[size];
        top = -1;
    }

    void push(int val) 
    {
        if (isFull()) 
        {
            System.out.println("Stack is full. Cannot push " + val);
        } 
        else 
        {
            stackArray[++top] = val;
            System.out.println("Pushed " + val + " onto the stack");
        }
    }

    int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        } 
        else 
        {
            int val = stackArray[top--];
            System.out.println("Popped " + val + " from the stack");
            return val;
        }
    }

    int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        } 
        else 
        {
            return stackArray[top];
        }
    }

    boolean isEmpty() 
    {
        return (top == -1);
    }

    boolean isFull() 
    {
        return (top == size - 1);
    }

    void display() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty.");
        } else 
        {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) 
            {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        
        Stack stack = new Stack(size);

        while(true) 
        {
            System.out.println("\nOptions:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter a number to push onto the stack: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) 
                    {
                        System.out.println("Top element: " + peekValue);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}