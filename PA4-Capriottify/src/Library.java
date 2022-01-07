import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Song> lib=new ArrayList<>();
	public Library() {
		
	}
	
	public Song getSong(String title) {
		for (Song s:lib) {
			if(s.getTitle().equals(title)) {
				return s;
			}
		}
		return null;
	}
	public List<Song> getAllSongs(){
		 return lib;
	 }
	
	public void addSong(Song song) {
		lib.add(song);
		
	}
	public void removeSong(Song song) {
		lib.remove(song);
		
	}
	public String toString() {
		String str = null;
		for (Song s:lib) {
			str+=s.toString()+"\n";
		}
		return str;
	}

}
