package cal;

import java.util.Random;

public class ArrayString {
	public static void main(String[] args) {
		String[] arrayString ={"a","b","c","d","e","f"};
		Random random = new Random();
		for(int i=0;i<100;i++);{
		          int num1= random.nextInt(6);int num2=random.nextInt(6);int num3=random.nextInt(6);
		        String  a=arrayString[num1] ;
		        String  b=arrayString[num2];
		        String  c=arrayString[num3];
		        String sumString=a+b+c;
		        if(a!=b&&b!=c&&a!=c){
		        	
		        	
		        }
		        
		
		
		
		}
	}

}
