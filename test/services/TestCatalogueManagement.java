package services;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import data.Catalogue;
import model.Game;
import model.Genre;

public class TestCatalogueManagement {
	
	@Test
	public void isGameLoadedCorrectlyTrue() {

		Catalogue catalogue = new Catalogue();
		int numberOfLines = 0;
		
		Path path = Paths.get("src/resources/vgsales.csv");
		
		try {
			numberOfLines = (int) Files.lines(path).count();
		} catch(Exception e) {
			e.printStackTrace();
		}
		assertEquals(numberOfLines, catalogue.getMap().size() + 1);
	}
	
	//Simulation of unit test which returns false
//	@Test
//	public void isGameLoadedCorrectlyFalse() {
//		Catalogue catalogue = new Catalogue();
//		int numberOfLines = 0;
//		
//		Path path = Paths.get("src/resources/vgsales.csv");
//		
//		try {
//			numberOfLines = (int) Files.lines(path).count();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		assertEquals(numberOfLines, catalogue.getMap().size());
//	}
	
	@Test
	public void isPrintAllCatalogueCorrectlyTrue() {
		CatalogueManagement catalogueManagement = new CatalogueManagement();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream ();
		
		System.setOut(new PrintStream(outContent));
		catalogueManagement.printAllCatalogue();		

		int printedGamesCount = outContent.toString().split("\n").length / 6;
		int CatalogueGamesCount = catalogueManagement.getCatalogue().getData().size();
		assertEquals(printedGamesCount, CatalogueGamesCount );
	}
	
	@Test
	public void isExistedGameDeniedTrue() {
		CatalogueManagement catalogueManagement = new CatalogueManagement();
		Catalogue catalogue = catalogueManagement.getCatalogue();
		Genre action = Genre.ACTION;
				
		Game gameTest = new Game("lol", "PC", action, 2009, "Riot");
		catalogue.registerNewGame(gameTest);
		int CatalogueGamesCount = catalogue.getData().size();
		
		catalogueManagement.registerNewGame();
		int NewCatalogueGamesCount = catalogue.getData().size();
		
		assertEquals(CatalogueGamesCount, NewCatalogueGamesCount );
	}
	
	@Test
	public void isGameSuccesfullyAdded() {
		CatalogueManagement catalogueManagement = new CatalogueManagement();
		
		catalogueManagement.registerNewGame();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream ();
		
		System.setOut(new PrintStream(outContent));
		catalogueManagement.printAllCatalogue();		

		int printedGamesCount = outContent.toString().split("\n").length / 6;
		int CatalogueGamesCount = catalogueManagement.getCatalogue().getData().size();
		assertEquals(printedGamesCount, CatalogueGamesCount );
	}
	
}