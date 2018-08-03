

public class User {

    private int userId;

    private String userName;

    private int fk_productId;

    private int cartCount;

    public User(int userId, String userName, int fk_productId, int cartCount) {
        this.userId = userId;
        this.userName = userName;
        this.fk_productId = fk_productId;
        this.cartCount = cartCount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getFk_productId() {
        return fk_productId;
    }

    public void setFk_productId(int fk_productId) {
        this.fk_productId = fk_productId;
    }

    public int getCartCount() {
        return cartCount;
    }

    public void setCartCount(int cartCount) {
        this.cartCount = cartCount;
    }
}
