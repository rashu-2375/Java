public class Stack{
    private int[] stack;
    private int top;
    private int size;

    // constructor to initialize the stack
    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;  // Stack is initially empty

    }
     
    // handle full stack conditions
    public boolean isFull(){
        return top == size - 1;
    }

    // handle empty condition
    public boolean isEmpty(){
        return top == -1;
    }

// implement push method
public void push(int value){
    if (isFull()){
        System.out.println("Stack is full! cannot push" + value);   
    }else{
        top = top + 1;
        stack[top] = value;
        System.out.println("Pushed" + value + " to the stack");


    }
}

// implenting Pop method
public int pop(){
    if (isEmpty()){
        System.out.println("Stack is empty! Cannot pop.");
        return -1; 
    }else{
        int value = stack[top];
        top = top - 1;
        System.out.println("Popped " + value + " from the stack.");
        return value;
        
    }
}

// implement peek method
public int peek(){
    if (isEmpty()){
        System.out.println("Stack is empty! Nothing to peek.");
        return -1;
    }else{
        return stack[top];
    }
}

// display the current elements of the stack
public void display(){
    if (isEmpty()){
        System.out.println("Stack is empty.");
    }else{
        System.out.print("Current stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args){
    Stack mystack = new Stack(10);
    mystack.push(5);  // Pushing elements
    mystack.push(10);
    mystack.push(15);
    mystack.display(); // Display the stack
        
    mystack.peek();    // Peeking the top element
    mystack.pop();     // Popping the top element
    mystack.display(); // Display the stack after popping

    mystack.peek();    // Peeking the top element again
    }
}

