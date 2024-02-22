package model;

public enum Genre {

	ACTION("Action"),
	ADVENTURE("Adventure"),
	FIGHTING("Fighting"),
	MISC("Misc"),
	PLATFORM("Platform"),
	PUZZLE("Puzzle"),
	RACING("Racing"),
	ROLE_PLAYING("Role-Playing"),
	SHOOTER("Shooter"),
	SIMULATION("Simulation"),
	SPORTS("Sports"),
	STRATEGY("Strategy");
	
	private final String genre;
	
	Genre(String genre) {
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
}