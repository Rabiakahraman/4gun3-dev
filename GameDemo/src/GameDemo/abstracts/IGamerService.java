package GameDemo.abstracts;

import GameDemo.entities.Gamer;

public interface IGamerService {
	
	void Add(Gamer gamer);
	void Update(Gamer gamer);
	void Delete(Gamer gamer);

}
