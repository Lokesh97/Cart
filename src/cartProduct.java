public class cartProduct {

    private int cartProductId;
    private int cartProductCount;
    private String cartProductName;

    public cartProduct(int cartProductId, int cartProductCount, String cartProductName) {
        this.cartProductId = cartProductId;
        this.cartProductCount = cartProductCount;
        this.cartProductName = cartProductName;
    }

    public int getCartProductId() {
        return cartProductId;
    }

    public void setCartProductId(int cartProductId) {
        this.cartProductId = cartProductId;
    }

    public int getCartProductCount() {
        return cartProductCount;
    }

    public void setCartProductCount(int cartProductCount) {
        this.cartProductCount = cartProductCount;
    }

    public String getCartProductName() {
        return cartProductName;
    }

    public void setCartProductName(String cartProductName) {
        this.cartProductName = cartProductName;
    }
}
