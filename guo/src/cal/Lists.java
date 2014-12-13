package cal;

import java.util.LinkedList;
import java.util.ListIterator;
public class Lists {
 public static void main(String[] args)   {
	LinkedList  linklist = new LinkedList();
	
	for(int i=0;i<10;i++){
		int a = (i+1)/2;
	 System.out.println(a);
	linklist.add(a, i);
	 
}
	 ListIterator it =  linklist.listIterator(0);
	      while(it.hasNext()){
	    	  System.out.println("I"+it.next());    	 
	      }
 }
}
