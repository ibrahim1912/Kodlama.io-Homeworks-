package eCommerseDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerseDemo.dataAccess.abstracts.UserDao;
import eCommerseDemo.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);

	}

	@Override
	public void delete(User user) {
		User userToDelete = null;
		for (User userr : users) {

			if (user.getId() == userr.getId()) {
				userToDelete = userr;
			}
		}
		users.remove(userToDelete);

	}

	@Override
	public void update(User user) {
		User userToUpdate = null;
		for (User userr : users) {

			if (user.getId() == userr.getId()) {
				userToUpdate = userr;
			}

			userToUpdate.setFirstName(user.getFirstName());
			userToUpdate.setLastName(user.getLastName());
			userToUpdate.setEmail(user.getEmail());
			userToUpdate.setPassword(user.getPassword());
		}

	}

	@Override
	public List<User> getAll() {

		return users;
	}

	@Override
	public User getByEmail(String email) {

		for (User user : users) {
			if (user.getEmail() == email)
				return user;
		}
		return null;
	}

}
