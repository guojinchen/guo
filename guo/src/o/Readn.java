package o;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Readn {
	public static void main(String[] args) throws Exception {
		Readn r = new Readn();
		r.test1();
 	}
	
	 public void test1() throws Exception{
	        boolean ret = true;
	        File file = new File("d:\\d.txt");
	    
	        
	        FileInputStream fl = new 	FileInputStream(file);
	        
	        InputStreamReader rs = new InputStreamReader(fl);
	          String str  = "";
	         int ch =0;
	          while((ch=rs.read())!=-1){
	        	  
	        	  str = str+(char)ch;
	        	  
	          }
	          System.out.println(str);
	          String[] strs =str.split(",");    
	          int array[] = new int[str.length()]  ;
	           for(int i=0;i<strs.length;i++){
	        	   
	        	   
	        	   
	        	   array[i]= Integer.parseInt(strs[i]);
	        	   try{
	        	          if(array[i]>100 || array[i]<0){
	        	        	  System.out.println("成绩异常");
	        	throw new Exception("成绩异常");
	        	}
	        	          else if(array[i]>=60){
	   	        		   System.out.println("及格");
	   	        	   }else{
	   	        		   System.out.println("不及格");
	   	        	   }
	        	        }catch (java.lang.ArithmeticException e){
	        	            System.out.println("test, catch exception");
	        	            throw new Exception("成绩异常");
	        	        }finally{
	        	        	
	        	        }
	        	   
	        	   
	        	   
	      	   
	           }
	              
	          }
}
