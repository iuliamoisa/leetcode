class MinStack {

Stack<Integer> values;
Stack<Integer> mins;
    public MinStack() {
        values = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        if(values.empty()){
            values.push(val);
            mins.push(val);
            return;
        }
        if(val <= mins.peek()){
            mins.push(val);
        } else{
            mins.push(mins.peek());
        }
        values.push(val);        
    }
    
    public void pop() {
            mins.pop();
        values.pop();
    }
    
    public int top() {
        return values.peek();
    }
    
    public int getMin() {
        return mins.peek();

        // O(n) solution:
        // Integer min = values.peek();
        // for(Integer val : values){
        //     if(val < min) min = val;
        // }
        // return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
