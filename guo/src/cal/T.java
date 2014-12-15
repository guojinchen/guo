package cal;

public class T {
	public static void main(String[] args) {
		int[] result = new int[11];
		int[] num = new int[100];
		for(int j=0;j<11;j++)
	           result[j]=0;
		for(int i=0;i<100;i++){
			   num[i]= (int) (Math.random()*11+50);
			   result[num[i]-50]++;
		}
		
		for(int i=50;i<=60;i++){
		System.out.println(i+"ss"+result[i-50]);
		}
		
		
		
	}

}
