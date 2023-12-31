package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import hust.soict.dsai.aims.exception.PlayerException;

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

	public CompactDisc(String title, String category, float cost, List<Track> track) {
		super(title, category, cost);
		setTracks(track);
	}
	
	public CompactDisc(String title, String category, String artist,  float cost) {
		super(title, category, cost);
		this.artist = artist;
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
	public void Play() throws PlayerException {
		StringBuilder sb = new StringBuilder();

		if (getLength() <= 0) {
			throw new PlayerException("ERROR: CD length is non-positive!");
		} else {
			sb.append("Playing CD: " + this.getTitle() + (this.getArtist().equals("") ? "" : " by " + this.getArtist())
					+ "\n");
			sb.append("CD total length: " + this.getLength() + "\n");
			JOptionPane.showMessageDialog(null, sb.toString(), "Play CD", JOptionPane.INFORMATION_MESSAGE);
			for (Track t : tracks) {
				t.Play();
			}
		}
	}

	@Override
	public String Info() {
		String s = ((getTitle() == null) ? "" :"Tiêu đề: " + getTitle() + " - ") +
				((getCategory() == null) ? "" : "Thể loại: " + getCategory() + " - ") + 
				((getLength() == -1) ? "" : "Thời lượng " + getLength() + " - ") +
				((getCost() == -1) ? "" : "Giá: " + getCost() + "$ - Bao gồm các bản nhạc:\n");
		for (Track track : tracks)
		{
			s += track.getTitle() + ", ";
		}
		
		return s;
	}
	
	@Override
	public String toString() {
		return String.format("CD - %s - %s - %s - %dm. : %.2f $", getTitle(), getCategory(), artist, getLength(), getCost())
				.replaceAll(" null | 0 ", " Unknown ");
	}
}
