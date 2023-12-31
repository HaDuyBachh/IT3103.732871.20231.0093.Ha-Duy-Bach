package hust.soict.dsai.aims.media;

public class Disc extends Media {

	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		setDirector(director);
		setLength(length);
	}

	@Override
	public String Info() {
		String s = ((getTitle() == null) ? "" :"Tiêu đề: " + getTitle() + " - ") +
				((getCategory() == null) ? "" : "Thể loại: " + getCategory() + " - ") + 
				((getDirector() == null) ? "" : "Tác giả: " + getDirector() + " - ") +
				((getLength() == -1) ? "" : "Thời lượng " + getLength() + " - ") +
				((getCost() == -1) ? "" : "Giá: " + getCost() + "$");
		return s;
	}
}
