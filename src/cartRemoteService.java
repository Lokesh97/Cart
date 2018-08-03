

/* It is the interface for functions that shopping cart must deliver to its users*/
public interface cartRemoteService {

    /* This adds items selected by users to cart */
    public void addToCart();

    /* This facilitates checkout options*/
    public void checkOutCart();

    /* This updates items in cart*/
    public void updateItemsToCart();

    /* This updates items in cart*/
    public void adjustItemsInCart();

    /* This updates prices of items in cart*/
    public void updateItemPriceToCart();

    /* This removes items in cart*/
    public void removeItemsFromCart();

    /* This shows list of items present in cart*/
    public void showAllCart();

    /* This checks whether something is present in cart*/
    public boolean isEmptyCart();

    /* This direct users to do shopping on mall*/
    public void goShopping();

    /* This updates items in cart*/
    public boolean areItemsExpiredInCart();

    /* This updates items in cart*/
    public boolean notEnoughItemAvailableForCart();

    /* This updates cart so as to handle price discrepancy,item not found,number of items,item expired*/
    public void updateCart();

    /* This updates items in cart*/
    public void updateInventory();

    /* This updates items in cart*/
    public void proceedToPay();

    /* This updates items in cart*/
    public boolean isPaymentSuccessful();
}
