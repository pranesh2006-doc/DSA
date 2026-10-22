import java.util.*;
public class monotonicqueue {
    Deque<Integer> deque = new ArrayDeque<>();

    void add(int value){
        while(!deque.isEmpty() && deque.peekLast()<value){
            deque.pollLast();
        }
        deque.offerLast(value);
    }
    
    public static void main(String[] args){
     
    }
    
}
