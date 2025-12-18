class myQueue {
    int f;
    int r;
    int capacity;
    int size;
    int[] arr;
    

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr=new int[n];
        capacity=n;
        size=0;
        f=-1;
        r=-1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==capacity;
    }

    public void enqueue(int x) {
        if (isFull()){
            return ;
        }
        // Enqueue
        if (f==-1){
            f=r=0;
        }else{
            r++;
        }
        arr[r]=x;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if (isEmpty()){
            return ;
        }
        f=f+1;
        size--;
        
        if (size==0){
            f=-1;
            r=-1;
        }
    }

    public int getFront() {
        // Get front element
        if (isEmpty()){
            return -1;
        }
        return arr[f];
    }

    public int getRear() {
        // Get last element
        if (isEmpty()){
            return -1;
        }
        return arr[r];
    }
}
