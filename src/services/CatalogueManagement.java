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
	
	public void filterGamesByGenre() {
		Map<Integer, Game> catalogueMap = this.catalogue.getData();
		for(Map.Entry<Integer, Game> map : catalogueMap.entrySet()) {
			Game game = map.getValue();
			if(game.getGenre().equals(Genre.PLATFORM)) {
				System.out.println("Name: " + game.getName());
				System.out.println("Platform " + game.getPlatform());
				System.out.println("Year: " + game.getYear());
				System.out.println("Genre: " + game.getGenre().getGenre());
				System.out.println("Publisher: " + game.getPublisher());
				System.out.println("********************************");
			}
		}
	}

	public void filterGamesByPlatform() {
		Map<Integer, Game> catalogueMap = this.catalogue.getData();
		String[] nintendoPlatforms = {"3DS", "N64", "GBA", "GB", "GC", "DS", "WiiU", "Wii", "NES", "SNES", "NG"};
		
		for(Map.Entry<Integer, Game> map : catalogueMap.entrySet()) {
			Game game = map.getValue();
			
			for(String platform : nintendoPlatforms) {
				
				if(game.getPlatform().equals(platform)) {
					System.out.println("Name: " + game.getName());
					System.out.println("Platform " + game.getPlatform() + " from Nintendo");
					System.out.println("********************************");
				}
			}
		}
	}
	
	public void printAllCatalogue(){
		Map<Integer, Game> catalogueMap = this.catalogue.getMap();
		for(Map.Entry<Integer, Game> map : catalogueMap.entrySet()) {
			Game game = map.getValue();	

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
		
		boolean isGameExisting = true;
		String gameName ="";
		while(isGameExisting) {
			gameName = ReadData.readString("What's the game's name?");
			isGameExisting = Validate.isGameExisting(catalogue, gameName);
			if(isGameExisting) {
				System.out.println("Game already exists.");
			}
		}
		game.setName(gameName);
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
	    	value = ReadData.readString("What type of genre is it?\n\nChoose one of the following: \n"
	    			+"[Action]  [Adventure] [Fighting] [Misc] [Platform] [Puzzle] [Racing] [Role_Playing] [Shooter] [Simulation] [Sports] [Strategy]");
	        isCorrectFormat = Validate.valGenre(value);

	    }while(!isCorrectFormat);
	    
        genre = Genre.valueOf(value.toUpperCase());
        
	    return genre; 
	}
}