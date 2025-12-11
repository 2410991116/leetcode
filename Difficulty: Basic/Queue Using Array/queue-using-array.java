class myQueue {
    int f,r,capacity,size;
    int[] arr;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr=new int[n];
        f=0;
        r=-1;
        capacity=n;
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
        // Enqueue
        if (!isFull()){
            r++;
            arr[r]=x;
            size++;
        }
    }

    public void dequeue() {
        // Dequeue
        if (!isEmpty()){
            f++;
            size--;
        }
        
        if (size == 0) {
            f = 0;
            r = -1;
        }
    }

    public int getFront() {
        // Get front element
        if (!isEmpty()){
            return arr[f];
        }
        return -1;
    }

    public int getRear() {
        // Get last element
        if (!isEmpty()){
            return arr[r];
        }
        return -1;
    }
}
