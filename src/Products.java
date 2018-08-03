import java.util.ArrayList;

/**
 *
 */
public class Products {

    ArrayList<Product> productsList = new ArrayList<Product>();

    public Products() {
        this.initializeProductList();
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void initializeProductList() {
       int[] productId = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       String[] productName = {"Iphone X", "Samsung Galaxy S9", "Samsung Galaxy J8", "Vivo V9",
                                "Mi Mix 2", "Oppo F5", "Nokia 6", "Sony Xperia XA1", "Redmi Note 5"};
       double[] productPrice = {100499.0, 57900.0, 18990.0, 20990.0, 30358.0, 17990.0, 15076.0, 18990.0, 10999.0};
       int[] productCount = {5, 6, 4, 7, 6, 4, 8, 9, 7};

       for (int i = 0; i < productId.length; i++) {
            this.productsList.add(new Product(productId[i], productName[i], productPrice[i], productCount[i]));
       }
   }
}