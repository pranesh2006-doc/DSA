import java.util.*;
public class stacks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mystack stack = new Mystack();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("1 for push 2 for pop 3 for peek 4 for isEmpty");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    int value=sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    System.out.println(stack.isEmpty());
                    break;
            }
        }
    }
}
class Mystack{
    Queue<Integer> queue1=new ArrayDeque<>();
    Queue<Integer> queue2=new ArrayDeque<>();
    
    public void push(int value){
        queue2.add(value);
        while(!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
    }
    public int pop(){
        return queue1.poll();
    }
    public int peek(){
        return queue1.peek();
    }
    public boolean isEmpty(){
        return queue1.isEmpty();
    }
    
}
