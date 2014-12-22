package cal;
public class b4 {
	public static void main(String[] args){
		int i,j;
		int max,min;
		int [][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,90},{15,16,17,18,19}};
		max=0;
		min=100;
		for(i=0;i<4;i++){
			for(j=0;j<5;j++){
	
				if(a[i][j]>=max){
					max=a[i][j];
					}
					if(a[i][j]<min){
						min=a[i][j];
					}	
					 
			}
			 
			
			}		
		System.out.println("最大"+max);
		System.out.println("最小"+min);
	}
}