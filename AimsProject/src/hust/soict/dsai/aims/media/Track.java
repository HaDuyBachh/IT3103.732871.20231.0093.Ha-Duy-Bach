package hust.soict.dsai.aims.media;

import javax.swing.JOptionPane;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable {
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Track(String title, int length) {
		super();
		setTitle(title);
		setLength(length);
	}

	@Override
	public void Play() throws PlayerException {
		
		if (length<=0) {
			throw new PlayerException("ERROR: Track length is non-positive!");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Playing track: " + this.getTitle() + "\n");
		sb.append("Track length: " + this.getLength() + "\n");
		JOptionPane.showMessageDialog(null, sb.toString(), "Play track", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
    public boolean equals(Object obj)
    {
		if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track otherTrack = (Track)obj;
		return otherTrack.getTitle() == getTitle() && otherTrack.getLength() == getLength();
    }
}
