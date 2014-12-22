package cal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {
	public static void main(String[] args) {
		 
		 Date d = new Date();
		  d.getTime(); 
		            
		fun1();
		Date d1 = new Date();
		fun2();
		Date d2 = new Date();
		System.out.println(d.getSeconds());
		System.out.println(d1.getSeconds());
		System.out.println(d2.getSeconds());	
		System.out.println(d1.getSeconds()-d.getSeconds());
		System.out.println(d2.getSeconds()-d1.getSeconds());
		
		
	}
	
	
    public static void fun1(){
		for(int i=1;i<100000;i++){
		     int a=2;
		}
  }
	public static void 	 fun2(){
		for (int j=4;j<1000000;j++){
		     int b=3;
		}
	}

}
