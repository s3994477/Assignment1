package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Owner extends Person{
    //Declare variables unique to host
    private List<Property> ownedProperties = new ArrayList<>();
    private List<Host> listHosts = new ArrayList<>();
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();

    //Constructors
    public Owner() {
        super();
    }
    public Owner(String id, String fullName, Date DOB, String contactNo) {
        super(id, fullName, DOB, contactNo);
    }

    //Adding property object to the list when called to keep track of owner's properties
    public void addOwnedProperty(Property property) { ownedProperties.add(property); }

    //Adding host object to the list when called to keep track of a list of hosts that manage the owner's properties
    public void addHost(Host host) { listHosts.add(host); }

    //Adding rental agreement object to the list when called to keep track of the rental of owner's properties
    public void addRentalAgreement(RentalAgreement agreement) {
        rentalAgreements.add(agreement);
    }
}
