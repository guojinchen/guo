package file;




public class Construct {

    public void drinksType()            //添加说明 为了使用方便  单独定义

    {

       System.out.println("1.可乐(120日元)");

       System.out.println("2.橙汁(80日元)");

       System.out.println("3.绿茶(150日元)");

    }

    public void moneyType()            //添加说明 为了使用方便  单独定义

    {

       System.out.println("1：10日元");

       System.out.println("2：50日元");

       System.out.println("3：100日元");

       System.out.println("4：500日元");

       System.out.println("5：1000日元");

    }

 

}

 

 

 

 

package LevelSecond;

 

import java.util.Scanner;

 

public class AutoSaleMachine {

 

    public static void main(String[] args) {

       try {

           Construct cons = new Construct();          //调用Construct对象

           cons.drinksType();

           System.out.println("请选择饮品:");

           Scanner in = new Scanner(System.in);       //系统输入所选择的饮品号码

           int Id = in.nextInt();

           Product p = new Product();                 //调用Product中的Pro方法得出用户所选的饮品

           p.Pro(Id);

       } catch (Exception e) {

           System.out.println("输入无效");            //控制用户选择饮品

           e.printStackTrace();

       }

    }

}

 

 

 

 

 

 

 

package LevelSecond;

 

public class Product {

    public void Pro(int Id)

    {

       Construct cons = new Construct();

       Calculate cal = new Calculate();

       switch(Id)

       {

         case 1 :

             System.out.println("您选择的是可乐,请按一下规定现金付款。");//投入金额的面值的提示

             cons.moneyType();                                         //告知用户选用的饮品

             cal.Cal(120);                                             //调用Calculate的计算方法Cal

             break;

         case 2 :

             System.out.println("您选择的是橙汁,请按一下规定现金付款。");

             cons.moneyType();

             cal.Cal(80);

             break;

         case 3 :

             System.out.println("您选择的是绿茶,请按一下规定现金付款。");

             cons.moneyType();

             cal.Cal(80);

             break;

         default:

             System.out.println("错误");

             break;

       }

    }

}

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

package LevelSecond;

 

import java.util.Scanner;

 

 

public class Calculate {

    int backPay;                                       //定义找零

    int totalPay;                                      //定义总金额 

    public void Cal(int Price)

    {

       Scanner in = new Scanner(System.in);

        System.out.println("请投币...");               //投入硬币

        totalPay = in.nextInt();

        BaseCalculate bc = new BaseCalculate();        //调用BaseCalculate的计算方法

        if(totalPay==Price)

        {

        bc.Equal();                                //调用BaseCalculate中的Equal方法

        }

        else if(totalPay>Price)

        {

        bc.More(Price,backPay,totalPay);            //调用BaseCalculate中的More方法

        }

        else

        {

        for(int i=0;totalPay<Price;i++)             //当投入金额小于饮品价格时，提示继续投币

        {

            Scanner input = new Scanner(System.in);

            System.out.println("请继续投币...");

            int everyPay = input.nextInt();

            totalPay+=everyPay;

        }

        if(totalPay==Price)                         //当再次投币出现投币金额=价格时，调用BaseCalculate中的Equal方法

            {

            bc.Equal();

            }

        else

        {

            bc.More(Price,backPay,totalPay);        //当再次投币出现投币金额>价格时，调用BaseCalculate中的More方法

        }

        }

    }

}

 

 

 

 

 

 

package LevelSecond;

 

public class BaseCalculate {

    public void Equal()                                    //当投入硬币和价格相同时

    {

       System.out.println("找零为0元");

       System.out.println("500日元:"+0+"枚");        

       System.out.println("100日元:"+0+"枚");        

       System.out.println("50日元:"+0+"枚");         

       System.out.println("10日元:"+0+"枚");  

    }

    public void More(int Price,int backPay,int totalPay)   //当投入硬币总数大于价格总数时

    {

    backPay=totalPay-Price;                            //找零金额=总金额-饮品价格

       int fiveHp = backPay/500;                          //求出找零中的500日元有几张

       int fiveHRemain = backPay-fiveHp*500;

       int oneHp = fiveHRemain/100;                       //求出找零中的100日元有几张

       int oneHRemain = fiveHRemain-oneHp*100;

       int fiftyp = oneHRemain/50;                        //求出找零中的50日元有几张

       int fiftyRemain = oneHRemain-fiftyp*50;

       int tenp = fiftyRemain/10;                         //求出找零中的10日元有几张

       System.out.println("找零为:"+backPay+"分别为:");         

       System.out.println("500日元:"+fiveHp+"枚");          

       System.out.println("100日元:"+oneHp+"枚");       

       System.out.println("50日元:"+fiftyp+"枚");       

       System.out.println("10日元:"+tenp+"枚");  

    }

}

 

