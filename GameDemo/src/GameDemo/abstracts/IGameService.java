package GameDemo.abstracts;

import GameDemo.entities.Game;

public interface IGameService {
	
	void Add(Game game);
	void delete(Game game);
	void Update(Game game);
	void AddMultiple(Game[] game);
	

}
