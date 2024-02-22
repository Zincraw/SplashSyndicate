package services;

import java.util.Map;

import data.Catalogue;
import model.Game;
import model.Genre;
import utilities.ReadData;
import utilities.Validate;

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
	
	public void registerNewGame() {
		catalogue.registerNewGame(addNewGameData());
	}
	
	public Game addNewGameData() {
		Game game = new Game();
		
		game.setName(ReadData.readString("Whats the game's name?"));
		game.setPlatform(ReadData.readString("In which platform can be played?"));
	
		game.setGenre(chooseGenre());
		
		game.setYear(ReadData.valReadInt("Which year has launched?"));
		game.setPublisher(ReadData.readString("Which company published the game?"));
		
		return game;
	}
	
	private Genre chooseGenre() {
	    boolean isCorrectFormat = false;
	    Genre genre;
	    String value;
	    
	    do{
	    	value = ReadData.readString("What type of genre is it?Choose one of the following:"
	    			+"\"Action\\nAdventure\\nFighting\\nMisc\\nPlatform\\nPuzzle\\nRacing\\nRole_Playing\\nShooter\\nSimulation\\nSports\\nStrategy");
	        isCorrectFormat = Validate.valGenre(value);

	    }while(!isCorrectFormat);
	    
        genre = Genre.valueOf(value.toUpperCase());
        
	    return genre; 
	}
}