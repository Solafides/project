package ATM_INTERFACE;

public class checking extends account {
private double rate;
public checking(String name,String lname,String acctNo, String PIN,double balance,double rate)
{
    super( name,lname,acctNo,PIN,balance);
    this.rate=rate;
}
    @Override
    public String toString() {
        return super.toString() + "  checking account";
    }
    double w=0;
    @Override
    public void withdraw(double amount){
             double x=getBalance();
        if (amount > 0) {
             x-=amount;
            super.setBalance(x);

             if (x < 0 ) {
                 double rater = amount * getRate();
                 w=rater+w;

                 System.out.println("Withdrawal of birr  " + amount + " from your checking account  " + "your current balance: birr  " + x);
                 System.out.println("you are required to pay an extra money of birr  " + w);
             }else
            System.out.println("Withdrawal of birr  " + amount + " successful.   your current balance: birr " + x);
        }
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
