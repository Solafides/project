package ATM_INTERFACE;

public class account extends Customer {

    private String acctNo;
    private String PIN;
    private double balance;
    public account(String name,String lname,String acctNo, String PIN,double balance){
        super(name,lname);
        this.acctNo=acctNo;
        this.PIN=PIN;
        this.balance=balance;
    }
   // static int j;
//    private static int fun(){
//        j=45;
//        displayer();
//        return 0;
//    }
    @Override
    public String toString() {
        return "Dear  " + getFname()+"  " + getLname() + ",  your current Balance is: birr " + balance;
    }
    public String displayer(){
        String money=String.format("Dear %6s %6s%n%n     Welcome to HAWASSA university BANK %n ",getFname(),getLname());
        return money;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of birr  " + amount + " successful.   your current balance: birr " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("you have succesfully deposited birr "+ amount + "   your current balance is birr "+balance);
        }
        else{
            System.out.println("incorrect amount of money");
        }
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
    public String getAcctNo() {
        return acctNo;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
    public String getPIN() {
        return PIN;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    }
