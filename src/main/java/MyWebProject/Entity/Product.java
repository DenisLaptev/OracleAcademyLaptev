package MyWebProject.Entity;

/**
 * Created by lapte on 16.06.2016.
 */
public class Product {
    private long id;
    private String nameOfTheProduct;
    private String descriptionOfTheProduct;
    private int numberOfProducts;
    private double priceOfTheProduct;
    private String countryWhereMade;


    public Product(long id, String nameOfTheProduct,
                   String descriptionOfTheProduct,
                   int numberOfProducts, double priceOfTheProduct,
                   String countryWhereMade) {
        setId(id);
        setNameOfTheProduct(nameOfTheProduct);
        setDescriptionOfTheProduct(descriptionOfTheProduct);
        setNumberOfProducts(numberOfProducts);
        setPriceOfTheProduct(priceOfTheProduct);
        setCountryWhereMade(countryWhereMade);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public String getDescriptionOfTheProduct() {
        return descriptionOfTheProduct;
    }

    public void setDescriptionOfTheProduct(String descriptionOfTheProduct) {
        this.descriptionOfTheProduct = descriptionOfTheProduct;
    }

    public double getPriceOfTheProduct() {
        return priceOfTheProduct;
    }

    public void setPriceOfTheProduct(double priceOfTheProduct) {
        this.priceOfTheProduct = priceOfTheProduct;
    }

    public String getCountryWhereMade() {
        return countryWhereMade;
    }

    public void setCountryWhereMade(String countryWhereMade) {
        this.countryWhereMade = countryWhereMade;
    }
}
