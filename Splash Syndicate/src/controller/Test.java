package controller;

import model.Game;
import model.Genre;

public class Test {
	
	public static void testGameClass(){
		//Para testear que los atributos de Game y la clae Genre funcionan
		Game game = new Game("lol","pc",Genre.STRATEGY, 2009, "riot");
		System.out.println(game.toString());
	}

}
