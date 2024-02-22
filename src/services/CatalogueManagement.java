package services;

import data.Catalogue;
import model.Game;
import model.Genre;
import utilities.ReadData;
//import utilities.Validate;

public class CatalogueManagement {
	
	private Catalogue catalogue;
	
	public CatalogueManagement() {
		catalogue = new Catalogue();
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
	
	public Game addNewGameData() {
		Game game = new Game();
		
		game.setName(ReadData.readString("Whats the game's name?"));
		game.setPlatform(ReadData.readString("In which platform can be played?"));
		
		ReadData.readString("What type of genre is it?Choose one of the following:");
		game.setGenre(chooseGenre(ReadData.readString("What type of genre is it?Choose one of the following:")));
		
		game.setYear(ReadData.valReadInt("Which year has launched?"));
		game.setPublisher(ReadData.readString("Which company published the game?"));
		
		return game;
	}
	
	private Genre chooseGenre(String genreName) {
	    boolean isCorrectFormat = false;
	    Genre genre;
	    
	    do{
	        //isCorrectFormat = !Validate.ValGenre(genreName));
	        genre = Genre.valueOf(genreName.toUpperCase());

	    }while(!isCorrectFormat);
	    
	    return genre; 
	}
}