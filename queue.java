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
