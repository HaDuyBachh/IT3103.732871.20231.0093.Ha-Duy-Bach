// Hà Duy Bách 20210093
public class DVD {
	
	//Khởi tạo DVD
	public DVD(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DVD(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	private String title = null;
	private String category = null;
	private String director = null;
	private int length = -1;
	private float cost = -1;
	
	//Các biến Getter & Setter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLenght() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	//Thông tin của DVD
	public String Info()
	{
		return ((title == null) ? "" :"Tiêu đề: " + title + " |") +
		((category == null) ? "" : "Thể loại: " + category + " |") + 
		((director == null) ? "" : "Tác giả: " + director + '|') +
		((length == -1) ? "" : "Thời lượng " + length + " |") +
		((cost == -1) ? "" : "Giá: " + cost);	
	}
	
}
