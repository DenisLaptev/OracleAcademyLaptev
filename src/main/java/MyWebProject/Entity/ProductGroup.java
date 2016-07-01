package MyWebProject.Entity;

import java.util.List;

/**
 * Created by lapte on 16.06.2016.
 */
public class ProductGroup {
    private long id;
    private String name;
    private String description;
    private List<Product> products;

    public ProductGroup(long id, String name,
                        String description, List<Product> products) {
        setId(id);
        setName(name);
        setDescription(description);
        setProducts(products);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
