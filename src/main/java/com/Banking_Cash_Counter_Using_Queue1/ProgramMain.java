package com.Banking_Cash_Counter_Using_Queue1;

import java.util.Scanner;

public class ProgramMain
{

    public static void main(String[] args)
    {
        //user input to entere the no of people in queue
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of People In Queue");
        int Total_No_Of_People_IN_Queue=sc.nextInt();
        //creating a object ie list
        Queue list=new Queue(Total_No_Of_People_IN_Queue);
        int count=0;
        //to creating a new object ie bank
        Banking bank= new Banking();
        do
        {
            int userBalance=5000;
            int Balance=userBalance;
            int totalBalanceOfUser=0;
            //user input to enter the cash
            System.out.println("Enter The Cash");
            int cash=sc.nextInt();
            //user input given option to withdrawl or depoisite
            System.out.println("press 1 for depoisite and 2 for withdraw");
            int userChoise=sc.nextInt();
            //switch case for user choise
            switch (userChoise)
            {
                case 1 :
                    totalBalanceOfUser=bank.depoisiteCash(cash,Balance);
                    //to call the enque methode
                    list.enque(totalBalanceOfUser);
                    //to display the avalibale balance after depoisite
                    System.out.println("Avaliable Balance is :"+totalBalanceOfUser);
                    //to call the dequeue methode
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
                        //to call the enque methode
                        list.enque(totalBalanceOfUser);
                        //to display the avalibale balance after with drawing the cash
                        System.out.println("Avaliable Balance is :"+totalBalanceOfUser);
                        //to call the dequeue methode
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
