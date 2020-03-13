package store;

public class ShoppingCart {

    public String name;


    public ShoppingCart(){

    }
    public void addToCart(){
        System.out.println(name + " Added to cart");
    }
    public void removeFromCart(){
        System.out.println(name + " Removed from cart");
    }
    public void checkOut(){
        System.out.println(name + " Checked out");
    }
}
