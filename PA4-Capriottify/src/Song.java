
public class Song {
	private String title;
	private String artist;
	private int timesPlayed=0;
	
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
	}

	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public int getTimesPlayed() {
		return timesPlayed;
		
	}
	public void play() {
		timesPlayed++;
		System.out.println(toString());
	}
	public String toString() {
		return title+" by "+artist+", "+timesPlayed+"play(s)";
		
	}
}
