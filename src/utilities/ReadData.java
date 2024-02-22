package utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadData {
	@SuppressWarnings("resource")
	public static int readInt() {
		return new Scanner(System.in).nextInt();
	}

	public static int readInt(String msj) {
		System.out.println(msj);
		return readInt();
	}

	@SuppressWarnings("resource")
	public static String readString() {
		return new Scanner(System.in).nextLine();
	}

	public static String readString(String msj) {
		System.out.println(msj);
		return readString();
	}

	public static int valReadInt() {
		int option = 0;
		try {
			option = readInt();
			return option;
		} catch (InputMismatchException ex) {
			System.out.println("You must put a integer number. Try again");
			return valReadInt();
		}
	}
	
	public static String valReadString() {
		String data = "";
		try {
			data = readString();
			return data;
		} catch (InputMismatchException ex) {
			System.out.println("You must put a String. Try again");
			return valReadString();
		}
	}
}
