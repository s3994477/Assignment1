package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.Date;
import java.text.*;

public class Payment {
    //Declare variables for this class
    private double amount;
    private Date date;
    private String method;

    //Format date
    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");

    //Constructors
    public Payment() {
        this.amount = 0;
        this.date = null;
        this.method = "";
    }
    public Payment(double amount, String date, String method) {
        this.amount = amount;
        try {
            this.date = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.method = method;
    }

    //Getters and Setters
    public double getAmount() { return amount; }
    public String getDate() { return ft.format(this.date); }
    public String getMethod() { return method; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDate(String date) {
        try {
            this.date = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setMethod(String method) { this.method = method; }
}
