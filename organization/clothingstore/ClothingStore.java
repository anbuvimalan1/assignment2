package organizations.clothingstore;

import assignment2.commons.Organization;
import assignment2.commons.Contactable;
import java.util.ArrayList;
import java.util.List;

public class ClothingStore extends Organization implements Contactable {
    private List<Brand> brands;

    public ClothingStore(String name) {
        super();
        setName(name);
        brands = new ArrayList<>();
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public boolean removeBrand(Brand brand) {
        return brands.remove(brand);
    }

    // Implement other methods as needed

    @Override
    public String getEmail() {
        // Implement this method according to your requirements
        return null;
    }

    @Override
    public String getAddress() {
        // Implement this method according to your requirements
        return null;
    }

    @Override
    public String getPhoneNumber() {
        // Implement this method according to your requirements
        return null;
    }
}