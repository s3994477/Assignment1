package RentalSystem;

import java.util.ArrayList;
import java.util.List;

public class testing {
    public static void main(String[] args) {
        Tenant tenant1 = new Tenant();
        Tenant tenant2 = new Tenant();
        Tenant tenant3 = new Tenant();
        Tenant tenant4 = new Tenant();
        List<Tenant> tenants = new ArrayList<Tenant>();
        tenants.add(tenant1);
        tenants.add(tenant2);
        tenants.add(tenant3);
        tenants.add(tenant4);
        RentalAgreement agreement1 = new RentalAgreement();
        agreement1.setSubTenants(tenants);
        System.out.println(agreement1.getSubTenants());
    }
}
