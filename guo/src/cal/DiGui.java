package cal;

import java.util.Arrays;

//在50到60的范围内随机生成100个随机数（随机数有三位有效数字）(用递归)，并统计出现次数。

public class DiGui {
	 static int timeCount;
	 static int TimeTime;//在递归的时候计算每个元素的重复的值，
	 public static void main(String[] args) {
	  double []aa = new double[100];
	  for(int i = 0;i<aa.length;i++){
	   aa[i] = (double)(int)(Math.random()*11+50);
	  }
	  count(aa);
	 }
	 public static void count(double[]aa){ //这是一个超级牛逼哄哄的方法，随便什么类型的数组都能实现数出来，不过得先排序
	  {
	   Arrays.sort(aa);
	  }
	  if(timeCount==aa.length-1){
	   System.out.println(aa[timeCount]+"在随机数中，一共出现了"+(TimeTime+1)+"次");
	   return;
	  }
	  else{
	  if(aa[timeCount]==aa[timeCount+1]){
	     TimeTime++;
	    timeCount++;
	    count(aa);
	    }
	  else{
	   System.out.println(aa[timeCount]+"在随机数中，一共出现了"+(TimeTime+1)+"次");
	   TimeTime=0;
	   timeCount++;
	  count(aa);
	 }
}
	}}