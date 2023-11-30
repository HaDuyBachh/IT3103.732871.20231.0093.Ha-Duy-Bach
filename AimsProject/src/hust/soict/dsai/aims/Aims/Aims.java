package hust.soict.dsai.aims.Aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DVD;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

// Hà Duy Bách 20210093
public class Aims {

	public static void main(String[] args)
	{
		List <Media> media = new ArrayList<Media>();
		
		List<Track> tracks = new ArrayList<Track>();
		tracks.add(new Track("track1",10));
		tracks.add(new Track("track2",8));
		
		CompactDisc cd = new CompactDisc("album", "Music chill", 100, tracks);
		DVD dvd = new DVD("Human", "Romantic", "Even Jams", 120, 60);
		
		List<String> au = new ArrayList<String>();
		au.add("Athur");
		au.add("Ghether");
		Book book = new Book("NeverLand", "Gim", 100, au);
		
		media.add(cd);
		media.add(dvd);
		media.add(book);
		
		for (Media m : media)
		{
			System.out.println(m.Info());
			System.out.println("--------------------------------------------------");
		}
	}
}
