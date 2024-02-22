package utilities;

import java.util.Map;

import data.Catalogue;
import model.Game;
import model.Genre;

public class Validate {
	
	public static boolean valGenre(String valor) {
		boolean isValidGenre = false;
		
		for (Genre i: Genre.values()) {
			if (i.name().equals(valor.toUpperCase())) {
				isValidGenre = true;
				break;
				}
			}
		if(!isValidGenre) {
			System.out.println("Put a correct Genre");
		}
		return isValidGenre;
	}
	
	public static boolean isGameExisting(Catalogue catalogue, String gameName) {
		boolean isGameExisting = false;
		Map<Integer, Game> c = catalogue.getData();
		
		for(Map.Entry<Integer, Game> map : c.entrySet()) {
			if(map.getValue().getName().equals(gameName)) {
				isGameExisting = true;
			}
		}
		return isGameExisting;
	}
}
