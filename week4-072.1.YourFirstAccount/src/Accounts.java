
import java.util.Scanner;

public class Accounts {

    public static void transfer(Account from, Account to, double howMuch){

        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here

        // Section 72.1

        Account NEW = new Account("New Account", 100);
        NEW.deposit(20);
        System.out.println(NEW);

        /*
        // Section 72.2
        Account Matt = new Account("Matt's account", 1000);
        Account Mine = new Account("My account", 0);

        System.out.println("Matt's account balance is now: " + Matt.balance());
        System.out.println("My account blance is now: " + Mine.balance());

        Matt.withdrawal(100);
        Mine.deposit(100);

        System.out.println("Matt's account balance is now: " + Matt.balance());
        System.out.println("My account blance is now: " + Mine.balance());

        // Section 72.3
        Account A = new Account(" A", 100);
        Account B = new Account( "B", 0);
        Account C = new Account("C", 0);

        transfer(A, B, 50);
        transfer(B, C, 25);
        */

    }

}
