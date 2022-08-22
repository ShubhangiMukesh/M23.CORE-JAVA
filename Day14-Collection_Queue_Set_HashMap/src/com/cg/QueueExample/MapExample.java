package com.cg.QueueExample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Character,String> map=new HashMap<Character,String>();
  map.put('s',"Shubhangi");
  map.put('a',"Shubham");
  map.put('p', "Swayam");
  map.put('n',"Jaan");
  map.put('k',"Darling");
  System.out.println(map);
  map.remove('a');
  for(Map.Entry m:map.entrySet())
  {
	  System.out.println(m.getKey()+" "+m.getValue());
	 
  }

	}

}