package Business.Concrete;

import Business.Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {

		System.out.println("Oyun Sisteme Eklendi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun G�ncellendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Sistemden Silindi: " + game.getGameName());
		
	}

}
