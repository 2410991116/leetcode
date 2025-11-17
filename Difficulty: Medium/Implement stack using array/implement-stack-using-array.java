class myStack {
    int arr[];
    int top;
    int capacity;
    
    public myStack(int n) {
        arr=new int[n];
        capacity=n;
        top=-1;
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==capacity-1;
    }

    public void push(int x) {
        if (!isFull()){
            arr[++top]=x;
        }
    }

    public void pop() {
        if (!isEmpty()){
            top--;
        }
    }

    public int peek() {
        if (!isEmpty()){
            return arr[top];
        }
        return -1;
    }
}