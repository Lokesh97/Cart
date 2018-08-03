

public class Product {

    private int productId;

    private String name;

    private double price;

    private int productCount;

    public Product(int productId, String name, double price, int productCount) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productCount = productCount;

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(double price) {
        this.price = price;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }


}
