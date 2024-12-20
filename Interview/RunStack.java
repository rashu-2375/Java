public class RunStack {
    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a stack object

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek(); 
        stack.pop(); // Remove top element
        stack.pop();
        stack.peek(); // Show top element

        stack.pop(); // Remove last element
        stack.pop(); // Attempt to pop from empty stack

        System.out.println("Is Stack Empty? " + stack.isEmpty());
        System.out.println("Is Stack Full? " + stack.isFull());
    }
}
