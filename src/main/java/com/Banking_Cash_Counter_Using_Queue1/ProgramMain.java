package com.Banking_Cash_Counter_Using_Queue1;

import java.util.Scanner;

public class ProgramMain
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of People In Queue");
        int Total_No_Of_People_IN_Queue=sc.nextInt();
        Queue list=new Queue(Total_No_Of_People_IN_Queue);
        int count=0;
        Banking bank= new Banking();
        do
        {
            int userBalance=5000;
            int Balance=userBalance;
            int totalBalanceOfUser=0;
            System.out.println("Enter The Cash");
            int cash=sc.nextInt();
            System.out.println("press 1 for depoisite and 2 for withdraw");
            int userChoise=sc.nextInt();
            switch (userChoise)
            {
                case 1 :
                    totalBalanceOfUser=bank.depoisiteCash(cash,Balance);
                    list.enque(totalBalanceOfUser);
                    System.out.println("Avaliable Balance is :"+totalBalanceOfUser);
                    list.dequeue();
                    cash=0;
                    break;
                case 2 :
                    if (userBalance<cash)
                    {
                        System.out.println("Cash Is Not Sufficent");
                    }
                    else
                    {
                        totalBalanceOfUser=bank.WithdrawlCash(cash,Balance);
                        list.enque(totalBalanceOfUser);
                        System.out.println("Avaliable Balance is :"+totalBalanceOfUser);
                        list.dequeue();
                        cash=0;

                    }
                    break;
            }
            count++;

        }
        while (count<Total_No_Of_People_IN_Queue);
        list.display();


    }
}
