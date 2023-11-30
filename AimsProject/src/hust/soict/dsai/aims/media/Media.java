package hust.soict.dsai.aims.media;

public abstract class Media{
	private long id;
	private String title;
	private String category;
	private float cost;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media(String title, String category, float cost) 
	{
		super();
		setTitle(title);
		setCategory(category);
		setCost(cost);
	}
	
	//In ra thông tin sản phẩm
	public abstract String Info();
	
	@Override
    public boolean equals(Object obj)
    {
		if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
		Media otherMedia = (Media)obj;
		return otherMedia.getTitle() == getTitle();
    }

}
