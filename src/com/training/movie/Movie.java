package com.training.movie;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Movie(int mn,String mName,int rYear){
			movieNum=mn;
			movieName=mName;
			releaseYear=rYear;
		}
		

	Movie hP=new Movie(); //Invokes the zero-arg constructor
			
			System.out.println("Movie Number: "+hP.getMovieNum());
			System.out.println("Movie Name: "+hP.getMovieName());
			System.out.println("Movie Release Year: "+hP.getReleaseYear());
			System.out.println("------------------------------------------");
			
			//Invokes the 3-arg constructor
			
			Movie hP1=new Movie(1,"Harry Potter and the Philosopher's stone",2001);
			
			System.out.println("Movie Number: "+hP1.getMovieNum());
			System.out.println("Movie Name: "+hP1.getMovieName());
			System.out.println("Movie Release Year: "+hP1.getReleaseYear());

	}

}
