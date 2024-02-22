package services;

import java.util.Map;

import data.Catalogue;
import model.Game;

public class CatalogueManagement {
	
	private Catalogue catalogue;
	
	public CatalogueManagement() {
		catalogue = new Catalogue();
	}
	
	public void printAllCatalogue(){
		Map<Integer, Game> catalogueMap = this.catalogue.getMap();
		for(Map.Entry<Integer, Game> map : catalogueMap.entrySet()) {
			Game game = map.getValue();	

			System.out.println("********************************");
			System.out.println("Name: " + game.getName());
			System.out.println("Platform " + game.getPlatform());
			System.out.println("Year: " + game.getYear());
			System.out.println("Genre: " + game.getGenre().getGenre());
			System.out.println("Publisher: " + game.getPublisher());
			System.out.println("********************************");
		}
	}

	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

	@Override
	public String toString() {
		return "CatalogueManagement [catalogue=" + catalogue + "]";
	}
	
}