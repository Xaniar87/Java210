import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String password;
	List<Playlist> pls=new ArrayList<>();
	public User(String name, String password) {
		 this.name=name;
		 this.password=password;
	 }
	public String getName() {
		return this.name;
	}
	public boolean attemptLogin(String password) {
		return password.equals(this.password);
	}
	public void addPlaylist(Playlist newPlaylist) {
		pls.add(newPlaylist);
	}
	public List<Playlist> getPlaylists() {
		return pls;
	}
	public void selectPlaylist(String name) {
		for (Playlist pl:pls) {
			if(pl.getName().equals(name)) {
				pl.play();
			}
		}
	}
	public String toString() {
		return this.name+", "+ pls.size() + " playlists "+password;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

}
