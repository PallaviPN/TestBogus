package com.training.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractice {
	
	public static void main(String[] args) {
		
  // List
		
		List<String>list= new ArrayList<String>();
		list.add("Hi1");
		list.add("Hi2");
		list.add("Hi3");
		list.add("Hi4");
		list.add("Hi5");
		list.add("Hi6");
		list.add("Hi7");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		Map<String,String>map= new HashMap<String,String>();
		map.put("1","chose 1 option");
		map.put("2","chose 2 option");
		map.put("3","chose 3 option");
		map.put("4", "chose 4 option");
		
	 for(int i=0;i<map.size();i++)
	 {
		 System.out.println("The value of key is" + map.values());
	 }
		
	}

}
