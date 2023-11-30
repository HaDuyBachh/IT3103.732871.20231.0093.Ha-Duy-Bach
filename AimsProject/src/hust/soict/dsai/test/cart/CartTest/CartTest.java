package hust.soict.dsai.test.cart.CartTest;
import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.DVD;

public class CartTest {
	public static void main(String[] args) {
		//Tạo giỏ hàng
		Cart cart = new Cart();
		
		//Thêm các DVD vào giỏ hàng
		DVD dvd1 = new DVD("The Lion King", 
				"Animation", "Roger Allers",87, 19.95f);
		cart.addMedia(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DVD dvd3 = new DVD("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		//In thông tin các sản phẩm trong giỏ hàng
		cart.InfoInCart(); 
	}
}
