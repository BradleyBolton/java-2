package test1;
import java.util.*;

public class bank
{
    private static int acctNum;
    private String name;
    private double balance;
    private String acctType;
    private static double MIN = 200.00;
    public bank(String nam, String type)
    {
        acctNum++;
        name = nam;
        acctType = type;
        balance = 0;
    }
    public bank(Scanner scan)
    {
        acctNum++;
        setName(scan);
        setAcctType(scan);
        balance = 0;
    }
    public void setName (Scanner scan)
    {
        System.out.println("Please input name");
        name = scan.nextLine();
    }
    public void setAcctType(Scanner scan)
    {
        while (true)
        {
            System.out.println("Please input account type. [checking or savings]");
            String type = scan.nextLine();
            if (type.equals("checking") || type.equals("savings"))
            {
                acctType = type;
                break;
            }
            else
            {
                System.err.println("Error, invalid account type. Do not capitalize your input.");
            }
        }
    }
    public void setBalance(Scanner scan)
    {
        while (true)
        {
            System.out.println("Please record balance. An account balance below the minimum will be subject to fees.");
            double bal = scan.nextDouble();
            if (bal > 0)
            {
                balance = bal;
                break;
            }
            else
            {
                System.err.println("Invalid deposit amount. Must be positive");
            }
        }
    }
    public String getName()
    {
        return name;
    }
    public String getAcctType()
    {
        return acctType;
    }
    public double getBalance()
    {
        return Math.round(balance * 100) / 100;
    }
    public String toString()
    {
        return "This bank account belongs to "+name+". It is a "+acctType+" account. It has a balance of "+balance+" dollars. The account number is "+acctNum;
    }
    public boolean equals(Object object)
    {
        if (object instanceof bank)
        {
            bank bank2 = (bank) object;
            return (toString().equals(bank2.toString()));
        }
        else
        {
            System.err.println("Object must be of bank class.\n");
            return false;
        }
    }
    public void withdraw(double draw)
    {
        if (balance >= draw && draw > 0)
        {
            balance -= draw;
            balance = Math.round(balance * 100) / 100;
        }
        else if(draw <= 0)
        {
            System.err.println("Error- Please input the withdrawal amount as a positive value. Deposits are made with deposit(double deposit). Account balance unchanged.");
        }
        else
        {
            System.err.println("Error- Insufficient funds to make this withdrawal. Account balance unchanged.");
        }
        fee();
    }
    public void deposit(double deposit)
    {
        if (deposit > 0)
        {
            balance += deposit;
            balance = Math.round(balance * 100) / 100;
        }
        else
        {
            System.err.println("Deposit amount must be positive. Withdrawals are made with withdraw(double withdrawal). Account balance unchanged.");
        }
    }
    public void transfer(Object object, Scanner scan)
    {
        double transferAmount;
        while (true)
        {
            System.out.println("Please input amount to be transferred.");
            transferAmount = scan.nextDouble();
            if (transferAmount > 0)
            {
                break;
            }
            else
            {
                System.err.println("Invalid transfer amount. Must be positive");
            }
        }
        if (object instanceof bank)
        {
            bank account2 = (bank) object;
            if (account2.getName().equals(name))
            {
                if (balance > transferAmount)
                {
                    withdraw(transferAmount);
                    account2.deposit(transferAmount);
                    System.out.println("Transfer successful.");
                }
                else
                {
                    System.err.println("Invalid funds to make transfer. Account balances unchanged.");
                }
            }
            else
            {
                System.err.println("Transfers may only be made between accounts under the same name. Account balances unchanged.");
            }
        }
        fee();
    }
    public void fee()
    {
        if (balance < MIN)
        {
            withdraw(balance*.1);
            System.out.println("Fee charged to "+name+"'s "+acctType+" account. Balance is now "+balance);
        }
        else
        {
            System.out.println("Balance above minimum, no fee charged.");
        }
    }
}
