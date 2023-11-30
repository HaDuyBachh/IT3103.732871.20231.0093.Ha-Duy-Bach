package hust.soict.dsai.aims.cart.Cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

// Hà Duy Bách 20210093
public class Cart {
	private ArrayList<Media> itemsOrder = new ArrayList<Media>();
	
	//Thêm sản phẩm vào giỏ hàng
	public boolean addMedia(Media media)
	{
		if (itemsOrder.contains(media)) return false;
		itemsOrder.add(media);
		return true;
	}
	
	//Xóa sản phẩm khỏi giỏ hàng
	public boolean removeMedia(Media media)
	{
		if (!itemsOrder.contains(media)) return false;
		itemsOrder.remove(media);
		return true;	
	}
	
	//Tổng số tiền trong giỏ hàng
	public float TotalCost()
	{
		float sum = 0;
		for(Media media : itemsOrder)
		{
			sum += media.getCost();
		}
		return sum;
	}
	
	//In ra số lượng và thông tin các sản phẩm trong giỏ hàng
	public void InfoInCart()
	{
		System.out.print("***********************CART***********************\n"
				+ "Ordered Items:\n");
		for(Media media : itemsOrder)
		{
			System.out.print(media.Info() + '\n');
		}
		System.out.print("Total cost " + TotalCost() + '\n');
	}
	
	
}
