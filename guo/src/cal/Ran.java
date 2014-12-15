package cal;

import java.util.Random;

public class Ran {
	public static void main(String[] args) {
		int[] array = new int[100];
		for(int i=0;i<100;i++){
		     array[i]=(int)(Math.random()*10+50);	
		}
		int a0=0, a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0;
		for(int j=0;j<array.length;j++){
			System.out.println(array[j]);
		switch(array[j]){
		case 50 : a0++;break;
		case 51 : a1++;break;
		case 52 : a2++;break;
		case 53 : a3++;break;
		case 54 : a4++;break;
		case 55 : a5++;break;
		case 56 : a6++;break;
		case 57 : a7++;break;
		case 58 : a8++;break;
		case 59 : a9++;break;
		case 60 : a10++;break;
		 
		}
			}
		System.out.println("50出现次数："+a0++);
		System.out.println("51出现次数："+a1++);
		System.out.println("52出现次数："+a2++);
		System.out.println("53出现次数："+a3++);
		System.out.println("54出现次数："+a4++);
		System.out.println("55出现次数："+a5++);
		System.out.println("56出现次数："+a6++);
		System.out.println("57出现次数："+a7++);
		System.out.println("58出现次数："+a8++);
		System.out.println("59出现次数："+a9++);
		System.out.println("60出现次数："+a10++);
		
		
	}

}
