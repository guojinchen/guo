package cal;

import java.util.Arrays;
import java.util.Random;

public class Num {
           public static void main(String[] args) {
			int []arr = new int[100];
        	   Random ran = new Random();
        	   for(int i=0;i<100;i++){
        		   
        	         int a = ran.nextInt(100);
        	         arr[i]=a;
        	   }
        	   Arrays.sort(arr);
        	   System.out.println("small"+arr[0]+"big"+arr[99]);
        	  
        	   
        	   
		}
}
