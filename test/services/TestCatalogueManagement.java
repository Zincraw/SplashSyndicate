package services;

import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import data.Catalogue;

public class TestCatalogueManagement {
	
	@Test
	public void isGameLoadEqualsToCSVLinesPU01() {
		Catalogue catalogue = new Catalogue();
		int numberOfLines = 0;
		
		Path path = Paths.get("src/resources/vgsales.csv");
		
		try {
			numberOfLines = (int) Files.lines(path).count();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//if ((numberOfLines + 1) == catalogue.getMap().size())) System.out.println("asfdasf");
		assertEquals(numberOfLines + 1, catalogue.getMap().size());
	}
}
