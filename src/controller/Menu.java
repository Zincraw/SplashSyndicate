package controller;

import services.CatalogueManagement;
import utilities.ReadData;

public class Menu {
	
	private CatalogueManagement catalogueManagement = new CatalogueManagement();
	
	public Menu() {
		
	}
	
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
            
            option = ReadData.valReadInt("Choose an option");
            
            switch (option) {
	            case 1:
	                printCatalogue();
	                break;
	            case 2:
	            	registerNewGame();
	                break;
	            case 3:
	            	filterGamesByGenre();
	            	break;
	            case 4:
	            	filterGamesByPlatform();
	                break;
	            case 5:
	            	filterGamesByPublisher();
	                break;
	            case 6:
	            	filterGamesByXXCentury();
	                break;
	            case 7:

	            	break;
	            case 8:
	            	filterGamesByOddYear();
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

	public CatalogueManagement getCatalogueManagement() {
		return catalogueManagement;
	}

	public void setCatalogueManagement(CatalogueManagement catalogueManagement) {
		this.catalogueManagement = catalogueManagement;
	}

	@Override
	public String toString() {
		return "Menu [catalogueManagement=" + catalogueManagement + "]";
	}
	
	public void printCatalogue() {
		catalogueManagement.printAllCatalogue();
		start();
	}
	
	public void registerNewGame() {
		catalogueManagement.registerNewGame();
		System.out.println("Game added successfully!");
	}
	
	public void filterGamesByPublisher () {
		catalogueManagement.filterGamesByPublisher();
	}
	
	public void filterGamesByGenre() {
		catalogueManagement.filterGamesByGenre();
	}
	
	public void filterGamesByPlatform() {
		catalogueManagement.filterGamesByPlatform();
	}
	
	public void filterGamesByXXCentury() {
		catalogueManagement.filterGamesByXXCentury();
	}
	
	public void filterGamesByOddYear() {
		catalogueManagement.filterGamesByOddYear();
	}

}
