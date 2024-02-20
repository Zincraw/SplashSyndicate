package GUI;

import java.util.Scanner;

public class Menu {
	@SuppressWarnings("resource")
	public void start() {
		
		int option;
		
		do 
		{
			System.out.println("=== Splash Syndicate ===");
            System.out.println("1) List all our games!");
            System.out.println("2) Add a new game!");
            System.out.println("3) List games by desired platform!");
            System.out.println("4) List games by desired company!");
            System.out.println("5) List all publishers!");
            System.out.println("6) List all retro games!");
            System.out.println("7) List all games by genre");
            System.out.println("8) List games by odd years!");
            System.out.println("0) Exit");
            System.out.println("Choose an option");
            
            option = new Scanner(System.in).nextInt();
            
            switch (option) {
	            case 1:
	                timeLapseForAnswer();
	                break;
	            case 2:
	            	timeLapseForAnswer();
	                break;
	            case 3:
	            	timeLapseForAnswer();
	            	break;
	            case 4:
	            	timeLapseForAnswer();
	                break;
	            case 5:
	            	timeLapseForAnswer();
	                break;
	            case 6:
	            	timeLapseForAnswer();
	                break;
	            case 7:
	                break;
	            case 8:
	            	timeLapseForAnswer();
	                break;
	            case 0:
	                System.out.println("See you next time!");
	                break;
	            default:
	                System.out.println("ERROR. Try again");
	                break;
            }
		} while (option != 0);
	}
	@SuppressWarnings("resource")
	public static void timeLapseForAnswer() {
        System.out.println("\n\nPress any key to continue");
        
        new Scanner(System.in).nextLine();
	}
}
