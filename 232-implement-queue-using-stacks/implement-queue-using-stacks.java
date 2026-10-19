class MyQueue {
      Deque<Integer> stack1;
      Deque<Integer> stack2;

    public MyQueue() {
        stack1=new ArrayDeque<>();
        stack2=new ArrayDeque<>();

    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        movement();
       return  stack2.pop();

    }
    
    public int peek() {
        movement();
        return stack2.peek();
    }
    
    public boolean empty() {
     
     if(stack1.isEmpty() && stack2.isEmpty()){
        return true;
     }
     return false;
        
    }
    public void movement(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */