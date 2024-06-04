package com.training.movie;

import java.util.*;

public class LinkedlistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer>l1=new LinkedList<>();
		LinkedList<Integer>l2=new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		
		ArrayDeque<Integer>a1=new ArrayDeque<>();
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
			
		}
		
		l1.addAll(l2);
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i)); 
		}
		
	}
	
}


