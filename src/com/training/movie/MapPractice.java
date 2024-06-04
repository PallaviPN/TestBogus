package com.training.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String>m1= new HashMap<String,String>();
		m1.put("name", "Pallavi");
		m1.put("height", "(5'.3'')");
		m1.put("address","homeaddress");
		m1.put("insurance", "Aetna");
		
		// Retrieve the values of map
		
		System.out.println(m1);
		
		
		
	//use Entry & entry set for iterating. note- iterator cannot be used because map is not a collection
		
		for(Map.Entry<String,String> var:m1.entrySet())
		{
			System.out.println(" The Key is" +);
		}

		
		
		
		
		}
		
	

}
