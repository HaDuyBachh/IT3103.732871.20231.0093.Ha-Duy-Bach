
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
	public boolean AddDVD(DVD disc)
	{
		if (qtyOrdered < MAX_NUMBERS_ORDERED) 
		{
			itemsOrdered[qtyOrdered++] = disc;
			if (qtyOrdered + 3 > MAX_NUMBERS_ORDERED) System.out.print("Giỏ hàng đã gần đầy \n");
		}
		else
		{
			System.out.print("Giỏ hàng đã đầy \n");
			return false;
		}
		return true;
	}
	
	//quá tải phương thức bằng tham số loại khác
	public boolean AddDVD(DVD[] dvdList)
	{
		for (int i = 0; i< dvdList.length; i++)
		{
			if (!AddDVD(dvdList[i])) return false;
		}
		return true;
	}
	
	//quá tải phương thức Add bằng số lượng tham số đầu vào
	public boolean AddDVD(DVD dvd1, DVD dvd2)
	{
		return (AddDVD(dvd1) || AddDVD(dvd2));
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
		System.out.print("***********************CART***********************\n"
				+ "Ordered Items:\n");
		for (int i = 0; i<qtyOrdered; i ++)
		{
			System.out.print(itemsOrdered[i].Info() + '\n');
		}
		System.out.print("Total cost " + TotalCost() + '\n');
	}
	
	//Tìm kiếm DVD theo id
	public boolean FindDVDWithId(int id)
	{
		for (int i = 0; i<qtyOrdered; i++)
		{
			if (itemsOrdered[i].getId() == id)
			{
				return true;
			}
		}
		return false;
	}
	
	//Tìm kiếm DVD theo tiêu đề
	public boolean FindDVDWithTitle(String tile)
	{
		for (int i = 0; i<qtyOrdered; i++)
		{
			if (itemsOrdered[i].getTitle().matches(tile))
			{
				return true;
			}
		}
		return false;
	}
}
