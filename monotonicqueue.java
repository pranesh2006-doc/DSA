import java.util.*;
public class monotonicqueue {
    Deque<Integer> deque = new ArrayDeque<>();

    void add(int value){
        while(!deque.isEmpty() && deque.peekLast()<value){
            deque.pollLast();
        }
        deque.offerLast(value);
    }
    void display(){
        System.out.println(deque);
    }
    public static void main(String[] args){
     monotonicqueue mq = new monotonicqueue();
     Scanner sc = new Scanner(System.in);
    }
    
}
