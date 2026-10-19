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
    
    
    
}
