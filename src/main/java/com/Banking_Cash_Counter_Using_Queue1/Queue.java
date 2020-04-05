package com.Banking_Cash_Counter_Using_Queue1;

public class Queue
{
    int front, rearer, size;
    int Capacity_OF_queue;
    int[] array;

    public Queue(int Capacity_OF_queue)
    {
        this.Capacity_OF_queue = Capacity_OF_queue;
        front = 0;
        rearer = 0;
        size = 0;
        array = new int[this.Capacity_OF_queue];
    }

    public boolean isFull(Queue queue)
    {
        return (queue.size == queue.Capacity_OF_queue);
    }

    public boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }


    public void enque(int totalBalanceOfUser)
    {
        if (isFull(this))
        {
            return;
        }
        else
        {
            array[this.rearer] = totalBalanceOfUser;
            this.rearer = this.rearer + 1;
            this.size = size + 1;
        }
    }


    public int dequeue()
    {
        if (isEmpty(this))
        {
            return 0;
        }
        else
        {
            int totalBalanceOfUser = this.array[this.front];
            this.front = this.front + 1;
            this.size = size - 1;
            return totalBalanceOfUser;
        }
    }

    public void display()
    {
        while (front != rearer)
        {
            System.out.println(array[front]);
            front += 1;
        }
    }
}
