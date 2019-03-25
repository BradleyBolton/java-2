package test1;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        bank userAccount = new bank(scan);
        System.out.println(userAccount.toString());
        System.out.println("Generating second account as default");
        bank defaultAccount = new bank(scan);
        System.out.println(defaultAccount.toString());
        double deposit;
        if(userAccount.getBalance() <= 0)
        {
            System.out.println("User generated account has a balance of zero. Please make a deposit.");
            while (true) {
                System.out.println("Please indicate deposit amount. An account balance below the minimum will be subject to fees.");
                deposit = scan.nextDouble();
                if (deposit > 0) {
                    break;
                }
                System.err.println("Invalid deposit amount. Must be positive");
            }
            userAccount.deposit(deposit);
        }
        System.out.println(userAccount.toString());
        if(defaultAccount.getBalance() <= 0)
        {
            System.out.println("Default generated account has a balance of zero. Please make a deposit.");
            while (true) {
                System.out.println("Please indicate deposit amount. An account balance below the minimum will be subject to fees.");
                deposit = scan.nextDouble();
                if (deposit > 0) {
                    break;
                }
                    System.err.println("Invalid deposit amount. Must be positive");
            }
            defaultAccount.deposit(deposit);
        }
        System.out.println(defaultAccount.toString());
        System.out.println("Running transfer procedure...");
        userAccount.transfer(defaultAccount, scan);
        System.out.println("Charging applicable fees");
        userAccount.fee();
        defaultAccount.fee();
        System.out.println(userAccount.toString());
        System.out.println(defaultAccount.toString());
    }
}
