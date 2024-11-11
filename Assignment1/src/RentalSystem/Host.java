package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Host extends Person {
    //Declare variables unique to host
    private List<Property> managedProperties = new ArrayList<>();
    private List<Host> cooperatingOwners = new ArrayList<>();
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();

    //Constructors
    public Host() {
        super();
    }
    public Host(String id, String fullName, Date DOB, String contactNo) {
        super(id, fullName, DOB, contactNo);
    }

    //Adding property object to the list when called to keep track of all properties the host is managing
    public void addProperty(Property property) {
        managedProperties.add(property);
    }

    //Adding host object to the list when called to keep track of the host's cooperating owners
    public void addCooperatingOwner(Host owner) {
        cooperatingOwners.add(owner);
    }

    //Adding rental agreement object to the list when called to keep track of each tenant's rental history
    public void addRentalAgreement(RentalAgreement agreement) {
        rentalAgreements.add(agreement);
    }
}
