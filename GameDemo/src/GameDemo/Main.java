package GameDemo;

import GameDemo.concretes.GamerCheckManager;
import GameDemo.concretes.GamerManager;
import GameDemo.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.Add(new Gamer(1,"rabia","korknaz","1242433",null));
		
      }
}	
		