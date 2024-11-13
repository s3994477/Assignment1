package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.*;

public class RentalAgreement {
    //Declare variables for this class
    private String id;
    private Tenant mainTenant;
    private List<Tenant> subTenants = new ArrayList<>();
    private Property leasedProperty;
    private String rentalPeriod;
    private Date contractDate;
    private double rentFee;
    private rentalStatus status;

    //Format date
    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");

    //Constructors
    public RentalAgreement() {
        this.id = "";
        this.mainTenant = null;
        this.subTenants = new ArrayList<>();
        this.leasedProperty = null;
        this.rentalPeriod = "";
        this.contractDate = null;
        this.rentFee = 0;
        this.status = rentalStatus.ACTIVE;
    }
    public RentalAgreement(String id, Tenant mainTenant, List<Tenant> subTenants, Property leasedProperty, String rentalPeriod, String date, double rentFee, String Status) {
        this.id = id;
        this.mainTenant = mainTenant;
        this.subTenants = subTenants;
        this.leasedProperty = leasedProperty;
        this.rentalPeriod = rentalPeriod;
        try {
            this.contractDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.rentFee = rentFee;
        //Status assigning
        switch(Status) {
            case "Active":
                this.status = rentalStatus.ACTIVE;
                break;
            case "New":
                this.status = rentalStatus.NEW;
                break;
            case "Completed":
                this.status = rentalStatus.COMPLETED;
                break;
            default:
                break;
        }
    }

    //Getters and Setters
    public String getId() { return id; }
    public Tenant getMainTenant() { return mainTenant; }
    public List<Tenant> getSubTenants() { return subTenants; }
    public Property getLeasedProperty() { return leasedProperty; }
    public String getRentalPeriod() { return rentalPeriod; }
    public String getContractDate() { return ft.format(contractDate); }
    public double getRentFee() { return rentFee; }
    public String getStatus() {
        if (status == rentalStatus.ACTIVE) {
            return "Active";
        } else if (status == rentalStatus.NEW) {
            return "New";
        } else {
            return "Completed";
        }
    }
    public void setId(String id) { this.id = id; }
    public void setMainTenant(Tenant mainTenant) { this.mainTenant = mainTenant; }
    public void setSubTenants(List<Tenant> subTenants) { this.subTenants = subTenants; }
    public void setLeasedProperty(Property leasedProperty) { this.leasedProperty = leasedProperty; }
    public void setRentalPeriod(String rentalPeriod) { this.rentalPeriod = rentalPeriod; }
    public void setContractDate(String date) {
        try {
            this.contractDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public void setRentFee(double rentFee) { this.rentFee = rentFee; }
    public void setStatus(String Status) {
        switch(Status) {
            case "Active":
                this.status = rentalStatus.ACTIVE;
                break;
            case "New":
                this.status = rentalStatus.NEW;
                break;
            case "Completed":
                this.status = rentalStatus.COMPLETED;
                break;
            default:
                break;
        }
    }
}
