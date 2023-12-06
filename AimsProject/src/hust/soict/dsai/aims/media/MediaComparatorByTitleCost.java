package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}

	@Override
	///Sắp xếp theo tiêu đề, nếu tiêu đề bằng nhau thì xét đến giá
	public int compare(Media o1, Media o2) {
		
		int compStr = (o1.getTitle().compareTo(o2.getTitle()));
		if (compStr != 0) return (compStr < 0) ? -1 : 1;
		
		if (o1.getCost() < o2.getCost()) return -1;
		if (o1.getCost() > o2.getCost()) return 1;
		
		return 0;
	}

}
