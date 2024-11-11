package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.Date;

public class Payment {
    //Declare variables for this class
    private double amount;
    private Date date;
    private String method;

    //Constructors
    public Payment() {
        this.amount = 0;
        this.date = null;
        this.method = "";
    }
    public Payment(double amount, Date date, String method) {
        this.amount = amount;
        this.date = date;
        this.method = method;
    }

    //Getters and Setters
    public double getAmount() { return amount; }
    public Date getDate() { return date; }
    public String getMethod() { return method; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDate(Date date) { this.date = date; }
    public void setMethod(String method) { this.method = method; }
}
