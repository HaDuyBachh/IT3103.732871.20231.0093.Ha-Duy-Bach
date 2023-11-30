package hust.soict.dsai.aims.media;

// Hà Duy Bách 20210093
public class DVD extends Disc implements Playable {
	
	//Khởi tạo DVD
	public DVD(String title, String category, String director, int length, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		setDirector(director);
		setLength(length);
		setCost(cost);
		setId(nbDigitalVideoDiscs++);
	}
	public DVD(String title, String category, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		setCost(cost);
		setId(nbDigitalVideoDiscs++);
	}
	public DVD(String title)
	{
		super();
		setTitle(title);
		setId(nbDigitalVideoDiscs++);
	}
	
	public void setDVD(String title, String category, String director, int length, float cost) {
		setTitle(title);
		setCategory(category);
		setDirector(director);
		setLength(length);
		setCost(cost);
	}

	private static long nbDigitalVideoDiscs = 0;

	//Thông tin của DVD
	@Override
	public String Info()
	{
		return ((getTitle() == null) ? "" :"Tiêu đề: " + getTitle() + " - ") +
		((getCategory() == null) ? "" : "Thể loại: " + getCategory() + " - ") + 
		((getDirector() == null) ? "" : "Tác giả: " + getDirector() + " - ") +
		((getLength() == -1) ? "" : "Thời lượng " + getLength() + " - ") +
		((getCost() == -1) ? "" : "Giá: " + getCost() + "$");	
	}
	
	@Override
	public void Play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
