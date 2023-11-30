package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.DVD;

// Hà Duy Bách 20210093
public class Aims {

	public static void main(String[] args)
	{
		//Tạo giỏ hàng
		Cart anOrder = new Cart();
		
		//Thêm các DVD vào giỏ hàng
		DVD dvd1 = new DVD("The Lion King", 
				"Animation", "Roger Allers",87, 19.95f);
		anOrder.AddDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		anOrder.AddDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladion", "Animation", 18.99f);
		anOrder.AddDVD(dvd3);
		
		//In thông tin các sản phẩm tỏng giỏ hàng
		anOrder.InfoInCart(); 
		System.out.print("\n");
		
		//In tổng số tiền trong giỏ hàng
		System.out.print("Total Cost is: "); 
		System.out.print(anOrder.TotalCost() + "\n");
		System.out.print("\n");
		
		// Xóa dvd 3 ra khỏi giỏ hàng
		anOrder.RemoveDVD(dvd3);
		System.out.print("\n");
		
		//In thông tin các sản phẩm tỏng giỏ hàng
		anOrder.InfoInCart();
		System.out.print("\n");
		
		//In lại tổng tiền sau khi xóa DVD3
		System.out.print("Total Cost is: ");
		System.out.print(anOrder.TotalCost() + "\n");
	}
}
