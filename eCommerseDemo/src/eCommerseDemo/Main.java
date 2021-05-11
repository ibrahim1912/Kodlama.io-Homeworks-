package eCommerseDemo;


import eCommerseDemo.adapter.GoogleUserAdapter;
import eCommerseDemo.business.abstracts.AuthService;
import eCommerseDemo.business.abstracts.UserService;
import eCommerseDemo.business.concretes.AuthManager;
import eCommerseDemo.business.concretes.UserManager;
import eCommerseDemo.dataAccess.concretes.InMemoryUserDao;
import eCommerseDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Ýbrahim", "Kaplan", "ii@ii.com", "t121261");
		User user2 = new User(2, "Ýqq", "Kqq", "ii@com", "1223232");
		

		UserService userManager = new UserManager(new InMemoryUserDao(),new GoogleUserAdapter()); 
		//AuthService authManager = new AuthManager( new UserManager(new InMemoryUserDao(),new GoogleUserAdapter()));
		
		
		
		userManager.add(user);
		userManager.add(user2);
		//authManager.register(user);
		//authManager.login(user);
		
		
		

	}
}