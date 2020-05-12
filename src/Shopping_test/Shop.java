package Shopping_test;

import java.util.Scanner;

public class Shop {

    public static void shop(){

        System.out.println("请选择投币金额：1.5/2");
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        if (money==1.5 || money==2){
            double cash = money - 1.5;
            System.out.println("请选择想要购买的饮品：可乐/雪碧/红茶");
            Scanner input2 = new Scanner(System.in);
            String goods = input2.nextLine();
            switch (goods){
                case "可乐":
                    System.out.println("你购买了可乐，找零"+cash+"元");
                    break;
                case "雪碧":
                    System.out.println("你购买了雪碧，找零"+cash+"元");
                    break;
                case "红茶":
                    System.out.println("你购买了红茶，找零"+cash+"元");
                    break;
                default:
                    System.out.println("暂无你选购的饮品，是否重新选择其他饮品，YES/NO");
                    Scanner input3 = new Scanner(System.in);

                    String choice2 = input3.nextLine();
                    if (choice2.equals("YES")){
                        System.out.println("**************请重新购买**************");
                        shop();
                    }else{
                        System.out.println("没有你所需饮品，抱歉，再见！");
                    }
            }
        }
        else {
            System.out.println("请输入正确的钱数，1.5或者2");
            System.out.println("请输入是否还继续购买？YES/NO");
            Scanner input4 = new Scanner(System.in);
            String choice = input4.nextLine();
            if (choice.equals("YES")){
                shop();
            }else {
                // do nothing,code nothing
                System.out.println("你未购买任何东西");
            }
        }
    }

    public static void main(String args[]){
        shop();
    }
}
