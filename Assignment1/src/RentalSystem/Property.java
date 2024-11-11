package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

public class Property {
    //Declare basic variables
    private String id;
    private String address;
    private double pricing;
    private propertyStatus status;

    //Constructors
    public Property() {
        this.id = "";
        this.address = "";
        this.pricing = 0;
        this.status = propertyStatus.AVAILABLE;
    }
    public Property(String id, String address, double pricing, String Status) {
        this.id = id;
        this.address = address;
        this.pricing = pricing;
        //Status assigning
        switch(Status) {
            case "Available":
                this.status = propertyStatus.AVAILABLE;
                break;
            case "Rented":
                this.status = propertyStatus.RENTED;
                break;
            case "Under Maintenance":
                this.status = propertyStatus.MAINTENANCE;
                break;
            default:
                break;
        }
    }

    //Getters and Setters
    public String getId() { return id; }
    public String getAddress() { return address; }
    public double getPricing() { return pricing; }
    public String getStatus() {
        if (status == propertyStatus.AVAILABLE) {
            return "Available";
        } else if (status == propertyStatus.RENTED) {
            return "Rented";
        } else {
            return "Under Maintenance";
        }
    }
    public void setId(String id) { this.id = id; }
    public void setAddress(String address) { this.address = address; }
    public void setPricing(double pricing) { this.pricing = pricing; }
    public void setStatus(String Status) {
        switch(Status) {
            case "Available":
                this.status = propertyStatus.AVAILABLE;
                break;
            case "Rented":
                this.status = propertyStatus.RENTED;
                break;
            case "Under Maintenance":
                this.status = propertyStatus.MAINTENANCE;
                break;
            default:
                break;
        }
    }
}
