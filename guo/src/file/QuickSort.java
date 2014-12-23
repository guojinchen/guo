package file;

import sun.security.util.Length;

public class QuickSort {
	public static void main(String[] args) { 
		
	
		QuickSort qs =new QuickSort();
		int a[] = {44,22,2,32,54,22,88,77,99,11};
		qs.list = a;
		qs.quickSort(0,qs.list.length-1);
		
		for(int i=0;i<qs.list.length;i++){
			System.out.print(qs.list[i]+"  ");
		}
		
		
	}
	
		
		
		/**
		 * 对其中部分进行排序 返回中间量
		 */
		public int  partion(int []list,int left,int right){
		
			int key  = list[left];
			while(left<right){
				
				
			
				while(left<right&&list[right]>=key)
					right--;
				list[left]=list[right];
				
				while(left<right&&list[left]<=key)
					left++;
				
					list[right]=list[left];
				
			}
			        list[left]=key;
			return left;
		}
		
		private int [] list;
		/**
		 * 对数组进行快速排序
		 */
		public void  quickSort(int left,int right){
			if(left<right){
		
				int middle = partion(list,left,right);
			 
				quickSort(left,middle-1);
				quickSort(middle+1,right);
				
			}
			
			
		}
	 	
		/**
		 * 检查数组是否为空
		 */
		public void quick(int []list){
			if(list.length>0){
			
				 quickSort(0,list.length-1);
			}
		}
	 
	}
	