package com.richer.main;

public class Main {
	
	public static void main(String[] args) {
		Game game = Game.getInstance();
		game.init();
		game.run();
		game.term();
		
	}

}
