package hust.soict.dsai.test.cart.CartTest;
import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DVD;

public class CartTest {
	public static void main(String[] args) {
		//Tạo giỏ hàng
		Cart cart = new Cart();
		
		//Thêm các DVD vào giỏ hàng
		DVD dvd1 = new DVD("The Lion King", 
				"Animation", "Roger Allers",87, 19.95f);
		cart.AddDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		cart.AddDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladin", "Animation", 18.99f);
		cart.AddDVD(dvd3);
		
		//In thông tin các sản phẩm trong giỏ hàng
		//cart.InfoInCart(); 
		
		//System.out.print('\n');
		
		//Tìm sản phẩm theo id
		System.out.println(cart.FindDVDWithId(0) ? "Tìm thấy sản phẩm" : "Không tìm thấy sản phẩm");
		
		//Tìm sản phẩm theo tên
		System.out.println(cart.FindDVDWithTitle("Aladin") ?  "Tìm thấy sản phẩm" : "Không tìm thấy sản phẩm");
		
		System.out.println(cart.FindDVDWithTitle("Aradin") ?  "Tìm thấy sản phẩm" : "Không tìm thấy sản phẩm");
	}
}
