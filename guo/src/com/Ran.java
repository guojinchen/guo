package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ran {
	static int count =0;
	static int times=0;
	public static void main(String[] args) {
		
		List list = new ArrayList();
		while(true){
			Object e = new Object();
			list.add(e);
		}
		
		
		/*
		 
		 List a = new ArrayList();//a list 大，其中a中有包含b中的元素的，则选中
		 List b = new ArrayList();
		 a.add('a');
		 a.add('b');
		 a.add('c');
		 b.add('a');
		 b.add('b');
		
			 for(int j=0;j<b.size();j++){
				 if(a.contains(b.get(j)))
					 System.out.println("选中");
				 else 
					 System.out.println("未选中哇");
			 }
			 */
			 		/*float[] num = new float[100]; 
		for(int i=0;i<100;i++){
			 float p = (float)(int)(Math.random()*11+50);
			 num[i]=p;
			 System.out.println(a);
			
		}*/
		// count(num);
		
	}
	public static  void count(float[] num){
		Arrays.sort(num);
		if(count==num.length-1){
			System.out.println(num[count]+"的次数是："+times+1);
			return ;
			}
			else {
				if(num[count]==num[count+1]){
					count++;
					times++;
					count(num);
				}
				else{
					System.out.println(num[count]+"的次数是："+times+1);
					count++;
					times=0;
					count(num);				
				}
	
			}			
		}
}
