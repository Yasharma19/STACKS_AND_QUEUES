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



//OVERALL CODE WRITTEN BY ME IS 
import java.util.*;

class HelloWorld {
    
    public static void printt(Queue<Integer> q){
        while(!q.isEmpty()){
            int x=q.peek();
            System.out.print(x+" ");
            q.remove();
        }
    }
    
    public static void reversal(Queue<Integer> q){
        Stack<Integer> st=new Stack<Integer>();
        while(!q.isEmpty()){
            st.push(q.peek());
            q.remove();
        }    
        while(!st.isEmpty()){
            q.add(st.peek());
            st.pop();
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reversal(q);
        printt(q);
    }
}
