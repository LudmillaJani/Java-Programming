/////////////////////////UML DIAGRAM////////////////////////////////
//-id: int
//-balance: double
//-annualInterestRate: double
//dateCreated: Date
//+Account()
//+Account(newId: int, initialBalance: double)
//+getId(): int
//+setId(id: double)
//+getBalance():double
//+setBalance(balance: double)
//+getAnnualInterestRate(): double
//+setAnnualInterestRate(annualInterestRate: double)
//getDateCreated(): Date
//+getMonthlyInterestRate(): double
//+withdraw(thisAmount: double)
//+deposit(thisAmount: double)
//////////////////////////////////////////////////////////////////////
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //constructors
    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int newId, double initialBalance){
        id = newId;
        balance = initialBalance;
        dateCreated = new Date();
    }

    //the accessor and mutetor methods for id, balance, and annualInterestRate
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    //method that returns monthly interest rate
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    //method that returns the monthly interest
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() / 100;
    }

    //method that withdraws a specified amount from the account
    public void withdraw(double thisAmount){
        balance -= thisAmount;
    }

    //method that deposits a specified amount to the account
    public void deposit(double thisAmount){
        balance +=thisAmount;
    }


}
