package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Tenant extends Person {
    //Declare variables unique to tenant
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();
    private List<Payment> paymentRecords = new ArrayList<>();

    //Constructors
    public Tenant() {
        super();
    }
    public Tenant(String id, String fullName, Date DOB, String contactNo) {
        super(id, fullName, DOB, contactNo);
    }

    //Adding rental agreement object to the list when called to keep track of each tenant's rental history
    public void addRentalAgreement(RentalAgreement agreement) {
        rentalAgreements.add(agreement);
    }

    //Adding payment object to the list when called to keep track of the records of the payment transactions made by that tenant
    public void addPayment(Payment payment) {
        paymentRecords.add(payment);
    }

}