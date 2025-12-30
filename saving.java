package ATM_INTERFACE;

public class saving extends account {
private double rate;
public saving(String name,String lname,String acctNo, String PIN,double balance,double rate) {
    super(name, lname, acctNo, PIN, balance);
    this.rate=rate;
}
    @Override
    public String toString() {
        return super.toString()+"  On your saving account";
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

}
