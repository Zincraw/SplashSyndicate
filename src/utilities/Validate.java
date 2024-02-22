package utilities;

import java.util.HashMap;
import java.util.InputMismatchException;

import model.Game;
import model.Genre;

public class Validate {
	
	public boolean valGenre(String valor) {
		boolean isValidGenre = false;
		try {
			for (Genre i: Genre.values()) {
				if (i.name().equals(valor.toUpperCase())) {
					isValidGenre = true;
					break;
				}
			}
			return isValidGenre;
		} catch (InputMismatchException ex) {
			System.out.println("Put a correct Genre");
			return valGenre(ReadData.readString());
		}
	}
}
