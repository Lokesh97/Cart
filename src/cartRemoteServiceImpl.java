import java.util.ArrayList;
import java.util.HashMap;

public class cartRemoteServiceImpl implements cartRemoteService {

    private static HashMap<Integer,cartProduct> cartProducts=new HashMap<>();
    @Override
    public void addToCart(Product product) {

    }


    @Override
    public void checkOutCart() {

    }

    @Override
    public boolean isPresentInCart(Product pid) {
        return (cartProducts.containsKey(pid)?true:false);
    }

    @Override
    public void updateItemsToCart() {

    }

    @Override
    public void adjustItemsInCart() {

    }

    @Override
    public void updateItemPriceToCart() {

    }

    @Override
    public void removeItemsFromCart() {

    }

    @Override
    public void showAllCart() {

    }

    @Override
    public boolean isEmptyCart() {
        return false;
    }

    @Override
    public void goShopping() {

    }

    @Override
    public boolean areItemsExpiredInCart() {
        return false;
    }

    @Override
    public boolean notEnoughItemAvailableForCart() {
        return false;
    }

    @Override
    public void updateCart() {

    }

    @Override
    public void updateInventory() {

    }

    @Override
    public void proceedToPay() {

    }

    @Override
    public boolean isPaymentSuccessful() {
        return false;
    }
}
