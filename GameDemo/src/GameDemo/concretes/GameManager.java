package GameDemo.concretes;

import GameDemo.abstracts.IGameService;
import GameDemo.entities.Game;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getGameName() + " OYUN ismi veritabanına eklendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "OYUN ismiveritabanından silindi");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() + "OYUN ismi veritabanında güncellendi");
		
	}

	@Override
	public void AddMultiple(Game[] game) {
		for (Game game2 : game) {
			Add(game2);
		}
		
	}

}
