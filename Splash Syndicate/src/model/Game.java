package model;

public class Game {
	private String name;
	private String platform;
	private Genre genre;
	private int year;
	private String publisher;
	
	public Game() {
		
	}
	
	public Game(String name, String platform,Genre genre, int year, String publisher) {
		super();
		this.name = name;
		this.platform = platform;
		this.genre = genre;
		this.year = year;
		this.publisher = publisher;
	}	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "Game [name=" + name + ", platform=" + platform + ", genre=" + genre.getGenre()
		+ ", year=" + year + ", publisher="
				+ publisher + "]";
	}

}
