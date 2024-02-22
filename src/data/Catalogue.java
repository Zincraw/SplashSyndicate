package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.io.BufferedReader;

import model.Game;
import model.Genre;

public class Catalogue {
	private Map<Integer, Game> map = new HashMap<Integer, Game>();
	
	public Catalogue() {
		createCatalogue();
	}
	
	public Map<Integer, Game> getMap(){
		return map;
	}
	
	public void createCatalogue(){		
		try (BufferedReader reader = new BufferedReader(new FileReader("src/resources/vgsales.csv")))
		{
			reader.readLine();
			String line;
			while((line = reader.readLine()) != null) {
				
	            String[] gameDataSplitted = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				String name = gameDataSplitted[1];
				String platform = gameDataSplitted[2];
	            int year = gameDataSplitted[3].equalsIgnoreCase("N/A") ? -1 : Integer.parseInt(gameDataSplitted[3]);
				String genreValue = gameDataSplitted[4].replace("-", "_");
				Genre genre = Genre.valueOf(genreValue.toUpperCase());
				String publisher = gameDataSplitted[5];
				
				Game game = new Game(name, platform, genre, year, publisher);
				map.put(generateId(), game);
			}
			
		} catch (FileNotFoundException e) {
		
			System.out.println("CSV File not found");
			
		} catch (@SuppressWarnings("hiding") IOException e) {

			System.out.println("Error reading data: " + e.getMessage());
		
		}
	}
	
	public void registerNewGame(Game game) {
		map.put(generateId(),game);
	}
	
	private int generateId() {
		Random rnd = new Random();
		int newId;
		
		do {
			
			newId = rnd.nextInt(Integer.MAX_VALUE);
			
		} while(map.containsKey(newId++));
		
		return newId;
	}
	
	public Map<Integer, Game> getData() {
		return getMap();
	}
}
