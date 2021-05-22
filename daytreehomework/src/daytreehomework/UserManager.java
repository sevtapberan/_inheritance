package daytreehomework;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.firstName + " kaydedildi.");
	}

	public void multipleAdd(User[] users) {
		for (User user : users) {
			addUser(user);

		}

	}

}
