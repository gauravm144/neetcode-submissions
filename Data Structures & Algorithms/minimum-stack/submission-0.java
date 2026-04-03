class MinStack {
    Stack<Integer> elem=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(elem.isEmpty()){
            elem.push(val);
            min.push(val);
        }
        else{
            elem.push(val);
            min.push(Math.min(min.peek(),val));
        }
    }
    
    public void pop() {
        elem.pop();
        min.pop();
    }
    
    public int top() {
        return elem.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
