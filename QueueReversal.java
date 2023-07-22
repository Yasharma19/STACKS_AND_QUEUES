class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();  //Using a stack

      //First,transfer all elements from queue to stack
        while (!q.isEmpty()) {
            stack.add(q.peek());
            q.remove();
        }

      //Now, transfer all Elements from stack to queue
        while (!stack.isEmpty()) {
            q.add(stack.peek());
            stack.pop();
        }
        return q;
    }
}
