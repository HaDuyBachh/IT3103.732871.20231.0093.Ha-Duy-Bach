package hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemInStore = new ArrayList<Media>();
			
	//khởi tạo cửa hàng
	public Store()
	{
		super();
	}
	
	//Thêm sản phẩm vào giỏ hàng
	public boolean addMedia(Media media)
	{
		if (itemInStore.contains(media)) return false;
		itemInStore.add(media);
		return true;
	}
	
	//Xóa sản phẩm khỏi giỏ hàng
	public boolean removeMedia(Media media)
	{
		if (!itemInStore.contains(media)) return false;
		itemInStore.remove(media);
		return true;	
	}
}
