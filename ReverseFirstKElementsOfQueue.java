class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<k;i++){
            st.add(q.peek());
            q.remove();
        }
        
        for(int i=0;i<k;i++){
            q.add(st.peek());
            st.pop();
        }
        
        
        int n=q.size();
        for(int i=0;i<n-k;i++){
            int num=q.remove();
            q.add(num);
        }
        return q;
    }
}




//DONE BY MYSELF
import java.util.*;
class HelloWorld {
    public static void printt(Queue<Integer> q){
        while(!q.isEmpty()){
            int x=q.peek();
            System.out.print(x+" ");
            q.remove();
        }
    }
    public static void kreversal(Queue<Integer> q,int k){
        Stack<Integer> st=new Stack<Integer>();   
        for(int i=0;i<k;i++){
            st.push(q.peek());
            q.remove();
        }
        for(int i=0;i<k;i++){
            q.add(st.peek());
            st.pop();
        }
        int n=5;
        for(int i=0;i<n-k;i++){
            int x=q.peek();
            q.remove();
            q.add(x);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        kreversal(q,3);
        printt(q);
    }
}
