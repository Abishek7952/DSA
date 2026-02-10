class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        int size = q.size(); // Get current number of elements
        q.add(x);            // Add the new element to the back
        
        // Rotate the queue: move all previous elements behind x
        for (int i = 0; i < size; i++) {
            q.add(q.poll());
        }
    }
    
    public int pop() {
        return q.poll(); // Now the last pushed element is at the front
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
