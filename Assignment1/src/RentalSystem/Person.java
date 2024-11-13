package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.text.*;
import java.util.Date;

public class Person {
    //Declare basic variables
    private String id;
    private String fullName;
    private Date DOB;
    private String contactNo;

    //Format date
    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");

    //Constructors
    public Person() {
        this.id = "";
        this.fullName = "";
        this.DOB = null;
        this.contactNo = "";
    }
    public Person(String id, String fullName, String date, String contactNo) {
        this.id = id;
        this.fullName = fullName;
        try {
            this.DOB = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.contactNo = contactNo;
    }

    //Getters and Setters
    public String getID() { return id; }
    public String getFullName() { return fullName; }
    public String getDOB() { return ft.format(DOB); }
    public String getContactNo() { return contactNo; }
    public void setID(String id) { this.id = id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDOB(String date) {
        try {
            this.DOB = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setContactNo(String contactNo) { this.contactNo = contactNo; }



}
