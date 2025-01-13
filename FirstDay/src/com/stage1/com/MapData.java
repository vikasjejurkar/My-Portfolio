package com.stage1.com;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapData {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(2, "Hemant");
		map.put(1, "Vikas");
		map.put(3, "Ranjeet Sir");
		System.out.println("MapData:"+map.size());
		map.put(1, "Sanket");
		System.out.println("MapData:"+map);
		if(map.containsKey(1)) {
			System.out.println("Not Exist Key");
			map.remove(3);
			System.out.println(map);
			
			
		for(Entry<Integer, String> e:map.entrySet()) {
			
			System.out.println(e.getKey()+""+e.getValue());
			
			
			
		}
			
			
		}

		

	}

}
