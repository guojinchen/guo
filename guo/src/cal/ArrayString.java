package cal;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayString {
	public static void main(String[] args) {
		String[] arrayString ={"a","b","c","d","e","f"};
		Random random = new Random();
		int maxCount = 0;
		String maxString ="";
		Map<String,Integer> map  = new HashMap<String,Integer>();  
		System.out.println(map.toString());
	for(int i=0;i<100;i++){
		          int num1= random.nextInt(6);int num2=random.nextInt(6);int num3=random.nextInt(6);
		        String  a=arrayString[num1] ;
		        String  b=arrayString[num2];
		        String  c=arrayString[num3];
		        String sumString=a+b+c;
		        if(num1!=num2&&num2!=num3&&num3!=num1){
		        	String sumStr = a+b+c;
		        	 if(map.containsKey(sumStr)){
		        		 map.put(sumStr,map.get(sumStr)+1);
		        	 }
		        	 else {
		        		 map.put(sumStr, 1);
		        	 }
		        	 
		        	 if(maxCount<map.get(sumStr)){
		        		 maxCount =map.get(sumStr);
		        		 maxString = sumStr;
		        	 } 
		        }
				}
		System.out.println("所有随机字符："+map.toString());
		System.out.println("出现最多的字符串是:"+maxString+",总共出现"+maxCount+"次");
	}

}
