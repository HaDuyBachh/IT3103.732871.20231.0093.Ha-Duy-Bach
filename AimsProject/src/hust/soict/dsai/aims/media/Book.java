package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost, List<String> authors)
	{
		super(title, category, cost);
		setAuthors(authors);
	}
	
	public Book(String title, String category, float cost)
	{
		super(title, category, cost);
	}
	
	//Getter & Setter
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	//Thêm tác giả
	public boolean addAuthor(String au)
	{
		if (authors.contains(au)) return false;
		authors.add(au);
		return true;
	}
	
	//Xóa tác giả
	public boolean removeAuthor(String au)
	{
		if (!authors.contains(au)) return false;
		authors.remove(au);
		return true;
	}

	@Override
	public String Info() {
		String s = ((getTitle() == null) ? "" :"Tiêu đề: " + getTitle() + " - ") +
		((getCategory() == null) ? "" : "Thể loại: " + getCategory() + " - ") + 
		((getCost() == -1) ? "" : "Giá: " + getCost() + "$ - Các Tác giả: ");	
		
		for (String author : authors)
		{
			s += author + ", ";
		}
		
		return s;
	}
	
	@Override
	public String toString() {
		return String
				.format("Book - %s - %s - %s : %.2f $", getTitle(), getCategory(),
						authors.isEmpty() ? "Unknown" : String.join(", ", authors), getCost())
				.replaceAll(" null | 0 ", " Unknown ");
	}
	
}
