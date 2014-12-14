package cal;

import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
		int days = 0,d = 0;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("输入年：");
		int year = scanner.nextInt();
		System.out.println("输入yue：");
		int month = scanner.nextInt();
		System.out.println("输入ri：");
		int day = scanner.nextInt();
		for(int i=1;i<month;i++){
		switch(i){
		case 1:
		case 3:	
		case 5:
		case 7:
		case 9:
		case 11:
			days = 31;
		case 4:
		case 6:	
		case 8:
		case 10:
		case 12:
		   days=30;
		case 2:
			if(year%400==0||year % 4 == 0 && year % 100 != 0){
				days=29;
			}
			else{
				days=28;
			}
			break;
			
		}
		d+=days;
		
		
		
		}
		System.out.println(d);
		
	}

}
