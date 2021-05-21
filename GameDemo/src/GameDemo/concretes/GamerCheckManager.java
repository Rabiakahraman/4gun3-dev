package GameDemo.concretes;

import GameDemo.abstracts.IGamerCheckService;
import GameDemo.entities.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
