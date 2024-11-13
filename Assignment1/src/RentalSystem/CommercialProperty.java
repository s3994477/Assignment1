package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

public class CommercialProperty extends Property {
    //Declare variables unique to Commercial Property
    private String businessType;
    private int parkingSpaces;
    private double squareFootage;

    //Constructors
    public CommercialProperty() {
        super();
        this.businessType = "";
        this.parkingSpaces = 0;
        this.squareFootage = 0;
    }
    public CommercialProperty(String id, String address, double pricing, String Status, String businessType, int parkingSpaces, double squareFootage) {
        super(id, address, pricing, Status);
        this.businessType = businessType;
        this.parkingSpaces = parkingSpaces;
        this.squareFootage = squareFootage;
    }

    //Setters and Getters
    public void setBusinessType(String businessType) { this.businessType = businessType; }
    public void setParkingSpaces(int parkingSpaces) { this.parkingSpaces = parkingSpaces; }
    public void setSquareFootage(double squareFootage) { this.squareFootage = squareFootage; }
    public String getBusinessType() { return businessType; }
    public int getParkingSpaces() { return parkingSpaces; }
    public double getSquareFootage() { return squareFootage; }
}
