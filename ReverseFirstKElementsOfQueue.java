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
