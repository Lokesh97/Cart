

public class Product {

    private int productId;

    private String name;

    private String description;

    private int productCount;

    public Product(int productId, String name, String description, int productCount, int fk_merchant) {
        this.productId = productId;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }


}
