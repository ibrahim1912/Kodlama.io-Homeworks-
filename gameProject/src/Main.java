import Adapter.MernisServiceAdapter;
import Concrete.GamerManager;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setBirthYear(1992);
		gamer.setFirstName("Ýbrahim");
		gamer.setLastName("Kaplan");
		gamer.setIdentityNumber("12121212");
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);

	}

}
