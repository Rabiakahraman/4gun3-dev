package GameDemo.concretes;

import GameDemo.abstracts.IGamerService;
import GameDemo.entities.Gamer;

public class GamerManager implements IGamerService  {


	
	public GamerManager(GamerCheckManager gamerCheckManager) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void Add(Gamer gamer) {
		System.out.println("kay�t olundu");
		
	}

	@Override
	public void Update(Gamer gamer) {
	   System.out.println("kay�t g�ncellendi");
		
	}

	@Override
	public void Delete(Gamer gamer) {
	    System.out.println("kay�t silindi");
		
	}




		
	


}
