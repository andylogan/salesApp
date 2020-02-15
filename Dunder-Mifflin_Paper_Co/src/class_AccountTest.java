import java.util.Scanner;

/**
 * @author Riley Logan
 * IT251-2001A-01
 * Intermediate Java Programming I
 * Prof. Anthony Lowe
 */
public class class_AccountTest {

    public static void main(String[] args) {
    // initialize variables
        String accountId;
        String accountStatus;
        String accountCreateDate;
        double poundsSold;
        double poundPrice;
        double officeSuppliesSales;
        double bookSales;
        double apparelSales;
        double hours;
        double hourlyRate;
        Scanner in = new Scanner(System.in);
    // common account information acquisitionn
        System.out.printf("%s%s%n","Welcome user!","Enter the ID of the account"
                + "with which you would like to work today.");
        accountId = in.nextLine();
        System.out.printf("%s%n","What is the status of this account?");
        accountStatus = in.nextLine();
        System.out.printf("%s%n","When was the account created?");
        accountCreateDate = in.nextLine();
    // paper
        System.out.printf("%s%n","Paper sales.");
        System.out.printf("%s%n","How many pounds of paper were sold this year?");
        poundsSold = in.nextDouble();
        System.out.printf("%s%n","What is the cost of a pound?");
        poundPrice = in.nextDouble();
    // supplies
        System.out.printf("%s%n","Supply sales.");
        System.out.printf("%s%n","How much in office supplies?");
        officeSuppliesSales = in.nextDouble();
        System.out.printf("%s%n","How much in books?");
        bookSales = in.nextDouble();
        System.out.printf("%s%n","How much in apparel?");
        apparelSales = in.nextDouble();
    // services
        System.out.printf("%s%n","Services sales.");
        System.out.printf("%s%n","How many hours of service were provided?");
        hours = in.nextDouble();
        System.out.printf("%s%n","What was the hourly rate for these services?");
        hourlyRate = in.nextDouble();
    // create objects    
        Paper paperAccount = new Paper(accountId,accountStatus,accountCreateDate,
            poundsSold,poundPrice);
        Supplies suppliesAccount = new Supplies(accountId,accountStatus,accountCreateDate,
            officeSuppliesSales,bookSales,apparelSales);
        Services servicesAccount = new Services(accountId,accountStatus,accountCreateDate,
            hours,hourlyRate);
    // polymorphically processed accounts header
        System.out.printf("%n%n"); // double line break
        System.out.println("> > Accounts processed polymorphically.");
        System.out.println("");
    // create 3-element array
        Account[] accounts = new Account[3];
    // initialize array with accounts
        accounts[0] = paperAccount;
        accounts[1] = suppliesAccount;
        accounts[2] = servicesAccount;
        
        double ytdsales = 0;
        for (Account currentAccount : accounts){ // processes each array element
            System.out.println(currentAccount); // invokes toString
            ytdsales += currentAccount.calcSales();
            System.out.printf("Sold $%,.2f%n%n", currentAccount.calcSales()
            );
        }
        System.out.printf("Dunder Mifflin Paper Company made $%,.2f%s%n%n",
                ytdsales," in sales YTD.");
        System.out.print("Goodbye");
    } // end main
} // end class AccountTest

