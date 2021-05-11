package eCommerseDemo.business.concretes;



import eCommerseDemo.business.abstracts.AuthService;
import eCommerseDemo.business.abstracts.UserService;
import eCommerseDemo.entities.concretes.User;

public class AuthManager implements AuthService {

	UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {    //simulasyon

		System.out.println("Dogruma mailine týklandý.Kayýt oluþturuldu : " + user.getFirstName());

	}

	@Override
	public void login(User user) {  //simulasyon

		System.out.println("Sisteme giriþ yaptýnýz");

	}

}
