package eCommerseDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerseDemo.adapter.UserCheckService;
import eCommerseDemo.business.abstracts.UserService;
import eCommerseDemo.dataAccess.abstracts.UserDao;
import eCommerseDemo.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	UserCheckService checkService;

	public UserManager(UserDao userDao, UserCheckService checkService) {
		super();
		this.userDao = userDao;
		this.checkService = checkService;
	}

	@Override
	public void add(User user) {

		if (!(validationUser(user))) {
			return;
		}

		userDao.add(user);
		this.checkService.verificationAccountToUser(user.getFirstName());

		System.out.println("Kullanıcı dogrulama maili gönderiliyor: " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getall() {

		return userDao.getAll();
	}

	@Override
	public User getByEmail(String email) {

		return userDao.getByEmail(email);
	}

	// business rules

	private boolean validationUser(User user) {
		if (!((firstNameControl(user) && lastNameControl(user)) && checkIfEmailExist(user.getEmail())
				&& emailControl(user) && (passwordControl(user)))) {

			return false;
		}
		return true;
	}

	private boolean passwordControl(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Şifre en ez 6 harfli olmalıdır");
			return false;
		}
		return true;

	}

	private boolean emailControl(User user) {

		if (validateEmailAddress(user.getEmail()) == false) {
			System.out.println("Hatalı email yazımı");
			return false;
		}
		return true;
	}

	private boolean firstNameControl(User user) {

		if (user.getFirstName().length() < 3) {
			System.out.println("Kullanıcı adı 2 harften fazla olmalıdır");
			return false;
		}
		return true;

	}

	private boolean lastNameControl(User user) {

		if (user.getLastName().length() < 3) {
			System.out.println("Kullanıcı soyadı 2 harften fazla olmalıdır");
			return false;
		}
		return true;

	}

	private List<String> getEmails() {
		List<User> users = userDao.getAll();
		List<String> emails = new ArrayList<String>();
		for (User user : users) {
			emails.add(user.getEmail());
		}
		return emails;
	}

	private boolean checkIfEmailExist(String email) {
		List<String> emails = this.getEmails();
		for (String string : emails) {
			if (string.equals(email)) {
				System.out.println("Bu email ile daha önce kayıt olunmuştur.");
				return false;
			}
		}
		return true;
	}

	// regex codes

	private static Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[com]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private boolean validateEmailAddress(String email) {
		final Matcher matcher = EMAIL_REGEX.matcher(email);
		return matcher.matches();
	}

}
