package cal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Number {
	public static void main(String[] args) {
		 
		findTheMaxAndMinNumber();
		
		
		
		
		
			
	}
	public static int[] generateHundredNumber(){
		int [] list = new int[100];
		for(int i=0;i<100;i++){
			Random random = new Random();
			int a= random.nextInt(100);
			list[i]=a;
		}		
		return list;
	}
	public static void  findTheMaxAndMinNumber(){
		int []tt=  generateHundredNumber();
		     
		       
		for(int i=0;i<tt.length-1;i++){
			for(int j=0;j<tt.length-1-i;j++){
		 
			if( tt[j]> tt[j+1]){ 
				int temp;
				temp = tt[j];
				tt[j]=tt[j+1];
				tt[j+1]=temp;
	 
			}	
			}
		}
		 
			System.out.println("最小："+tt[0]+"最大："+tt[99]);
		 
		 
	 
		 
	}

}
