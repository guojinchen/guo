package com;

public class lianxi {
   public static void main(String[] args) {
	  
	   int a,b,c ;
	      for (int j=101 ; j<1000;j++){
		    a = j/100;
		    b = j%100/10;
		    c=  j%10;
		    if ((a*a*a +b*b*b+c*c*c)==j){
		    	System.out.println("j+"+j);
		    }	   
	   }	   
}
}
