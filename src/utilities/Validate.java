package utilities;

import java.util.InputMismatchException;
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
}
