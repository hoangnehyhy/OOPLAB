package hust.soict.ITE7.test.cart;
import hust.soict.ITE7.aims.cart.Cart;
import hust.soict.ITE7.aims.disc.DigitalVideoDisc;

public class CartTest {

    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        cart.print();
        cart.search(2);
        cart.search("Star Wars");
    }
}