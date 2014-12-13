package cal;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	
	public void panduan(String str1,String str2){
		 if(str1==str2){
			 System.out.println("==");
		 }
		  if(str1!=str2){
			 System.out.println("!=");
		 }
		  if(str1.equals(str2)){
			 System.out.println("equals");
		 }
		  if(!str1.equals(str2)){
			 System.out.println("!equals");
		 }
 	}
	 public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		 t1.level=9;
		 t2.level=47;
		 System.out.println("t1.level:"+t1.level+"   t2.level:"+t2.level);
		 t1=t2;
		 System.out.println("t1.level:"+t1.level+"    t2.level:"+t2.level);
		 t1.level=7;
		 System.out.println("t1.level:"+t1.level+"    t2.level:"+t2.level);
		 System.out.println("-----------------");
		 
		 Random r= new Random();
		int a = r.nextInt(10);
		 System.out.println("a: "+a);
		 
		 System.out.println("________________________________");
		 Test t= new Test();
		 t.panduan("ttt", "ttt");
		 t.panduan("ottt", "ttttt");
		 String st = new String("a");
		 String st2 = new String("a");
		 System.out.println(st==st2);
		 System.out.println(st!=st2);
		 
		 
		 int []shuzu = {1,2,3,4,5,6};
		 ArrayList array = new ArrayList();
		 
		 for(int i:shuzu){
			 array.add(i);
			 System.out.println(i);
		 }
		 for(Object i :array){
			 
			 System.out.println("array"+i);
		 }
		 Random ran = new Random();
		 int []shu = new int[9];
		 for(int i=0;i<9;i++){
			 shu[i] = ran.nextInt(100);
		 }
		 
		 for(int i : shu){
			 System.out.println("iiiiii"+i);
		 }

		}
}
