package com.klebermagno.code.cap3;


class QueueArray {
    int front, rear, size;
    int capacity;
    int array[];

    public QueueArray(int capacity)
    {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(QueueArray queue)
    {
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(QueueArray queue)
    {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item)
    {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item
                + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
    void show(){
        for (int i=0 ; i<capacity;i++) {
            System.out.print(this.array[i]
            + ", ");

        }
        System.out.println(  "\nqueue.front: "+ front  );
        System.out.println(  "queue.rear: "+ rear  );
        System.out.println(  "queue.size: "+ size  );
    }
}

// Driver class
 class Test {
    public static void main(String[] args)
    {
        QueueArray queue = new QueueArray(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()
                + " dequeued from queue\n");

        queue.show();
        System.out.println("\n Front item is "
                + queue.front());

        System.out.println("\n Rear item is "
                + queue.rear());
        queue.enqueue(50);
        System.out.println(queue.dequeue()
                + " dequeued from queue\n");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.show();
        System.out.println("\n Rear item is "
                + queue.rear());
        queue.show();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.show();

    }
}