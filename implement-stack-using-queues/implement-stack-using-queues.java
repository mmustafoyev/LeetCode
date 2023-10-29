class MyStack {
    private LinkedList<Integer> inStack;
    public MyStack() {
        inStack = new LinkedList<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        return inStack.pop();
    }

    public int top() {
        return inStack.get(0);
    }

    public boolean empty() {
        return inStack.isEmpty();
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