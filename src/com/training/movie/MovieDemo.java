package com.training.movie;

public class MovieDemo {
	
	private int movieNum;
	private String movieName;
	private int releaseYear;
	
	
	void setMovieNum(int mNum) {
		movieNum=mNum;
	}
	
	void getMovieName(String mName) {
		movieName=mName;
	}
	
	void setReleaseYear(int rYear) {
		releaseYear=rYear;
	}
	
	//Return movie number
	int getMovieNum() {
		return movieNum;
	}
	
	//Return movie name
	String getMovieName() {
		return movieName;
	}
	
	//Return movie release year
	int getreleaseYear() {
		return releaseYear;
	}

}
