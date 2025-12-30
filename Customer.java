package ATM_INTERFACE;

public class Customer {
    private String fname;
    private String lname;

    public Customer(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }
    public void setLname(String lname ) {
        this.lname = lname;
    }
    public String getLname() {
        return lname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }}