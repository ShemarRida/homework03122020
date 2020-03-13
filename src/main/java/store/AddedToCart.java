package store;

public class AddedToCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.name = "Cookies";
        System.out.println(cart.name + " Added to cart");
    }
}
