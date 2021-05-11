package eCommerseDemo.business.abstracts;

import eCommerseDemo.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void login(User user);
}
