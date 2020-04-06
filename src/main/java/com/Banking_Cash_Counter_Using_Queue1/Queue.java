package com.Banking_Cash_Counter_Using_Queue1;

public class Queue
{
    int front, rearer, size;
    int Capacity_OF_queue;
    int[] array;

    ///creating the constructor of class Queue
    // after creating constructor passing the parameter and giving the values
    public Queue(int Capacity_OF_queue)
    {
        this.Capacity_OF_queue = Capacity_OF_queue;
        front = 0;
        rearer = 0;
        size = 0;
        array = new int[this.Capacity_OF_queue];
    }

    //creating methode isfull
    public boolean isFull(Queue queue)
    {
        return (queue.size == queue.Capacity_OF_queue);
    }

    //creating methode isEmpty
    public boolean isEmpty(Queue queue)
    {
        return (queue.size == 0);
    }

    ///enque methode passing the total balance of user
    // first we call the methode is full
    // in else condition store the total balance of user in the array
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


    ///dequeue methode
    // if its empty return 0
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

    //display methode
    public void display()
    {
        while (front != rearer)
        {
            System.out.println(array[front]);
            front += 1;
        }
    }
}
