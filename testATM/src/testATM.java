/* Design a class named Account that contains:
  A private int Data field named id for the account(default 0)
  A private double data field named balance for the account(default 0)
  A private double data field named annualInterestRate  that stores the current interest rate (default 0). Assume
  that all accounts have the same interest rate.
  A private Date data field named dateCreated that stores the date when the account was created.
  A no-arg constructor that creates a default account.
  A constructor that creates an account with the specified id and initial balance.
  The accessor and mutator methods for id, balance, and annualInterestRate.
  The accessor method for dateCreated.
  A method named getMonthlyInterestRate() that returns the monthly interest rate.
  A method named getMonthlyInterest() that returns the monthly interest mot the interest rate.
  A method named withdraw that withdraws a specified amount from the account.
  A method named deposit that deposits a specified amount to the account.
 */
import java.util.Scanner;

public class testATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create 10 accounts in an array 0,1,,,9 and initial balance $100
        Account[] accountsArray = new Account[10];
        for (int i = 0; i < accountsArray.length; i++)
            accountsArray[i] = new Account(i, 100);


        boolean ATM = true;
        do {
            System.out.println(" *****************************************");
            //prompt the user to enter an ID
            System.out.print("Enter your ID: ");
            int id = input.nextInt();
            checkId(id);// check if the ID is valid using the method CheckID
            System.out.println("WELCOME!");
            int option = 0;
            while (option != 4) {//repeat for a user until logging out from ATM
                menu();
                System.out.print("Choose 1-4: ");
                option = input.nextInt();
                if (option == 4)
                    System.out.print("Logging out....\n");
                id = checkId(id);
                transaction(id, option, accountsArray);
            }
            System.out.print(" *****************************************");
        } while (ATM != false);
    }
    public static int checkId(int usersId){
        Scanner input = new Scanner(System.in);

        while (usersId < 1 || usersId > 10) {
            System.out.print("Please enter a valid id: ");
            usersId = input.nextInt();
            System.out.println();
        }
        return usersId;
    }
    public static void menu(){
        System.out.printf("%n MAIN MENU: %n ");
        System.out.println("1: Check Balance");
        System.out.println("2: Withdraw ");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
    }

    public  static void transaction(int id, int option, Account[] account){
        Scanner input = new Scanner(System.in);
        switch(option){
            case 1:
                System.out.printf("The balance is $%.1f%n", account[id - 1].getBalance());
                break;
            case 2:
                System.out.print("Enter an amount to withdraw: ");
                account[id - 1].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter an amount to deposit: ");
                account[id - 1].deposit(input.nextDouble());
                break;
            case 4:
                id = checkId(id);
            default:
                break;
        }
    }





    }
