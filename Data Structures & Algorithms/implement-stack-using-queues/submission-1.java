class MyStack {
    Queue<Integer> q1,q2;
    int val;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        val=0;
    }
    
    public void push(int x) {
        q1.offer(x);
        val=x;
    }
    
    public int pop() {
        if(q1.isEmpty())
        return -1;

        while(q1.size()>1){
            q2.offer(q1.poll());
        }
        int popped=q1.poll();
        while(!q2.isEmpty()){
            val=q2.poll();
            q1.offer(val);
        }
        return popped;

    }
    
    public int top() {
        return q1.isEmpty()?-1:val;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */