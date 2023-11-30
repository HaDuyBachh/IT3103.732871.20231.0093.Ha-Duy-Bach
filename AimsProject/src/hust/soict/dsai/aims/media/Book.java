package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<String> authors = new ArrayList<String>();
	
	public Book()
	{
		super();
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
	
}
