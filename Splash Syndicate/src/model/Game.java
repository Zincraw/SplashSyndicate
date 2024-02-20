package model;

import java.util.Objects;

public class Game {
	private String name, platform, genre, publisher;
	private int year;
	
	public Game() {
	}
	
	public Game(String name, String platform, String genre, String publisher, int year) {
		this.name = name;
		this.platform = platform;
		this.genre = genre;
		this.publisher = publisher;
		this.year = year;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, name, platform, publisher, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(name, other.name)
				&& Objects.equals(platform, other.platform) && Objects.equals(publisher, other.publisher)
				&& year == other.year;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", platform=" + platform + ", genre=" + genre + ", publisher=" + publisher
				+ ", year=" + year + "]";
	}
}
