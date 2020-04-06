package com.Banking_Cash_Counter_Using_Queue1;

///implemanting the Banking class into the bank
public class Banking implements bank
{
    ///user deposit cash
    // How much money  added by user it get depoisted to user balance
    public int depoisiteCash(int cash, int Balance)
    {
        Balance += cash;
        return Balance;
    }

    ///user withdraw cash methode
    // if balance lesss than o it show insufficent balance
    //  how much cash it withdrawl it remove from balance
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
