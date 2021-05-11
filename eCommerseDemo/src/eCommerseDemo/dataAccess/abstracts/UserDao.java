package eCommerseDemo.dataAccess.abstracts;

import java.util.List;

import eCommerseDemo.entities.concretes.User;



public interface UserDao {

	void add(User user);
	void delete(User user);
	void update(User user);
	User getByEmail(String email);
	List<User> getAll();

}
