import java.util.*;

public class queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Myqueue queue = new Myqueue();
         
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("1 for push 2 for pop 3 for peek 4 for isEmpty");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    int value=sc.nextInt();
                    queue.push(value);
                    break;
                case 2:
                    System.out.println(queue.pop());
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
                case 4:
                    System.out.println(queue.isEmpty());
                    break;
            }

        }

    }}

     class Myqueue{
        Deque<Integer> stack1=new ArrayDeque<>();
        Deque<Integer> stack2=new ArrayDeque<>();

        public void push(int value){
            stack1.push(value);

        }
        public int pop(){
            ismoveStack1ToStack2();
            return stack2.pop();
        }
        public int peek(){
            ismoveStack1ToStack2();
            return stack2.peek();
        }
        public boolean isEmpty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }
        private void ismoveStack1ToStack2(){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
        }

    }

