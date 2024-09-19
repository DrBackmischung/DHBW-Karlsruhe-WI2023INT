package memento;

import memento.cart.Cart;
import memento.cart.CartHistory;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        CartHistory history = new CartHistory();

        cart.addItem("Apples");
        history.save(cart);  

        cart.addItem("Bananas");
        history.save(cart);  

        cart.addItem("Chips");
        cart.addItem("Doritos");
        history.save(cart);

        cart.showItems();

        history.undo(cart);
        cart.showItems();

        history.undo(cart);
        cart.showItems();
    }
}
