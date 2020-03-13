package store;

public class RemovedFromCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.name = "Cookies";
        System.out.println(cart.name + " Removed from cart");
    }
}
