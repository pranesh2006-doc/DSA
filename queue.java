import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    public static void main(String[] args){
        Queue<Integer> queue=new ArrayDeque<>();

        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        System.out.println("Queue: "+queue);
        System.out.println("Front element: "+queue.peek());
        System.out.println("Removed element: "+queue.poll());
        System.out.println("Queue after the poll operation: "+queue);
       
        
    }
}
