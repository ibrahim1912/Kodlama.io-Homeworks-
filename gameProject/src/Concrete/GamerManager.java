package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	UserValidationService userValidationService;
	
	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.validation(gamer)) {
			System.out.println("Kay�t olundu " + gamer.getFirstName());
		}else {
			System.out.println("Kay�t ba�ar�s�z");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kay�t silindi");  // sim�lasyon
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kay�t g�ncellendi");
		
	}

}
