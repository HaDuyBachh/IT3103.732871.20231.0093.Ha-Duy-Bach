
public class Store {
	public DVD[] itemsInStore;
	public int maxNumberOrdered;
	public int qtyOrdered;
	//khởi tạo cửa hàng vào số lượng item tối đa
	public Store(int maxNumberOrdered)
	{
		super();
		this.maxNumberOrdered = maxNumberOrdered;
		itemsInStore = new DVD[maxNumberOrdered];
	}
	
	//Thêm DVD vào Store
	public void AddDVD(DVD dvd)
	{
		itemsInStore[qtyOrdered++] = dvd;
		System.out.print("Thêm thành công DVD có id " + dvd.getId() +" vào giỏ hàng \n");
	} 
	
	//Xóa DVD khỏi Store
	public void RemoveDVD(DVD disc)
	{
		int newQtyOrdered = 0;
		for (int i = 0; i<qtyOrdered; i++)
		{
			if (disc != itemsInStore[i])
			{
				itemsInStore[newQtyOrdered++] = itemsInStore[i];
			}
		}
			
		System.out.print("Đã xóa " + (qtyOrdered - newQtyOrdered) + " đối tượng ra khỏi giỏ hàng \n");
			
		qtyOrdered = newQtyOrdered;
	}
}
