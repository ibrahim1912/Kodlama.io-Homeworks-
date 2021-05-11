package eCommerseDemo.adapter;

import eCommerseDemo.google.GoogleUserManager;

public class GoogleUserAdapter implements UserCheckService {

	@Override
	public void verificationAccountToUser(String message) {
		GoogleUserManager userManager = new GoogleUserManager();
		userManager.verificationAccount(message);
	}

}
