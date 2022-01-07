import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserCollection {
	List<User> users=new ArrayList<>();
	public UserCollection() {
		 
	}
	public boolean userExists(String username) {
		for (User user:users) {
			if(user.getName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	public User login(String name, String pass) {
		for (User user:users) {
			if(user.getName().equals(name)) {
				if(user.attemptLogin(pass)) {
					return user;
				}
			}
		}
		return null;
	}

	public void addUser(User toAdd) {
		users.add(toAdd);
	}
	public String toString() {
		HashMap<String,String> map=new HashMap<>();
		for (User user:users) {
			map.put(user.getName(),user.toString());
		}
		return map.toString();
	}

}
