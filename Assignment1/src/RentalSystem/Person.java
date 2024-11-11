package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.Date;

public class Person {
    //Declare basic variables
    private String id;
    private String fullName;
    private Date DOB;
    private String contactNo;

    //Constructors
    public Person() {
        this.id = "";
        this.fullName = "";
        this.DOB = null;
        this.contactNo = "";
    }
    public Person(String id, String fullName, Date DOB, String contactNo) {
        this.id = id;
        this.fullName = fullName;
        this.DOB = DOB;
        this.contactNo = contactNo;
    }

    //Getters and Setters
    public String getID() { return id; }
    public String getFullName() { return fullName; }
    public Date getDOB() { return DOB; }
    public String getContactNo() { return contactNo; }
    public void setID(String id) { this.id = id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDOB(Date DOB) { this.DOB = DOB; }
    public void setContactNo(String contactNo) { this.contactNo = contactNo; }

}
