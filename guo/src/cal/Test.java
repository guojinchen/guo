package cal;
 
public class Test{ 
public void test(int number[],int n,int count[]){
	for(int i=0;i<100;i++){
		if(n==number[i])
			++count[number[i]-50];
	}
	for(int i=0;i<11;i++)
System.out.println("i+50"+":"+count[i]);
}
public Test(int number[]){
	int count[]=new int[11];
 for(int i=50;i<=60;i++)
	 test(number,i,count);
	}
public static void main(String[] args) { 
	int[] number=new int [100]; 
	
	//生成随机数100个
	for(int i=0;i<100;i++) 
	{
	int j=(int) (Math.random()*11+50);
	number[i]=j;
	System.out.print(number[i]+","); 
	}
	new Test(number);

}

	
} 

