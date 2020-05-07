package white_box_testing;

import java.text.DecimalFormat;

public class Calculate {

    int n1;  // 有效分数的个数
    int n2;  // 学生人数
    float sum; // 分数总和
    float average; //分数的平均值
    int[] score; // 分数数组

    // 初始化参数，主要是初始化分数数组，便于测试
    public void init(int size){
        n1 = 0;
        n2 = 0;
        score = new int[size];
        for (int i=1;i<=size;i++){
            score[i-1] = i + 1;
        }
    }

    // 计算总和，平均值特征值
    public float calculate_value(int size){
        init(size);
        for (int i=0;i<size;i++){
            if (score[i] != 1 && n2<50){
                n2 = n2 + 1;
                if (score[i]>0 && score[i]<100){
                    n1 = n1 + 1;
                    sum = sum + score[i];
//                    System.out.println(score[i]);
                }
            }
        }
            if (n1>0){
                average = sum / n1;
            }else {
                average = -1;
            }
           DecimalFormat df=new DecimalFormat("0.00");//设置保留位数
           return Float.parseFloat(df.format(average));
    }
}
