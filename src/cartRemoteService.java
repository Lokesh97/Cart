

/* It is the interface for functions that shopping cart must deliver to its users*/
public interface cartRemoteService {

    /* This adds items selected by users to cart */
    public void addToCart(Product product) throws notEnoughItemAvailableException;

    /* This facilitates checkout options*/
    public void checkOutCart() throws cartEmptyException;

    /* This updates items in cart*/
    public void updateItemInCart(int productId);

    /* This removes items in cart*/
    public void removeItemsFromCart() throws cartEmptyException;

    /* This shows list of items present in cart*/
    public void showAllCart();

    /* This checks whether something is present in cart*/
    public boolean isEmptyCart();

    /* This updates items in cart*/
    public boolean notEnoughItemAvailableForCart(int productId);

    /* This updates cart so as to handle price discrepancy,item not found,number of items,item expired*/
    public void updateCart();

    /* This updates items in cart*/
    public void proceedToPay() throws paymentUnsuccessfulException;

    /* This updates items in cart*/
    public boolean isPaymentSuccessful();

    public boolean isPresentInCart(int pid);

    public void removeItemFromCart(int pid);

    public void generateCartBill();
}
