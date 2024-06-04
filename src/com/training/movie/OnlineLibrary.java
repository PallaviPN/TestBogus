package com.training.movie;

import java.util.Scanner;

class Library {

	String[] Booknames = new String[10];
	String[] issuedbook = new String[10];
    	
	
void addBook(String bookname){
for (int i=0;i<Booknames.length;i++) {
	if(Booknames[i]== bookname) {
		System.out.println("This book already exists, you will be adding duplicate copy");
	}
	
	if(Booknames[i]== null) {
		Booknames[i]= bookname;
		System.out.println("You have successfully added the book" + Booknames[i]); 
	}
	return;
}

 }

void issueBook(){
	System.err.println("Enter no of books that you want to issue");
	Scanner sc=new Scanner(System.in);
	int bookissue= sc.nextInt();
	System.out.println("Enter the names of books you want to issue");
for(int i=0;i<bookissue;i++)
{
issuedbook[i]= sc.nextLine();
}
System.out.println("The names of books you entered are");
for(int i=0;i<issuedbook.length;i++) {
	System.out.println(issuedbook[i]);
}

}

void returnBook(){


}


void showAvailableBooks(){

	for (int i=0;i<Booknames.length;i++) {
		System.out.println(Booknames[i]);
	}

}

  } // end of class Library


public class OnlineLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Library li= new Library();
     //  li.addBook("Heidi");
     //  li.showAvailableBooks();
       li.issueBook();
       li.showAvailableBooks();
       

		}
		
	}


