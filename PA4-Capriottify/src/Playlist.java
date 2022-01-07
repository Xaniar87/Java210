import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {

	private String name;
	List<Song> pl=new ArrayList<>();
	
	public Playlist(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void addSong(Song song) {
		pl.add(song);
	}
	public void play() {
		for (Song s:pl) {
			s.play();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(pl);
	}
	public void removeSong(Song song) {
		pl.remove(song);
	}
}
