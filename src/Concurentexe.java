import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class Concurentexe {
	
	public static void main(String[] args) {
		
		
		  ArrayList<String> list = new ArrayList<String>();
		  
		  list.add("hi");
		  list.add("hello");
		  list.add("how");
		  list.add("are");
		  list.add("u");
		  
		  
		 
		  
		  Iterator<String> itr = list.iterator();
		  
		  while(itr.hasNext()){
		  
		  
		  
		  list.add("hiiii");
		  
		  System.out.println(itr.next());
		  
		  }
		 
		/*
		 * List<String> empList = new CopyOnWriteArrayList<String>();
		 * empList.add("Mojtaba"); empList.add("Mojtabye"); empList.add("Yeganeh");
		 * 
		 * Iterator<String> it = empList.iterator(); while (it.hasNext()) {
		 * 
		 * String value = it.next(); if(value.equals("Mojtaba"))
		 * empList.remove("Mojtabye"); empList.add("hiii");
		 * 
		 * } System.out.println(empList);
		 */
		
		/*
		 * ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<String,Integer>
		 * (); map.put("one", 1); map.put("two", 2); map.put("three", 3);
		 * map.put("four", 4);
		 * 
		 * 
		 * Iterator<String> itr = map.keySet().iterator();
		 * 
		 * while(itr.hasNext()) {
		 * 
		 * String key =itr.next();
		 * 
		 * System.out.println(key + " " +map.get(key));
		 * 
		 * map.put("five", 5);
		 * 
		 * 
		 * 
		 * }
		 */
	}

}
