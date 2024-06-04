package com.training.movie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MyArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int[]arr= new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+10;
			System.out.print("\t"+arr[i]);
	
		} */		
		HashSet<String>hs=new HashSet<String>();
		hs.add("aa");
		hs.add("ab");
		hs.add("ac");
		hs.add("tata");
		hs.add("ad");
		hs.add("cat");
		hs.add("ad");
		hs.add("null");
		
		System.out.println(hs);
		
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			String s1= (String) itr.next();
			System.out.println(itr.next());
		}
			
		
		LinkedList<String>l1= new LinkedList<String>();
		l1.add("Hi");
		l1.add("Sky");
		l1.add("bye");
		l1.add("Fly");
		
		System.out.println(l1);
	
		ArrayList<String>l2= new ArrayList<String>();
		l2.add("Hi");
		l2.add("Sky");
		l2.add("bye");
		l2.add("Fly");
		
		System.out.println(l1);	
		
	}

}
