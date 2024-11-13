package RentalSystem;
/**
 * @author <Do Hao Nhien - s3994477>
 */

public class ResidentialProperty extends Property {
    //Declare variables unique to Residential Property
    private int numBedrooms;
    private boolean hasGarden;
    private boolean petFriendly;

    //Constructors
    public ResidentialProperty() {
        super();
        this.numBedrooms = 0;
        this.hasGarden = false;
        this.petFriendly = false;
    }
    public ResidentialProperty(String id, String address, double pricing, String Status, int numBedrooms, boolean hasGarden, boolean petFriendly) {
        super(id, address, pricing, Status);
        this.numBedrooms = numBedrooms;
        this.hasGarden = hasGarden;
        this.petFriendly = petFriendly;
    }

    //Setters and Getters
    public void setNumBedrooms(int numBedrooms) { this.numBedrooms = numBedrooms; }
    public void setHasGarden(boolean hasGarden) { this.hasGarden = hasGarden; }
    public void setPetFriendly(boolean petFriendly) { this.petFriendly = petFriendly; }
    public int getNumBedrooms() { return numBedrooms; }
    public boolean getHasGarden() { return hasGarden; }
    public boolean getPetFriendly() { return petFriendly; }
}
