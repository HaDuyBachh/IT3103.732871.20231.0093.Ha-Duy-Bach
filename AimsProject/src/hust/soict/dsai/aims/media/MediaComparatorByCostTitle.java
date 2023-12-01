package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	//Sắp xếp theo giá, nếu giá bằng nhau thì mới xét đến tiêu đề
	public int compare(Media o1, Media o2) {
		
		if (o1.getCost() < o2.getCost()) return -1;
		if (o1.getCost() > o2.getCost()) return 1;
		
		int compStr = o1.getTitle().compareTo(o2.getTitle());
		if (compStr != 0) return (compStr < 0) ? -1 : 1;
		
		return 0;
	}

}
