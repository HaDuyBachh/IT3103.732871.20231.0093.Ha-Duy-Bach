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
		this.id =  nbDigitalVideoDiscs++;
	}
	public DVD(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id =  nbDigitalVideoDiscs++;
	}
	public DVD(String title)
	{
		super();
		this.title = title;
		this.id =  nbDigitalVideoDiscs++;
	}

	private String title = null;
	private String category = null;
	private String director = null;
	private int length = -1;
	private float cost = -1;
	private long id;
	private static long nbDigitalVideoDiscs = 0;
	
	//Các biến Getter & Setter
	public long getId()
	{
		return id;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
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
		return ((title == null) ? "" :"Tiêu đề: " + title + " - ") +
		((category == null) ? "" : "Thể loại: " + category + " - ") + 
		((director == null) ? "" : "Tác giả: " + director + " - ") +
		((length == -1) ? "" : "Thời lượng " + length + " - ") +
		((cost == -1) ? "" : "Giá: " + cost + "$");	
	}
	
}
