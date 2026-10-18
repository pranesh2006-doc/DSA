import java.util.ArrayDeque;
import java.util.Deque;
public class stack {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after the pop operation: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
    
}
