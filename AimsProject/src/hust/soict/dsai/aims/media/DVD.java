package hust.soict.dsai.aims.media;

// Hà Duy Bách 20210093
public class DVD extends Media {
	
	//Khởi tạo DVD
	public DVD(String title, String category, String director, int length, float cost) {
		super();
		setTitle(title);
		setCategory(category);
		this.director = director;
		this.length = length;
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
		this.director = director;
		this.length = length;
		setCost(cost);
	}

	private String director = null;
	private int length = -1;

	private static long nbDigitalVideoDiscs = 0;
	
	//Các biến Getter & Setter
	public String getDirector() {
		return director;
	}
	public int getLenght() {
		return length;
	}
	
	//Thông tin của DVD
	public String Info()
	{
		return ((getTitle() == null) ? "" :"Tiêu đề: " + getTitle() + " - ") +
		((getCategory() == null) ? "" : "Thể loại: " + getCategory() + " - ") + 
		((director == null) ? "" : "Tác giả: " + director + " - ") +
		((length == -1) ? "" : "Thời lượng " + length + " - ") +
		((getCost() == -1) ? "" : "Giá: " + getCost() + "$");	
	}
	
}
