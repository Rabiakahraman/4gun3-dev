package GameDemo.concretes;

import GameDemo.abstracts.IGameService;
import GameDemo.entities.Game;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName() + " OYUN ismi veritaban�na eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "OYUN ismiveritaban�ndan silindi");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() + "OYUN ismi veritaban�nda g�ncellendi");
		
	}

	@Override
	public void AddMultiple(Game[] game) {
		for (Game game2 : game) {
			Add(game2);
		}
		
	}

}
