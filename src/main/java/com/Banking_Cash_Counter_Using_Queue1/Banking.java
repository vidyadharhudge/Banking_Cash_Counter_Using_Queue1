package com.Banking_Cash_Counter_Using_Queue1;

public class Banking implements bank
{
    public int depoisiteCash(int cash, int Balance)
    {
        Balance += cash;
        return Balance;
    }

    public int WithdrawlCash(int cash, int Balance)
    {
        if (Balance <= 0)
        {
            System.out.println("Cash is not avalibale");
            return 0;
        }
        else
        {
            Balance -= cash;
            return Balance;

        }
    }
}
