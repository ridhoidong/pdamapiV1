package com.example.pdamapi.util;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ResponDefault {
	
		public static Map<String, Object> respon(Object status, Object message, Object data){
			Map<String, Object> resultMap = new TreeMap<String, Object>(new DescOrder());
			resultMap.put("status", status);
			resultMap.put("message", message);
			resultMap.put("data", data);
			
			return resultMap;
			
		}
		
		static class DescOrder implements Comparator<String> {
		    @Override
		    public int compare(String o1, String o2) {      
		        return o2.compareTo(o1);
		    }
		 }
}
