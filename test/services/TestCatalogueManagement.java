package services;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import data.Catalogue;

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
	
	@Test
	public void isGameLoadedCorrectlyFalse() {
		Catalogue catalogue = new Catalogue();
		int numberOfLines = 0;
		
		Path path = Paths.get("src/resources/vgsales.csv");
		
		try {
			numberOfLines = (int) Files.lines(path).count();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		assertEquals(numberOfLines, catalogue.getMap().size());
	}
}