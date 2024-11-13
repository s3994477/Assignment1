package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.*;

public class Owner extends Person{
    //Declare variables unique to host
    private List<Property> ownedProperties = new ArrayList<>();
    private List<Host> listHosts = new ArrayList<>();
    private List<RentalAgreement> rentalAgreements = new ArrayList<>();

    //Constructors
    public Owner() {
        super();
    }
    public Owner(String id, String fullName, String date, String contactNo) {
        super(id, fullName, date, contactNo);
    }

    //Adding property object to the list when called to keep track of owner's properties
    public void addOwnedProperty(Property property) { ownedProperties.add(property); }

    //Adding host object to the list when called to keep track of a list of hosts that manage the owner's properties
    public void addHost(Host host) { listHosts.add(host); }

    //Adding rental agreement object to the list when called to keep track of the rental of owner's properties
    public void addRentalAgreement(RentalAgreement agreement) {
        rentalAgreements.add(agreement);
    }

    //Methods to get/return all the properties
    public List<Property> getOwnedProperties() { return ownedProperties; }
    public List<Host> getListHosts() { return listHosts; }
    public List<RentalAgreement> getRentalAgreements() { return rentalAgreements; }
}
