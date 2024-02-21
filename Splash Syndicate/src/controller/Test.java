package controller;

import java.util.Map;

import data.Catalogue;
import model.Game;
import model.Genre;

public class Test {
	
	public static void testGameClass(){
		//Para testear que los atributos de Game y la clae Genre funcionan
		Game game = new Game("lol","pc",Genre.STRATEGY,2009,  "riot");
		System.out.println(game.toString());
	}
	
	public static void testCatalogueClass() {
		Catalogue cat = new Catalogue();
		for(Map.Entry<Integer, Game> entry : cat.getMap().entrySet()) {
			Integer gameId = entry.getKey();
			Game game = entry.getValue();
			System.out.println("ID: [" + gameId + "] \nGame: " + game);
		}
	}
}
