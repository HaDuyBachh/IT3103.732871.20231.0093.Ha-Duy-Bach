package hust.soict.dsai.aims.media;

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

	public Track() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
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
