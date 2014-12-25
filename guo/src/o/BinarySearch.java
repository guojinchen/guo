package o;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]={2,3,4,5};
		//bbSearch(a,2,0,a.length-1);
		bSearch(a,5,0,a.length-1);
	}

//递归
	public static void bSearch(int a[],int key,int low ,int high){
		int mid = (low+high)/2;
		if(a[mid]==key)
               System.out.println("你所要找的数为:"+key+"你所要找的数的位子为："+mid);
		else{
			if(a[mid]>key){
				bSearch(a,key,low,mid-1);
				
			}
			else{
				bSearch(a,key,mid+1,high);
			}
			
		}		
	}
	
	//非递归
	
	public static void bbSearch(int a[],int key,int low ,int high){
		if(a[low]==key){
			 System.out.println("你所要找的数为:"+key+"你所要找的数的位子为："+low);
			
		}
		else if(a[high]==key){
			 System.out.println("你所要找的数为:"+key+"你所要找的数的位子为："+high);
			
		}else {
			int mid = (low+high)/2;
			
		while(a[mid]!=key){
			if(a[mid]>key){
				mid=(low+mid)/2;
			}else 
				mid = (mid+high)/2;
						}
		 System.out.println("你所要找的数为:"+key+"你所要找的数的位子为："+mid);
		}
		
	}

}
