class MinStack {
    Stack<Integer>st  ;

    Stack<Integer> minStack;
    public MinStack() {
        st=new Stack<>();
        minStack=new Stack<>();

    }
    
    public void push(int value) {
        st.push(value);

        if(minStack.isEmpty() || value <= minStack.peek())
             minStack.push(value);
    }
    
    public void pop() {
        int x=st.pop();

        if(x==minStack.peek())
        minStack.pop();
    }
    
    public int top() {
       return  st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 /**
 ⚙️ Approach
Use two stacks:

stack → stores all elements
minStack → stores the minimum value till that point
💡 Key Idea:
While pushing:

Push the value into stack
Push the minimum of (current value, previous minimum) into minStack
While popping:

Pop from both stacks
Minimum element:

Always at the top of minStack
  */