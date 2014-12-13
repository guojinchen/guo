package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash {
	public static void main(String[] args) {
		 Map map = new HashMap();
		 map.put("1", "abc");
		 map.put("2", "bcd");
		 System.out.println(map.size());
		
		 Iterator it = map.entrySet().iterator();
		 while(it.hasNext()){
			 Map.Entry entry = (Map.Entry)it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("key:"+key+"value:"+value);
		 }
		
		
	}
}
