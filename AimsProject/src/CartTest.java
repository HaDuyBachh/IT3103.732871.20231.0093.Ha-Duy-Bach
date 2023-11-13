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
		
		//In thông tin các sản phẩm tỏng giỏ hàng
		cart.InfoInCart(); 
	}
}
