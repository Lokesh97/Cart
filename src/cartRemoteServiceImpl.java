
import java.util.HashMap;

public class cartRemoteServiceImpl implements cartRemoteService {

    private static HashMap<Integer,cartProduct> cartProducts=new HashMap<>();

    private Products productList=new Products();
    @Override


    public void addToCart(Product product) throws notEnoughItemAvailableException {
        if(this.notEnoughItemAvailableForCart(product.getProductId())){
            throw new notEnoughItemAvailableException("Not enough available items are there to add to cart");
        }

        if(isPresentInCart(product.getProductId())){
            cartProduct CartProduct=cartProducts.get(product.getProductId());
            CartProduct.setCartProductCount(CartProduct.getCartProductCount()+1);
            CartProduct.setCartProductPrice(CartProduct.getCartProductPrice()+product.getPrice());
            cartProducts.put(product.getProductId(),CartProduct);
        }else{
            cartProducts.put(product.getProductId(),new cartProduct(product.getProductId(),1,product.getName(),product.getPrice()));
        }

        showAllCart();
    }

    @Override
    public void showAllCart() {

        for (HashMap.Entry<Integer,cartProduct> entry : cartProducts.entrySet()){
            System.out.println("com.paytm.shoppingCart.Product id = " + entry.getKey());
            System.out.println("com.paytm.shoppingCart.Product count= "+entry.getValue().getCartProductCount());
            System.out.println("com.paytm.shoppingCart.Product price= "+entry.getValue().getCartProductPrice());
            System.out.println("com.paytm.shoppingCart.Product name= "+entry.getValue().getCartProductName());
        }
    }


    public boolean notEnoughItemAvailableForCart(int productId) {
        int productCount=productList.getProductsList().get(productId).getProductCount();
        int cartProductCount=0;
        if(cartProducts.containsKey(productId)){
            cartProductCount=cartProducts.get(productId).getCartProductCount();
        }
        if(productCount==0||productCount<=cartProductCount){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isPresentInCart(int pid) {

        return (cartProducts.containsKey(pid)?true:false);
    }

    @Override
    public boolean isEmptyCart() {

        return cartProducts.isEmpty();
    }

    @Override
    public void removeItemsFromCart() throws cartEmptyException {
        if(isEmptyCart()){
            throw new cartEmptyException("no items in cart");
        }
        for(HashMap.Entry<Integer,cartProduct> e:cartProducts.entrySet()){
            removeItemFromCart(e.getValue().getCartProductId());
        }
        showAllCart();
    }

    public void removeItemFromCart(int productId) {

        updateCart();
        cartProduct CartProduct=cartProducts.get(productId);
        if(CartProduct==null)
            return;
        if(CartProduct.getCartProductCount()==1){
            cartProducts.remove(productId);
        }else{
            CartProduct.setCartProductCount(CartProduct.getCartProductCount()-1);
            CartProduct.setCartProductPrice(CartProduct.getCartProductPrice()-productList.getProductsList().get(productId).getPrice());
            cartProducts.put(productId,CartProduct);
        }
        showAllCart();
    }

    @Override
    public void checkOutCart() throws cartEmptyException{
        updateCart();
        if(isEmptyCart()){
            throw new cartEmptyException("cart is empty");
        }

        try {
            proceedToPay();
        }catch (paymentUnsuccessfulException e){
            e.printStackTrace();
        }
    }



    @Override
    public void updateItemInCart(int pid) {

        Product product=productList.getProductsList().get(pid);
        cartProduct cart=cartProducts.get(pid);
        int productCount=product.getProductCount();
        double productPrice=product.getPrice();
        int cartProductCount=cart.getCartProductCount();
        double cartProductPrice=cart.getCartProductPrice();
        if(productCount==0){
            cartProducts.remove(pid);
        }
        else{
            cart.setCartProductPrice(product.getPrice()*cart.getCartProductCount());
            cartProducts.put(pid,cart);
        }
    }

    @Override
    public void updateCart() {

        for(HashMap.Entry<Integer,cartProduct> e:cartProducts.entrySet()){
            updateItemInCart(e.getValue().getCartProductId());
        }
    }

    @Override
    public void generateCartBill() {

        updateCart();
        double cartAmount=0.0;
        for(HashMap.Entry<Integer,cartProduct> e:cartProducts.entrySet()){
            cartAmount+=(e.getValue().getCartProductCount()*e.getValue().getCartProductPrice());
        }
        System.out.println("com.paytm.shoppingCart.Cart amount total is "+cartAmount);
    }

    @Override
    public void proceedToPay() throws paymentUnsuccessfulException{

        if(isPaymentSuccessful()){

            double cartAmount=0.0;

            for(HashMap.Entry<Integer,cartProduct> e:cartProducts.entrySet()){
                cartAmount+=(e.getValue().getCartProductCount()*e.getValue().getCartProductPrice());
                Product product=productList.getProductsList().get(e.getKey());
                product.setProductCount(product.getProductCount()-e.getValue().getCartProductCount());
                productList.getProductsList().put(e.getKey(),product);
            }
            cartProducts.clear();
            System.out.println("com.paytm.shoppingCart.Cart amount paid is "+cartAmount);
        }else{
            throw new paymentUnsuccessfulException("payment not successful");
        }
    }

    @Override
    public boolean isPaymentSuccessful() {

        int randomInitializer=(int)(Math.random()*10);
        return (randomInitializer<=4?true:false);
    }
}
