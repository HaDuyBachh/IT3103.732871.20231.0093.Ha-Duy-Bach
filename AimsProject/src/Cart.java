// Hà Duy Bách 20210093
public class Cart {
	//Giới hạn số lượng hàng trong giỏ
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	//Khởi tạo giỏ hàng mới
	private DVD itemsOrdered[] =
			new DVD[MAX_NUMBERS_ORDERED];
	
	//Số lượng hàng trong giỏ
	private int qtyOrdered = 0;
	
	//thêm DVD vào giỏ hàng
	public void AddDVD(DVD disc)
	{
		if (qtyOrdered < MAX_NUMBERS_ORDERED) 
		{
			itemsOrdered[qtyOrdered++] = disc;
			if (qtyOrdered + 3 > MAX_NUMBERS_ORDERED) System.out.print("Giỏ hàng đã gần đầy \n");
		}
		else
		{
			System.out.print("Giỏ hàng đã đầy \n");
			return;
		}
	}
	
	//Xóa DVD khỏi giỏ hàng
	public void RemoveDVD(DVD disc)
	{
		int newQtyOrdered = 0;
		for (int i = 0; i<qtyOrdered; i++)
		{
			if (disc != itemsOrdered[i])
			{
				itemsOrdered[newQtyOrdered++] = itemsOrdered[i];
			}
		}
		
		System.out.print("Đã xóa " + (qtyOrdered - newQtyOrdered) + " đối tượng ra khỏi giỏ hàng \n");
		
		qtyOrdered = newQtyOrdered;
	}
	
	//Tổng số tiền trong giỏ hàng
	public float TotalCost()
	{
		float sum = 0;
		for(int i = 0; i<qtyOrdered; i++)
		{
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
	
	//In ra số lượng và thông tin các sản phẩm trong giỏ hàng
	public void InfoInCart()
	{
		System.out.print("Tổng sản phẩm có trong giỏ hàng: " + qtyOrdered + " .Gồm: \n");
		for (int i = 0; i<qtyOrdered; i ++)
		{
			System.out.print(itemsOrdered[i].Info() + '\n');
		}
	}
	
}
