class HelloWorld{
    
    public MyStack() {
        Queue<Integer> queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        //Transfering fromFront to End
        for(int i = 1; i < queue.size(); i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }
    
    public int pop() {
        return queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
