package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media implements Playable {

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	//Getters & Setters
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public CompactDisc() {
		super();
	}
	
	//thêm track vào đĩa
	public boolean addTrack(Track track)
	{
		if (tracks.contains(track)) return false;
		tracks.add(track);
		return true;
	}
	
	//Xóa track ra khỏi đĩa
	public boolean removeTrack(Track track)
	{
		if (!tracks.contains(track)) return false;
		tracks.remove(track);
		return true;
	}
	
	//Lấy tổng thời gian các đĩa CD
	public int getLength()
	{
		int sum = 0;
		for (Track track : tracks) {
			sum += track.getLength();
		}
		return sum;
	}

	@Override
	public void Play() {
		for (Track track : tracks)
		{
			System.out.println("Playing DVD: " + track.getTitle());
			System.out.println("DVD length: " + track.getLength());
		}
	}

	@Override
	public String Info() {
		// TODO Auto-generated method stub
		return "";
	}
}
