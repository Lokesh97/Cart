import java.util.ArrayList;
import java.util.HashMap;

public class cartRemoteServiceImpl implements cartRemoteService {

    private static HashMap<Integer,cartProduct> cartProducts=new HashMap<>();
    @Override

    public boolean notEnoughItemAvailableForCart(int productId) {

        return false;
    }

    public void addToCart(Product product) throws notEnoughItemAvailableException {
        if(this.notEnoughItemAvailableForCart(product.getProductId())){
              throw new notEnoughItemAvailableException("Not enough available items are there to add to cart");
        }

        if(isPresentInCart(product.getProductId())){
            cartProduct CartProduct=cartProducts.get(product.getProductId());
            CartProduct.setCartProductCount(CartProduct.getCartProductCount()+1);
            cartProducts.put(product.getProductId(),CartProduct);
        }else{
                cartProducts.put(product.getProductId(),new cartProduct(product.getProductId(),1,product.getName(),product.getPrice()));
            }
    }


    @Override
    public void checkOutCart() {

    }

    @Override
    public boolean isPresentInCart(int pid) {

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
