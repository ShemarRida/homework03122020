package store;

public class Checkout {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.name = "Cookies";
        System.out.println(cart.name + " Checked out");
    }
}
